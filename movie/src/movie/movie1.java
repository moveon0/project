package movie;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class movie1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie1 window = new movie1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public movie1() {
		initialize();
	}
	
	class  imagePanel extends JPanel {
		private Image img;
		
		

		

		public  imagePanel(Image img) {
			this.img = img;
			setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
			setLayout(null);
		}
		
		public void paintComponenet(Graphics g) {
			g.drawImage(img	, 0, 0, null);
		}
			
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 891, 739);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		imagePanel panel = new imagePanel(new ImageIcon("C:\\javaproject\\work\\movie\\src\\movie\\image\\criminal.jpg").getImage());
		
		panel.setBounds(46, 196, 217, 334);
		frame.getContentPane().add(panel);
		frame.pack();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(398, 196, 217, 334);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(739, 196, 217, 334);
		frame.getContentPane().add(panel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(894, 10, 120, 70);
		
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(46, 540, 217, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(398, 540, 217, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(739, 540, 217, 36);
		frame.getContentPane().add(btnNewButton_1_1);
	}
}
