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

public class PreviousButton extends JFrame {

       private JFrame previousFrame;

       public PreviousButton(JFrame previousFrame) {
           this.previousFrame = previousFrame;

           setTitle("마이 페이지");
           setSize(1200, 800);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setLayout(new FlowLayout());
          getContentPane().setLayout(null);

           // Back button
          JButton btn1 = new JButton("영화현황");
           JButton btn2 = new JButton("예매영화");
           JButton backButton = new JButton("뒤로");
           btn1.setBounds(1, 10, 1200, 100);
           btn2.setBounds(1, 170, 122, 30);
           backButton.setBounds(1, 580, 100, 30);
           
          getContentPane().add(btn1);
          getContentPane().add(btn2);
           
           backButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   // Close the current frame
                   dispose();
                   // Show the previous frame
                   previousFrame.setVisible(true);
               }
           });

           getContentPane().add(backButton, BorderLayout.CENTER);
       }

       
   }