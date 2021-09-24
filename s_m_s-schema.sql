CREATE DATABASE s_m_s;
CREATE TABLE students(
    id LONG AUTO_INCREMENT,
    first_name VARCHAR(20) NOT NULL ,
    last_name VARCHAR(20),
    email VARCHAR(30),
    PRIMARY KEY (id)
);
