# NodeJS: Promise - Async & Await

## I. Easy

#### 1. Tạo 1 promise trả về kết quả thành công (resolve) sau 2 giây

#### 2. Tao 1 promise trả về lỗi (reject) sau 3 giây

## II. Normal

#### 1. Tạo 1 hàm async nhận vào 1 array chứa các số nguyên, trả về lỗi nếu 1 trong số các phần tử < 0

```javascript
async function checkNegative(arr) {
    /// write your own implementation
}

/// Test cases

await checkNegative([1,2,3]) // [1,2,3]
await checkNegative([1,2,-3]) // throw error
```

#### 2. Với hàm đã khai báo ở trên, tạo 1 hàm mới để xử lý lỗi khi hàm trên trả về thất bại

```javascript
async function handleException(arr) {
    /// Write code to handle exception from bellow function
    checkNegative(arr)
}

/// Test cases
notThrowException(await handleException([1,2,-3])
```

#### 3. Hãy làm cho hàm bên dưới trả về với thời gian ngắn nhất

```javascript
/**
* @params {number} time | Time as second
*/
async function wait(time, returnValue) {
    return new Promise((resolve, reject) => setTimeOut(time * 1000, () => resolve(returnValue)));
}

/// Test cases
1. Gọi hàm `wait` 2 lần với tham số lần lượt là
wait(1)
wait(2)
=> Test case này đúng khi kết quả trả về trong vòng 2s
2. Gọi hàm `wait` 3 lần với tham số lần lượt là
wait(1)
wait(1)
wait(1)
=> Test case này đúng khi kết quả trả về trong vòng 1s
```

