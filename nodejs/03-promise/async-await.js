import { wait } from "./promise-object.js";

async function log(message, time) {
    await wait(time);
    console.log(message);
}


log("first", 2);
log("second", 1);
log("third", 3);