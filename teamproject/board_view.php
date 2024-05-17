<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8">
<title>내 손안의 여행기</title>
<link rel="stylesheet" type="text/css" href="./css/common1.css">
<link rel="stylesheet" type="text/css" href="./css/board.css">
</head>
<body> 
<header>
    <?php include "header.php";?>
</header>  
<section>
	<div id="main_img_bar">
        <img src="./img/main_img1.png">
    </div>
   	<div id="board_box">
	    <h3 class="title">
			최근 여행기 > 내용보기
		</h3>
<?php
	$num  = $_GET["num"];
	$page = isset($_GET["page"]) ? $_GET["page"] : 1;
	$con = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");
	$sql = "select * from post where num=$num";
	$result = mysqli_query($con, $sql);

	$row = mysqli_fetch_array($result);
	$id      = $row["id"];
	$name      = $row["name"];	
	$regist_day = $row["regist_day"];
	$subject    = $row["subject"];
	$content    = $row["content"];
	$file_name    = $row["file_name"];
	$file_type    = $row["file_type"];
	$file_copied  = $row["file_copied"];
	$hit          = $row["hit"];

	$content = str_replace(" ", "&nbsp;", $content);
	$content = str_replace("\n", "<br>", $content);

	$new_hit = $hit + 1;
	$sql = "update post set hit=$new_hit where num=$num";   
	mysqli_query($con, $sql);
?>		
	    <ul id="view_content">
			<li>
				<span class="col1"><b>제목 :</b> <?=$subject?></span>
				<span class="col2"><?=$name?> | <?=$regist_day?></span>
			</li>
			<li>
				<?php
					if($file_name) {
						$real_name = $file_copied;
						$file_path = "./data/".$real_name;
						$file_size = filesize($file_path);
						echo "▷ 첨부파일 : $file_name ($file_size Byte) &nbsp;&nbsp;&nbsp;&nbsp;
			       		<a href='board_download.php?num=$num&real_name=$real_name&file_name=$file_name&file_type=$file_type'>[저장]</a><br><br>";
						   echo "<img src='$file_path' alt='첨부 이미지' style='max-width: 500px;'><br>";
			           	}
				?>
				
				
				<?=$content?>
			</li>		
	    </ul>
	    <ul class="buttons">
				<li><button onclick="location.href='board_list.php?page=<?=$page?>'">목록</button></li>
				<li><button onclick="location.href='board_modify_form.php?num=<?=$num?>&page=<?=$page?>'">수정</button></li>
				<li><button onclick="location.href='board_delete.php?num=<?=$num?>&page=<?=$page?>'">삭제</button></li>
				<li><button onclick="location.href='board_form.php'">글쓰기</button></li>
		</ul>

		    <!-- 댓글 폼 추가 -->
            <div id="comment_form">
                <h3>댓글 작성</h3>
                <form action="add_comment.php" method="post">
                    <input type="hidden" name="board_num" value="<?=$num?>">
                    <label for="comment_writer">작성자:</label>
                    <input type="text" name="comment_writer" required>
                    <br>
                    <label for="comment_content">댓글 내용:</label>
                    <textarea name="comment_content" rows="4" required></textarea>
                    <br>
                    <input type="submit" value="댓글 등록">
                </form>
            </div>

			<div id="comment_list">
				<h3>댓글 목록</h3>
				<?php
					// 데이터베이스 연결
					$conn = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");

					// 연결 확인
					if ($conn->connect_error) {
						die("Connection failed: " . $conn->connect_error);
					}

					// 댓글 목록을 가져오는 쿼리
					$board_num = $_GET['board_num'];
					$sql = "SELECT * FROM comments WHERE post_id = '$post_id' ORDER BY created_at DESC";	
					$result = $conn->query($sql);

					if ($result->num_rows > 0) {
						// 결과에서 각 댓글을 출력
						while ($row = $result->fetch_assoc()) {
							echo "<strong>작성자:</strong> " . htmlspecialchars($row["post_id"]) . "<br>";
							echo "<strong>내용:</strong> " . htmlspecialchars($row["comment_content"]) . "<br>";
							// 추가: 날짜 및 시간 표시
							echo "<strong>작성일:</strong> " . htmlspecialchars($row["created_at"]) . "<br>";
							echo "<hr>";
						}
					} else {
						echo "댓글이 없습니다.";
					}

					// 데이터베이스 연결 종료
					$conn->close();
				?>
			</div>

            
	</div> <!-- board_box -->
</section> 
<footer>
    <?php include "footer.php";?>
</footer>
</body>
</html>
