import http from "node:http";
import url from "node:url";


const server = http.createServer((request, response) => {

    const urlParsed = url.parse("http://localhost:8081" + request.url);

    if (urlParsed.pathname === "/sum") {
        const [a, b] = urlParsed.query.split('&');
        const sum = parseInt(a.split('=')[1]) + parseInt(b.split('=')[1]);

        response.writeHead(200, { 'content-type': 'application/json' });
        response.end(JSON.stringify({
            sum: sum,
        }));

        return;
    }

    response.writeHead(200, { 'content-type': 'application/json' });
    response.end(JSON.stringify({
        message: "hello world",
    }));
});


server.listen(8081);