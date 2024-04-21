package movie;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cardLayoutDemo extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    
    public cardLayoutDemo() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        
        JButton button1 = new JButton("프레임 1");
        JButton button2 = new JButton("프레임 2");
        
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "frame1");
            }
        });
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "frame2");
            }
        });
        
        JPanel frame1 = new JPanel();
        frame1.add(new JLabel("프레임 1"));
        
        JPanel frame2 = new JPanel();
        frame2.add(new JLabel("프레임 2"));
        
        cardPanel.add(frame1, "frame1");
        cardPanel.add(frame2, "frame2");
        
        getContentPane().add(cardPanel, BorderLayout.CENTER);
        getContentPane().add(button1, BorderLayout.NORTH);
        getContentPane().add(button2, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new cardLayoutDemo();
            }
        });
    }
}
