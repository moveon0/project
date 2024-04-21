package movie;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class panel1 extends JPanel {
    public panel1() {
        setLayout(new FlowLayout()); // FlowLayout으로 레이아웃 설정
        JLabel imglabel = new JLabel();

        ImageIcon icon = new ImageIcon("C:\\javaproject\\work\\movie\\src\\movie\\image\\criminal.PNG");
        Image img = icon.getImage();
        Image updateImg = img.getScaledInstance(200, 300, Image.SCALE_DEFAULT);
        ImageIcon updateIcon = new ImageIcon(updateImg);
        imglabel.setIcon(updateIcon);

        add(imglabel); // 중앙 패널에 추가
    }
}

class panel2 extends JPanel {
    public panel2() {
        setLayout(new FlowLayout()); // FlowLayout으로 레이아웃 설정
        JLabel imglabel = new JLabel();

        ImageIcon icon = new ImageIcon("C:\\javaproject\\work\\movie\\src\\movie\\image\\panda.png");
        Image img = icon.getImage();
        Image updateImg = img.getScaledInstance(200, 300, Image.SCALE_DEFAULT);
        ImageIcon updateIcon = new ImageIcon(updateImg);
        imglabel.setIcon(updateIcon);

        add(imglabel); // 중앙 패널에 추가
    }
}

class panel3 extends JPanel {
    public panel3() {
        setLayout(new FlowLayout()); // FlowLayout으로 레이아웃 설정
        JLabel imglabel = new JLabel();

        ImageIcon icon = new ImageIcon("C:\\javaproject\\work\\movie\\src\\movie\\image\\sugar.jpg");
        Image img = icon.getImage();
        Image updateImg = img.getScaledInstance(200, 300, Image.SCALE_DEFAULT);
        ImageIcon updateIcon = new ImageIcon(updateImg);
        imglabel.setIcon(updateIcon);

        add(imglabel); // 중앙 패널에 추가
    }
}



public class imagedemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("영화예매");
        frame.setBounds(0, 0, 1200, 800);
        frame.setLayout(new FlowLayout()); // FlowLayout으로 프레임의 레이아웃 설정

        // 중앙 패널 생성
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout()); // 중앙 패널에도 FlowLayout 사용
        frame.add(centerPanel); // 프레임에 중앙 패널 추가

        // 각 패널을 중앙 패널에 추가하여 화면 정중앙에 배치
        centerPanel.add(new panel1());
        centerPanel.add(new panel2());
        centerPanel.add(new panel3());

        frame.setVisible(true);
    }
}


