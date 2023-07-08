# Mock Interview Questions

## I. Java Basic

1. Java là gì? Java có điểm gì mạnh so với những ngôn ngữ khác?
2. Package trong Java có thể cho chúng ta biết những thông tin gì?
3. Sự khác nhau giữa so sánh sử dụng '==' và 'equals'
4. Có mấy cách khởi tạo biến trong Java? Liệt kê chúng.
5. Có mấy cách khởi tạo 1 vòng lặp trong Java? Liệt kê chúng
6. So sánh primitive và wrapper type
7. Hãy so sánh String và `char`
8. Hãy so sánh `int` và Integer
9. Hãy so sánh `int` và `long` / `double` và `float`
10. Hãy giải thích về keyword `static`?
11. Overload method là gì? Bài toán mà overload method giải quyết?
12. Hãy liệt kê những tính chất của access modifier `public` / `private` / `protected` /`default`
13. Hãy nêu ra 1 trường hợp ở đó nên sử dụng access modifier `public` / `private` / `protected` /`default`
14. Có mấy loại lỗi trong Java? Hãy liệt kê chúng?
15. Làm thế nào để sử lý Checked Exception / UnChecked Exception?
16. Khi 1 đoạn code trả về nhiều hơn 1 loại lỗi, chúng ta phải làm thế nào để xử lý?



## II. Java Advance

### 1. Overview

1. Máy ảo (Virtual Machine) trong Java là gì?
2. Hãy so sánh giữa JVM vs JDK vs JRE
3. Java8 có những điểm gì mới so với cách phiên bản trước?
4. Java11 có những điểm gì mới so với Java8?

### 2. OOP

1. Object là gì?
2. OOP là gì? Nó sinh ra để giải quyết vấn đề gì?
3. Hãy liệt kê các tính chất của OOP?
4. Hãy mô tả chi tiết 1 tính chất của OOP (Encapsulation, Inheritant, Abstraction, Polymorphism)? Chúng giải quyết bài toán gì? Cho 1 ví dụ.
5. Cho bài toán 'abc', hãy áp dụng 1 trong những tính chất của OOP để giải
6. Hãy mô tả về class / abstract class / interface? Bản chất của chúng là gì và dùng để giải quyết vấn đề nào?
7. So sánh Class và Abstract Class
8. So sánh Abstract Class và Interface? Ta sử dụng chúng trong trường hợp nào.
9. Abstract method là gì? Khi nào nên sử dụng
10. Override là gì? @Override dùng để làm gì?
11. Overload là gì? Cách để Overload 1 method trong Java

### 3. Collection & Array

1. Mảng là gì? Tính chất của mảng? Cách khởi tạo 1 mảng?
2. Làm sao để truy cập vào đầu hoặc cuối mảng?
3. Làm sao để mở rộng 1 mảng?
4. Collection là gì? So sánh collection và mảng? Collection được sinh ra để giải quyết bài toán gì?
5. List là gì? ArrayList là gì? So sánh giữa List và ArrayList
6. LinkedList là gì? So sánh giữa ArrayList và LinkedList
7. HashMap là gì? HashSet là gì? So sánh giữa HashMap và HashSet

### 4. Design Pattern

1. Design Pattern là gì? Tại sao lại cần đến design pattern? Liệt kê 1 số Singleton mà bạn biết
2. Singleton là gì? Chúng ta sử dụng nó để giải quyết bài toán gì?
3. Dependency Injection là gì?

### 5. Annotation

1. Annotation là gì? Nó có chức năng gì?
2. Cách để khởi tạo 1 annnotation

## III. Spring

1. Spring Framework là gì? Spring Boot là gì? Sự khác nhau giữa chúng
2. Spring Framework có kiến trúc như thế nào?
3. Có mấy cách để khởi tạo Bean? Hãy liệt kê chúng
4. Có mấy cách để sử dụng Bean? Hãy liệt kê chúng
5. Quy trình khởi tạo Bean và Inject Bean diễn ra ntn?
6. Bean Scope là gì? Bean Scope mặc định của Bean là gì? Ngoài Scope mặc định ra, có những loại nào khác? Hãy liệt kê chúng.
7. @Controller là gì? @RestController là gì? So sánh sự khác nhau.
8. @RequestMapping là gì?
9. ResponseEntity là gì? Nó giải quyết bài toán nào?
10. @PathVariable là gì? @RequestParam là gì? Hãy liệt kê những trường hợp nên sử dụng các annotation này
11. Sử dụng annotation nào để lấy được Body / Header / Cookie từ request

## IV. Database

1. Database là gì? Nó dùng để giải quyết vấn đề gì?
2. Hãy liệt kê những loại database mà bạn biết? Ưu và nhược điểm của chúng.
3. Hãy giải thích về khái niệm primary key, foreign key
4. Trong Relational Database, có thể tồn tại những mối quan hệ nào? Hãy liệt kê chúng? Hãy thử thiết kế bảng có mối quan hệ với bảng khác
5. Index trong database là gì? Hãy giải thích cách nó hoạt động.
6. Trong SQL, lệnh `join` được dùng để làm gi?
7. Sự khác nhau giữa `left join`, `inner join`, `right join`?
8. Trong SQL, lệnh `group by` được dùng để làm gì?
9. Trong SQL, lệnh `having` được dùng để làm gì?
10. Cho bảng `User` có mối quan hệ 1-n với bảng `Order`, hãy viết lệnh SQL tính tổng `Order` của 1 `User`
11. Hãy viết lệnh SQL để khởi tạo 1 bảng
12. Transaction là gì?

## V. Spring Data JPA & Hibernate

1. JPA là gì? JPA và Hibernate có gì khác nhau?
2. ORM là gì?
3. JDBC là gì? Làm sao để tạo 1 kết nối xuống database?
4. So sánh InMemory Database và Traditional Database
5. Làm sao để cài Spring nhận biết bảng cần tạo khi cài đặt code?
6. Để xác định mỗi quan hệ giữa các bảng, ta có thể sử dụng những annotation nào?
7. Làm sao để khởi tạo bảng với Id tự động tăng?
8. Sư khác nhau giữa `FetchType.LAZY` và `FetchType.EAGER`
9. Cách cài đặt và sử dụng Transaction trong Spring?
