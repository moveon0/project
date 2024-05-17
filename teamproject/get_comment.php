<?php

// 데이터베이스 연결
$conn = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");

// 연결 확인
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// 게시물 ID를 받아옴 (예: $_GET['post_id'])
$post_id = 1;

// 해당 게시물에 속한 댓글을 가져옴
$sql = "SELECT * FROM comments WHERE post_id = '$post_id'";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // 댓글을 반복하여 출력
    while ($row = $result->fetch_assoc()) {
        echo "<p>{$row['username']} 님의 댓글: {$row['comment_text']}</p>";
    }
} else {
    echo "댓글이 없습니다.";
}

// 데이터베이스 연결 종료
$conn->close();
?>