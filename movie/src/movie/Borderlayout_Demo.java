package movie;

import javax.swing.*;
import java.awt.*;

public class Borderlayout_Demo extends JFrame {
    public Borderlayout_Demo() {
        setTitle("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);

        // 전체 프레임의 레이아웃을 BorderLayout으로 설정
        setLayout(new BorderLayout());

        // 센터에 일자로 버튼 3개를 넣을 패널 추가
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20)); // 가운데 정렬, 가로 간격 20, 세로 간격 20
        
        // 버튼 1 추가
        JButton button1 = new JButton("Button 1");
        centerPanel.add(button1);

        // 버튼 2 추가
        JButton button2 = new JButton("Button 2");
        centerPanel.add(button2);

        // 버튼 3 추가
        JButton button3 = new JButton("Button 3");
        centerPanel.add(button3);

        add(centerPanel, BorderLayout.CENTER);

        // 오른쪽 위에 버튼 추가
        JPanel topRightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // 오른쪽 정렬
        JButton myPageButton = new JButton("마이페이지");
        topRightPanel.add(myPageButton);

        add(topRightPanel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Borderlayout_Demo frame = new Borderlayout_Demo();
            frame.setVisible(true);
        });
    }
}

