CREATE TABLE Post (
    PostID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    UserID int NOT NULL,
    Title VARCHAR(255) NOT NULL,
    Content TEXT,
    ImagePath VARCHAR(255),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);
