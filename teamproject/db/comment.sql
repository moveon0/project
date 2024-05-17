CREATE TABLE Comment (
    CommentID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    UserID int NOT NULL,
    PostID int NOT NULL,
    Content TEXT,   
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (PostID) REFERENCES Post(PostID)
);
