<?php

// 데이터베이스 연결
$conn = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");

// 연결 확인
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// 사용자로부터 입력받은 댓글 정보
$post_id = mysqli_real_escape_string($conn, $_POST['post_id']); // Escape 문자열을 처리합니다.
$username = mysqli_real_escape_string($conn, $_POST['username']);
$comment_text = mysqli_real_escape_string($conn, $_POST['comment_text']);

// 댓글을 데이터베이스에 저장
$sql = "INSERT INTO comments (post_id, username, comment_text) VALUES ('$post_id', '$username', '$comment_text')";

if ($conn->query($sql) === TRUE) {
     echo "댓글이 등록되었습니다.";
} else {
     "Error: " . $sql . "<br>" . $conn->error;
}

// 데이터베이스 연결 종료
$conn->close();
?>
