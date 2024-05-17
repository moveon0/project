

<?php
// 데이터베이스 연결
$conn = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");

// 연결 확인
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// 특정 사용자의 게시물만 가져오는 쿼리
$id = mysqli_real_escape_string($conn, $_GET['id']);
$sql = "SELECT * FROM posts WHERE id = '$id'";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // 결과에서 각 게시물을 출력
    while ($row = $result->fetch_assoc()) {
        echo "<strong>작성자:</strong> " . htmlspecialchars($row["id"]) . "<br>";
        echo "<strong>내용:</strong> " . htmlspecialchars($row["post_content"]) . "<br>";
        echo "<hr>";
    }
} else {
    echo "해당 사용자의 게시물이 없습니다.";
}

// 데이터베이스 연결 종료
$conn->close();
?>