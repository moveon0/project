package movie;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import java.awt.event.*;
import java.awt.*;
import java.io.Closeable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import javax.swing.JFrame;

public class my_Page extends JFrame {

    private JFrame previousFrame; // 이전 프레임을 저장할 변수

    public my_Page(JFrame previousFrame) {
        this.previousFrame = previousFrame; // 생성자에서 이전 프레임을 받아 저장한다.

        setTitle("마이 페이지"); // 프레임 제목 설정
        setBounds(350, 150, 1200, 800); // 프레임 위치와 크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료 설정
        setLayout(new FlowLayout()); // 레이아웃 설정
        getContentPane().setLayout(null); // 컨텐트팬에 대한 레이아웃 설정

        // Back button
        JButton btn1 = new JButton("영화현황"); // 버튼 생성
        JButton btn2 = new JButton("예매영화"); // 버튼 생성
        JButton backButton = new JButton("홈"); // 뒤로 가는 버튼 생성
        btn1.setBounds(1, 10, 1200, 100); // 버튼 위치와 크기 설정
        btn2.setBounds(1, 170, 122, 30); // 버튼 위치와 크기 설정
        backButton.setBounds(1, 580, 100, 30); // 버튼 위치와 크기 설정

        getContentPane().add(btn1); // 컨텐트팬에 버튼 추가
        getContentPane().add(btn2); // 컨텐트팬에 버튼 추가

        // 뒤로 가는 버튼에 대한 ActionListener 설정
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 현재 프레임을 닫음
                dispose();
                // 이전 프레임을 보이도록 함
                previousFrame.setVisible(true);
            }
        });

        getContentPane().add(backButton, BorderLayout.CENTER); // 컨텐트팬에 뒤로 가는 버튼 추가
    }

    public static void main(String[] args) {
        
                // 첫 번째 프레임
                JFrame firstFrame = new JFrame("영화 예매 시스템"); // 프레임 생성
                firstFrame.setBounds(350, 150, 1200, 800); // 프레임 위치와 크기 설정
                firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료 설정
                
                firstFrame.setLayout(null); // 레이아웃 설정

                // 두 번째 프레임으로 넘어가는 버튼 생성
                JButton my_Page_button = new JButton("마이페이지");
                my_Page_button.setBounds(1000, 1, 200, 100); // 버튼 위치와 크기 설정

                // 넘어가는 버튼에 대한 ActionListener 설정
                my_Page_button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 현재 프레임을 닫음
                        firstFrame.setVisible(false);
                        // 두 번째 프레임 열기
                        JFrame secondFrame = new my_Page(firstFrame); // 두 번째 프레임 생성
                        secondFrame.setVisible(true); // 프레임 보이도록 설정
                    }
                });

                firstFrame.getContentPane().add(my_Page_button, BorderLayout.CENTER); // 첫 번째 프레임에 버튼 추가
                firstFrame.setVisible(true); // 프레임 보이도록 설정
            }
        
    
}
