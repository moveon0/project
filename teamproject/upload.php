<?php
// 데이터베이스 연결 설정
$servername = "localhost";
$username = "user1";
$password = "12345";
$dbname = "yunyj";

// 데이터베이스 연결
$conn = new mysqli($servername, $username, $password, $dbname);

// 연결 확인
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// 업로드된 파일의 정보
$file_name = $_FILES['image']['name'];
$file_tmp = $_FILES['image']['tmp_name'];
$file_size = $_FILES['image']['size'];
$file_error = $_FILES['image']['error'];

// 파일 확장자 확인
$file_ext = strtolower(pathinfo($file_name, PATHINFO_EXTENSION));

// 허용된 파일 확장자
$allowed_ext = array('jpg', 'jpeg', 'png', 'gif');

if (in_array($file_ext, $allowed_ext)) {
    if ($file_error === 0) {
        // 파일 크기 제한 (1MB)
        if ($file_size <= 1048576) {
            // 파일 저장 경로
            $file_destination = 'uploads/' . $file_name;

            // 파일을 지정된 경로로 이동
            move_uploaded_file($file_tmp, $file_destination);

            // 데이터베이스에 이미지 정보 저장
            $sql = "INSERT INTO images (file_name, file_path) VALUES ('$file_name', '$file_destination')";
            if ($conn->query($sql) === TRUE) {
                echo "업로드 및 데이터베이스 저장 완료!";
            } else {
                echo "데이터베이스 저장 중 오류가 발생했습니다.";
            }
        } else {
            echo "파일이 너무 큽니다.";
        }
    } else {
        echo "파일 업로드 중 오류가 발생했습니다.";
    }
} else {
    echo "허용되지 않는 파일 형식입니다.";
}

// 데이터베이스 연결 종료
$conn->close();
?>
