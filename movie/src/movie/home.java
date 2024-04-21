package movie;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class my_Page extends JPanel {
    JButton page = new JButton("마이페이지");
    JPanel topRightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // 오른쪽 정렬

    my_Page() {
        topRightPanel.add(page); // "마이페이지" 버튼을 topRightPanel에 추가
    }

    public JPanel get_button() {
        return topRightPanel;
    }
}

public class home {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("영화예매");
        my_Page a = new my_Page();
        f.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20)); // 가운데 정렬, 가로 간격 20, 세로 간격 20
        JButton m1 = new JButton("영화1");
        JButton m2 = new JButton("영화2");
        JButton m3 = new JButton("영화3");

        centerPanel.add(m1);
        centerPanel.add(m2);
        centerPanel.add(m3);
        
        f.add(a.get_button(), BorderLayout.NORTH); // "마이페이지" 버튼을 프레임의 상단에 추가
        f.add(centerPanel, BorderLayout.CENTER); // 영화 버튼들을 프레임의 중앙에 추가

        f.setBounds(0, 0, 1200, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
