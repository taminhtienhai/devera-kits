# NodeJS Module: Import & Export

## I. Easy

#### 1. Tạo file `math.js` bên trong định nghĩa các hàm cơ bản như `add`, `subtract`, `multiply`, `divide`. Import file này vào `index.js` và gọi các hàm đã định nghĩa.

#### 2. Tạo file `constants.js`, bên trong định nghĩa các biến `const`. Import file này ở `index.js` và thử sử dụng các biến đã khai báo.

#### 3. Tạo file `entities.js` bên trong định nghĩa các `class`. Import file này ở `index.js` và thử sử dụng các `class` đã khai báo.

## II. Normal

#### 1. Cài đặt thư viện `uuid` vào `dependencies`. Thử import và sử dụng.

#### 2. Cài đặt thư viện bất kỳ, tạo ra 1 file mới và khởi tạo 1 hàm có sử dụng thư viện này. Import file vừa khởi tạo vào `index.js` và sử dụng hàm đã khai báo.

#### 3. Cài đặt 1 thư viện bất kỳ vào `devDependencies`, tạo 1 test suit để kiểm tra giá trị trả về từ hàm và thư viện này cung cấp

```javascript
/// testsuit.test.js
import { test } from "node:test";
```



## III. Hard

#### 1. Sử dụng module `fs`, 1 trong những package được cung cấp sẵn bởi NodeJS. Tạo file `files.js`, trong đó định nghĩa 1 hàm có tham số truyền vào là đường dẫn tới 1 file, trả về nội dung của file đó.

```javascript
/// files.js

import * from 'node:fs';

export function readFile(path) {
    /// Your implementation go here
}
```

#### 2. Sử dụng module `http`,  1 trong những package được cung cấp sẵn bởi NodeJS. Tạo file `server.js` bên trong khai báo hàm `start`, có chức năng tạo ra 1 server chạy ở port `8001`.