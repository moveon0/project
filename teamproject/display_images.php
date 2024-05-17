<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>이미지 표시</title>
</head>
<body>

<?php
// 데이터베이스 연결 설정
$servername = "localhost";
$username = "user1";
$password = "12345";
$dbname = "yunyj";

// 데이터베이스 연결
$con = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");

// 연결 확인
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// 데이터베이스에서 이미지 정보 가져오기
$sql = "SELECT * FROM images";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // 이미지를 반복하여 출력
    while ($row = $result->fetch_assoc()) {
        $file_path = $row['file_path'];
        echo '<img src="' . $file_path . '" alt="' . $row['file_name'] . '"><br>';
    }
} else {
    echo "이미지가 없습니다.";
}

// 데이터베이스 연결 종료
$conn->close();
?>

</body>
</html>