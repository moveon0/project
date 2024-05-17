package movie;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MoviePanel extends JPanel {
    protected JPanel buttonPanel;
    protected JButton nextButton;

    public MoviePanel(String imagePath) {
        setLayout(null);
        setBounds(0, 0, 1080, 455);
        
        JPanel moviePanel = new JPanel();
        moviePanel.setBounds(110, 150, 200, 300);
        
        JLabel imglabel = new JLabel();
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT);
        ImageIcon updateIcon = new ImageIcon(img);
        imglabel.setIcon(updateIcon);
        
        moviePanel.add(imglabel);
        add(moviePanel);
    }
}

class MoviePage extends JFrame {
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public MoviePage() {
        setTitle("영화예매");
        setLayout(null);
        setBounds(350, 150, 1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardPanel = new JPanel();
        cardPanel.setBounds(0, 100, 1200, 800);
        cardPanel.setLayout(new CardLayout());
        cardPanel.setBackground(Color.yellow);

        MoviePanel[] moviePanels = {
            new MoviePanel("C:\\javaproject\\work\\movie\\src\\movie\\image\\criminal.PNG"),
            new MoviePanel("C:\\javaproject\\work\\movie\\src\\movie\\image\\panda.png"),
            new MoviePanel("C:\\javaproject\\work\\movie\\src\\movie\\image\\sugar.jpg"),
            new MoviePanel("C:\\javaproject\\work\\movie\\src\\movie\\image\\pamyo.jpg"),
        };

        for (MoviePanel panel : moviePanels) {
            cardPanel.add(panel);
        }

        cardLayout = (CardLayout) cardPanel.getLayout();

        JButton nextButton = new JButton("다음");
        nextButton.setBounds(1080, 250, 100, 100);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        add(cardPanel);
        add(nextButton);
        setVisible(true);
    }
}

public class homedemo1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MoviePage();
            }
        });
    }
}
