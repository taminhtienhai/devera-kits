CREATE TABLE `user` (
    id bigint unsigned AUTO_INCREMENT NOT NULL,
    name varchar(20),
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    jwt_token varchar(255),

    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
    PRIMARY KEY (id),
    UNIQUE (username),
    KEY (username, jwt_token)
);