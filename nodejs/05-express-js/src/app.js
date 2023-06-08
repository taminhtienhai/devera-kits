const express = require("express");
const app = express();

/// Import 3 sub routes
const bookRoute = require('./routes/book');
// const employeeRoute = require('./routes/employee');
// const customerRoute = require('./routes/customer');
const uploadRoute = require('./routes/fileupload');


app.use('/book', bookRoute);
app.use(uploadRoute);
// app.use('/employee', employeeRoute);
// app.use('/customer', customerRoute);

app.listen(8001);