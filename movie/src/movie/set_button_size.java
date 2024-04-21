package movie;

import java.awt.FlowLayout;

import javax.swing.*;

public class set_button_size {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("Button Position Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 버튼 생성
        JButton button = new JButton("Click Me");

        // 버튼의 위치와 크기를 지정하여 프레임에 추가
        button.setBounds(100, 100, 100, 50); // x좌표, y좌표, 가로길이, 세로길이
        frame.add(button);

        // 프레임 크기 설정 및 표시
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout()); // 레이아웃 매니저를 null로 설정
        frame.setVisible(true);
    }
}
