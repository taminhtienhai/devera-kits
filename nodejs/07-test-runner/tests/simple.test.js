import { test, describe, beforeEach, afterEach } from "node:test";
import assert from "node:assert";


async function wait(second, rs) {
    return new Promise((resolve, reject) => setTimeout(() => resolve(rs), second * 1_000));
}

test("Should pass", async () => {
    await assert.doesNotReject(() => wait(0.5, "a"));
});

describe("Test suit", () => {


    afterEach((t) => {
        console.log(performance.now() - t.start);
    })

    beforeEach((t) => {
        console.log("Prepare to run a test");

        t.start = performance.now();
    })

    test("Test 1", (t) => {
        assert.ok(true);
    });

    test("Test 2", () => {
        assert.ok(true);
    });
});

test('mocks a counting function', (t) => {
    let cnt = 0;
  
    function addOne() {
      cnt++;
      return cnt;
    }
  
    function addTwo() {
      cnt += 2;
      return cnt;
    }
  
    // Perform `addTwo` 2 time before back to origin method `addOne`
    const fn = t.mock.fn(addOne, addTwo, { times: 2 });
  
    assert.strictEqual(fn(), 2);
    assert.strictEqual(fn(), 4);
    assert.strictEqual(fn(), 5);
    assert.strictEqual(fn(), 6);
  });