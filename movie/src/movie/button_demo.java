package movie;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class button_demo {
	public static void main(String[] args) {
		JFrame f = new JFrame("ActionEvent 처리");
		f.setLayout(new FlowLayout());
		
		//버튼 객체 생성하기
		JButton jbtn1 = new JButton("입력");
		JButton jbtn2 = new JButton("확인");
		JButton jbtn3 = new JButton("옵션");
		JButton jbtn4 = new JButton("메시지");
		
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		f.add(jbtn4);
		
		//버튼 별 이벤트 만들기
		ActionListener al = new ActionListener() {
			
			//버튼을 눌렀을 때 호출되는 메서드
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				case "입력":
					String name = JOptionPane.showInputDialog(f,"이름을 입력하세요");//부모,내용
					System.out.println(name);
					break;
					
				case "확인":
					int con = JOptionPane.showConfirmDialog(f, "확인?");
					break;
					
				case "옵션":
					String[] option = {"검색", "추가", "취소"};
					JOptionPane.showOptionDialog(f, 
							"원하는 직업 선택", 
							"옵션 대화상자", 
							JOptionPane.YES_NO_CANCEL_OPTION, 
							JOptionPane.INFORMATION_MESSAGE, 
							null, 
							option, 
							option[0]);
					break;
				
				case"메시지":
					JOptionPane.showMessageDialog(f, "메시지 대화상자");
				}
				
				
			}
		};
		
		//버튼에 만든 이벤트 붙히기
		jbtn1.addActionListener(al);
		jbtn2.addActionListener(al);
		jbtn3.addActionListener(al);
		jbtn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		f.setBounds(300,300,500,400);
		f.setVisible(true);
		//f.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
	}
}