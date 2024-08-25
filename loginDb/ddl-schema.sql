CREATE SCHEMA loginDb;
USE loginDb;

CREATE TABLE tbl_user (
    user_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_username VARCHAR(50) NOT NULL,
    user_password VARCHAR(300) NOT NULL,
    user_email VARCHAR(50) NOT NULL,
    user_fullname VARCHAR(50) NOT NULL,
    user_created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    user_updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    user_active TINYINT(1) DEFAULT 1,
    user_role ENUM('ADMIN', 'USER') DEFAULT 'USER',
    user_locked TINYINT(1) DEFAULT 0,
    user_locked_at TIMESTAMP
);