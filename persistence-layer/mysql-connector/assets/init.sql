-- Active: 1686147599944@@127.0.0.1@4306
create database `devera`;

use `devera`;

CREATE TABLE `customer` (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(20),
    address VARCHAR(100),
    phone VARCHAR(50),

    PRIMARY KEY (id)
);