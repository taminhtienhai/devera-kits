# ExpressJS

## I. Easy

#### 1. Sử dụng ExpressJS, tạo 1 server trả về bất kỳ kết quả nào khi gọi

#### 2. Khởi tạo server với đường dẫn `/method`, hãy trả về các kết quả khác nhau tương ứng với các method GET, PUT, POST, DELETE

#### 

## II. Normal

#### 1. Tạo server với đường dẫn `/student/{name}` với method GET, trả về kết quả "Hello {name}" tương ứng với param truyền vào

Ví dụ:

```
GET http://localhost:8001/student/diana
```

Sẽ trả về kết quả: "Hello diana"

#### 2. Tạo server với đường dẫn `POST /student`, message body có cấu trúc `{ message: string }`, khi gọi trả về response có cấu trúc `{ response: {body.message} }`.

Ví dụ:

```
POST http://localhost:8001/student --body '{ message: "Hello everyone" }'
```

Sẽ trả về kết quả:

```json
{
    "response": "Hello everyone"
}
```

#### 3. Tạo server với đường dẫn `GET /student`, khi gọi api với query sẽ trả về json tương ứng với query đã truyền vào

Ví dụ:

```
GET http://localhost:8001/student?name=diana&major=marketing&sex=female
```

Sẽ trả về kết quả:

```json
{
    "name": "diana",
    "major": "marketing",
    "sex": "female"
}
```

#### 4. Tạo server với đường dẫn `POST /info`, tạo 1 middleware để kiểm tra xem body có tồn tại key `username` và `password` hay không, nếu không có trả về lỗi `401`.

Ví dụ:

```
POST http://localhost:8001/info --body '{ username: "abc" }'
```

Sẽ trả về kết quả:

```json
// with status code 401
{
    "error": "Password is required"
}
```

Ví dụ:

```
POST http://localhost:8001/info --body '{ username: "abc", password: "123" }'
```

Sẽ trả về kết quả:

```json
{
    "message": {
        "username": "abc",
        "login_date": "2023-04-22T10:00:00Z" // Current time
    }
}
```



## III. Hard

#### 1. Tạo server với đường dẫn `GET /users`, trong đó gọi đến 1 service khác trả về danh sách các users

Gợi ý:

- Sử dụng các trang tạo mock data như [dummyjson.com](https://dummyjson.com/) hoặc [jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com/) (easy)
- Query dữ liệu từ database bất kỳ (hard)

Ví dụ:
```
GET http://localhost:8001/users
```

Sẽ trả về kết quả:

```json
[
  {
    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "address": {
      "street": "Kulas Light",
      "suite": "Apt. 556",
      "city": "Gwenborough",
      "zipcode": "92998-3874",
      "geo": {
        "lat": "-37.3159",
        "lng": "81.1496"
      }
    },
    "phone": "1-770-736-8031 x56442",
    "website": "hildegard.org",
    "company": {
      "name": "Romaguera-Crona",
      "catchPhrase": "Multi-layered client-server neural-net",
      "bs": "harness real-time e-markets"
    }
  },
  {
    "id": 2,
    "name": "Ervin Howell",
    "username": "Antonette",
    "email": "Shanna@melissa.tv",
    "address": {
      "street": "Victor Plains",
      "suite": "Suite 879",
      "city": "Wisokyburgh",
      "zipcode": "90566-7771",
      "geo": {
        "lat": "-43.9509",
        "lng": "-34.4618"
      }
    },
    "phone": "010-692-6593 x09125",
    "website": "anastasia.net",
    "company": {
      "name": "Deckow-Crist",
      "catchPhrase": "Proactive didactic contingency",
      "bs": "synergize scalable supply-chains"
    }
  }
]
```



#### IV. Very Hard

#### 1. Tạo 1 api cho phép upload hình ảnh , đồng thời tạo 1 api cho phép tìm kiếm hình ảnh theo tên file đã lưu

Gợi ý:

- Sử dụng thư viện `multer` (easy)
- Sử dụng package sẵn có của NodeJS (hard)

#### 2. Tạo 1 api đăng nhập, khóa người dùng nếu nhập sai quá 5 lần