<div id="main_img_bar">
            <!-- 최근 게시 글 DB에서 불러오기 -->
<?php
    $con = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");
    $sql = "select * from post order by num desc limit 3";
    $result = mysqli_query($con, $sql);

    if (!$result)
        echo "아직 게시글이 없습니다!";
    else
    {
        echo '<div id="main_img_bar">';
        while ($row = mysqli_fetch_array($result))
        {
            $regist_day = substr($row["regist_day"], 0, 10);
            $file_copied = $row["file_copied"];
            $file_path = "./data/".$file_copied;

            echo '<a href="board_view.php?num=' . $row["num"] . '">';
            echo '<img src="' . $file_path . '" alt="최근 여행기 이미지" width="200" height="150" style="margin-right: 15px;"></a>';
        }
        echo '</div>';
    }
?>
        </div>
        <div id="main_content">
            <div id="latest">
                <h4>최근 여행기</h4>
                <ul>
<!-- 최근 게시 글 DB에서 불러오기 -->
<?php
    $con = mysqli_connect("localhost", "cy031009", "cy100903!!", "cy031009");
    $sql = "select * from post order by num desc limit 5";
    $result = mysqli_query($con, $sql);

    if (!$result)
        echo "아직 게시글이 없습니다!";
    else
    {
        while( $row = mysqli_fetch_array($result) )
        {
            $regist_day = substr($row["regist_day"], 0, 10);
?>
                <li>
                    <a href="board_view.php?num=<?= $row["num"] ?>">
                    <span class="sr-only"><?=$row["subject"]?></span>
                    </a>
                    <span><?=$row["name"]?></span>
                    <span><?=$regist_day?></span>                
                </li>
<?php
        }
    }
?>
            </div>
            <div id="point_rank">
                <h4>추천 여행가</h4>
                <ul>
<!-- 포인트 랭킹 표시하기 -->
<?php
    $rank = 1;
    $sql = "select * from user order by point desc limit 5";
    $result = mysqli_query($con, $sql);

    if (!$result)
        echo "아직 가입된 회원이 없습니다!";
    else
    {
        while( $row = mysqli_fetch_array($result) )
        {
            $name  = $row["name"];        
            $id    = $row["id"];
            $point = $row["point"];
            $name = mb_substr($name, 0, 1)." * ".mb_substr($name, 2, 1);
?>
                <li>
                    <span><?=$rank?></span>
                    <span><?=$name?></span>
                    <span><?=$id?></span>
                    <span><?=$point?></span>
                </li>
<?php
            $rank++;
        }
    }

    mysqli_close($con);
?>
                </ul>
            </div>
        </div>