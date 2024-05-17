CREATE TABLE User (
    UserID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Name char(10) NOT NULL,
    Email char(80) NOT NULL,
    Password char(15) NOT NULL
);
