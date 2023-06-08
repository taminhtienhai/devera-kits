# Java Basic: Control Statement

## I. If-else

#### 1. Cho thang điểm từ 0 - 100, sinh viên được xếp hạng dựa trên thứ tự như sau

- Từ 80 - 100 tương ứng thang điểm A
- Từ 60 - 79 tương ứng thang điểm B
- Từ 40 - 59 tương ứng thang điểm C
- Từ 20 - 39 tương ứng thang điểm D
- Từ 0 - 19 tương ứng thang điểm E

Tạo 1 method cho phép in ra thang điểm tương ứng với số điểm nhập vào

```java
// 0 <= score <= 100
void evaluate(int score) {
    /// write your own implementation
}
```

#### 2. Tạo 1 method so sánh 2 số nguyên, trả về -1 nếu `a < b`, trả về 0 nếu `a == b` và 1 nếu `a > b`

```java
int compare(int a, int b) {
    /// write your ơn implementation
}
```

#### 3. Tạo 1 method nhận vào 1 số nguyên, in ra màn hình "Fizz" nếu số đó chia hết cho 3, "Buzz" nếu số đó chia hết cho 5 và "Fizz Buzz" nếu chia hết cho cả 2

```java
void fizzBuzz(int value) {
    /// write your ơn implementation
}
```



#### 4. Tạo 1 method nhận vào 1 số nguyên dương, số này tương ứng với năm (year), trả về 1 nếu số này thuộc về năm nhuận và 0 nếu ngược lại

Gợi ý: Năm nhuận là năm chia hết cho 4

```java
int isLeapYear(int year) {
    /// write your own implementation
}
```

#### 5. Cho 3 cánh cổng A, B, C, D, người chơi sẽ phải chọn 1 trong 4 dựa trên những điều kiện sau đây.

- Chọn cánh cổng A, nếu `health > 80` và `attack > 20`
- Chọn cánh cổng B nếu `health == 30` và `attack == 30`
- Chọn cánh cổng C nếu `health < 20` hoặc `attack <= 20`
- Chọn cánh cổng D nếu không đủ điều kiện chọn 1 trong 3 cổng trên

Tạo 1 method nhận vào tham số `int health` và `int attack`, trả về tên cánh cổng mà người chơi chọn

```java
String chooseGate(int health, int attack) {
    /// Write your own implementation
}
```

