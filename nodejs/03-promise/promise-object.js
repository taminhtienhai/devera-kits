export function wait(second) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("");
        }, second * 1000);
    })
}

// wait(2).then(res => console.log(res));
