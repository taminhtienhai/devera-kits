# Java Basic: Method

#### 1. Tạo hàm tính diện tích hình chữ nhật

```java
int squareArea(int width, int height) {
    /// write your own implementation
}

/// Test caases
squareArea(2,4) // 8
squareArea(12,3) // 36
```

#### 2. Tạo hàm tính giai thừa của 1 số nguyên

```java
int factorial(int n) {
    /// write your own implementation
}

/// Test cases
factorial(4) // 24
factorial(5) // 120
```

#### 3. Tạo hàm tăng giá trị của số được truyền vào lên 1 đơn vị

```java
class IntValue {
    int v;
}

void increase(IntValue v) {
    /// write your own implementation
}

/// Test cases
increase(new IntValue(1)) // IntValue { int v = 2 }
```

#### 4. Tạo hàm nhận vào không giới hạn 1 danh sách các String, trả về kết quả sau khi nối chuỗi

```java
String joinStr(String delimiter, String... strs) {
    
}

/// Test cases
joinStr(",", "a", "b") // "a,b"
joinStr("-", "x", "y", "z") // "x-y-z"
```



