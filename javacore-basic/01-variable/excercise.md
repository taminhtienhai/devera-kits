# Chương 1: Variable

## Bài tập

#### Bài 1: Định nghĩa các biến có kiểu dữ liệu lần lượt là **byte**, **String**, **char**, **int**, **long**, **double**, **float**.

#### Bài 2: Định nghĩa biến `n: long` có giá trị mặc định bằng `1`, tạo hàm nhận vào tham số `m: int`, tính giai thừa  của `m` và gán giá trị trả về vào biến `n`

```java
void factorial(m: int) {
    int n;
    /// Implementation go here
    return n;
}
```



#### Bài 3: Tạo class `Computer`, khai báo biến static `cpu: int` có giá trị mặc định bằng `4`. Tạo hàm trả về biến này.

```java
public class Computer {
    static int cpu;
    
    /// Write method return variable `cpu`
}
```

#### Bài 4: Tạo hàm nhận vào 1 tham số có kiểu giá trị `boolean`, trả về giá trị trái với giá trị nhận được.

Ví dụ:

```java
boolean toogle(a: boolean) {
    /// Your implementation go here
}

assert toogle(true) == false;
```

#### Bài 5: Cho 1 hàm nhận vào 1 tham số có kiểu dữ liệu `short`, hãy dự đoán kết quả trả về và comment lại kết quả bên cạnh lệnh gọi hàm, sau đó chạy thử để kiểm tra kết quả

```java
short multiply2(short v) { return v * 2; }

multiply2(-1); // Give your answer here
multiply2(1.2);
multiply2(0);
multiply2(10_000);
multiply2(100_000);
```

#### Bài 6: Cho hàm nhận vào 1 tham số có kiểu dữ liệu `char`, hãy dự đoán kết quả trả về và comment lại kết quả bên cạnh lệnh gọi hàm, sau đó chạy thử để kiểm tra kết quả

```java
char acii(char c) { return c; }

acii('a'); // Give your answer here
acii('ab');
acii("a");
acii(65);
acii(6.5);
```

