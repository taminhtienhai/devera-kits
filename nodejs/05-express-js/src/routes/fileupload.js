const express = require('express');
const { writeFile } = require('fs/promises');
const path = require('path');

const router = express.Router();

router.post('/upload', async (req, res) => {

    let data = '';
    req.on('data', (chunk) => {
        data += chunk;
    });

    req.on('end', () => {
        const { filename, fileContent } = extractFileData(data, req);

        writeFile(path.resolve('assets', 'pic', filename), fileContent).then(() => {
            res.end();
        }).catch(error => res.status(500).json({ error }));
    });
});

/**
 * @param {string} data 
 * @param {import('express').Request} req 
 */
function extractFileData(data, req) {
    const boundary = getBoundary(req.headers['content-type']);
    const parts = data.split(boundary);
    const fileContentStartIndex = parts[0].indexOf('application/octet-stream') + 'application/octet-stream'.length;

    console.log(parts);

    return {
        filename: getFileName(parts[1]),
        fileContent: parts[0].substring(fileContentStartIndex, parts[0].length - 2) // Remove leading and trailing newlines
      };
}

/**
 * 
 * @param {string} content 
 * @returns 
 */
function getFileName(content) {
    const fileIndex = content.indexOf('filename=');
    const start = fileIndex + 'filename='.length;
    const end = start + 10;
    return content.substring(start, end);
}

/**
 * @param {string} contenTypeHeader 
 * @returns 
 */
function getBoundary(contenTypeHeader) {
  const boundaryIndex = contenTypeHeader.indexOf('boundary=');
  return contenTypeHeader.substring(boundaryIndex + 'boundary='.length);
}

module.exports = router;