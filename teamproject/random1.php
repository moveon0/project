<?php
// 데이터베이스 연결
$con = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");

// 연결 오류 체크
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}

// name과 subject 정보 추출
$sql = "SELECT name FROM members ORDER BY RAND() LIMIT 1";
$result = mysqli_query($con, $sql);

// 결과에서 한 행을 가져옴
$row = mysqli_fetch_assoc($result);

// 연결 해제
mysqli_close($con);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>랜덤 유저 정보</title>
</head>
<body>
    <h1>랜덤 게시물 정보</h1>

    <?php
    if ($row) {
        echo "<p><strong>작성자:</strong> " . $row['name'] . "</p>";
        
    } else {
        echo "<p>게시물 정보를 찾을 수 없습니다.</p>";
    }
    ?>
</body>
</html>
