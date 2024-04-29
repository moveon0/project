package movie;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

// 날짜 및 시간대

//시간대 버튼 클래스

class Time_Button extends JRadioButton {
	private String Times;

	Time_Button(String Time) {
		Times = Time;
		setText(Times);
		setOpaque(true);
		Font font = this.getFont();
		setFont(new Font(font.getFontName(), Font.BOLD, 18));
		//선택 시간 반환
		addActionListener(e -> {
            System.out.println(get_Times());
            
        });
	}
	
	
	public String get_Times() {
		return Times;
	}
}


class date extends JLabel {
	private String date;

	public date(String date) {
		this.date = date;
		setText(date);
		setOpaque(true);
		setBounds(10, 0, 120, 100);
		// 폰트 설정
		Font font = getFont();
		setFont(new Font(font.getFontName(), Font.BOLD, 30));
		setHorizontalAlignment(CENTER);

	}

	public String getdate() {
		return date;
	}
}
// 5/2
class date1 extends JPanel {
	public date1(ButtonGroup group) {
		setBounds(0, 180, 1200, 100);
		setLayout(null);

		date date = new date("5/2");
		add(date);
		// 시간 선택 버튼

		Time_Button radioButton1 = new Time_Button("9:30 ~ 11:19");
		Time_Button radioButton2 = new Time_Button("12:00 ~ 13:49");
		Time_Button radioButton3 = new Time_Button("16:00 ~ 17:49");
		Time_Button radioButton4 = new Time_Button("19:00 ~ 20:49");

		radioButton1.setOpaque(false);
		radioButton2.setOpaque(false);
		radioButton3.setOpaque(false);
		radioButton4.setOpaque(false);

		radioButton1.setBounds(150, 25, 150, 60);
		radioButton2.setBounds(350, 25, 150, 60);
		radioButton3.setBounds(550, 25, 150, 60);
		radioButton4.setBounds(750, 25, 150, 60);

		// 라디오 버튼을 그룹으로 묶기

		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		group.add(radioButton4);

		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		add(radioButton4);

	}
}

//5/3
class date2 extends JPanel {
	public date2(ButtonGroup group) {
		setBounds(0, 300, 1200, 100);
		setLayout(null);

		date date = new date("5/3");
		add(date);

		// 시간 선택 버튼

		Time_Button radioButton1 = new Time_Button("8:30 ~ 10 : 19");
		Time_Button radioButton2 = new Time_Button("12:00 ~ 13 : 49");
		Time_Button radioButton3 = new Time_Button("18:00 ~ 19:49");
		Time_Button radioButton4 = new Time_Button("21:00 ~ 22:49");

		radioButton1.setOpaque(false);
		radioButton2.setOpaque(false);
		radioButton3.setOpaque(false);
		radioButton4.setOpaque(false);

		radioButton1.setBounds(150, 25, 150, 60);
		radioButton2.setBounds(350, 25, 200, 60);
		radioButton3.setBounds(550, 25, 200, 60);
		radioButton4.setBounds(750, 25, 150, 60);
		// 라디오 버튼을 그룹으로 묶기

		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		group.add(radioButton4);

		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		add(radioButton4);
	}
}

//5/4
class date3 extends JPanel {

	public date3(ButtonGroup group) {
		setBounds(0, 420, 1200, 100);
		setLayout(null);

		date date = new date("5/4");
		add(date);

		// 시간 선택 버튼

		Time_Button radioButton1 = new Time_Button("12:30 ~ 14 : 19");
		Time_Button radioButton2 = new Time_Button("15:10 ~ 16 : 59");
		Time_Button radioButton3 = new Time_Button("17:00 ~ 18:49");
		Time_Button radioButton4 = new Time_Button("20:05 ~ 21:54");

		radioButton1.setBounds(150, 25, 150, 60);
		radioButton2.setBounds(350, 25, 200, 60);
		radioButton3.setBounds(550, 25, 200, 60);
		radioButton4.setBounds(750, 25, 150, 60);
		// 라디오 버튼을 그룹으로 묶기

		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		group.add(radioButton4);

		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		add(radioButton4);
	}
}

//5/5
class date4 extends JPanel {
	public date4(ButtonGroup group) {
		setBounds(0, 540, 1200, 100);
		setLayout(null);

		date date = new date("5/5");
		add(date);
		// 시간선택버튼
		Time_Button radioButton1 = new Time_Button("07:00 ~ 08:49");
		Time_Button radioButton2 = new Time_Button("11:30 ~ 13:19");
		Time_Button radioButton3 = new Time_Button("17:20 ~ 19:09");
		Time_Button radioButton4 = new Time_Button("23:00 ~ 24:49");

		radioButton1.setOpaque(false);
		radioButton2.setOpaque(false);
		radioButton3.setOpaque(false);
		radioButton4.setOpaque(false);

		radioButton1.setBounds(150, 25, 150, 60);
		radioButton2.setBounds(350, 25, 200, 60);
		radioButton3.setBounds(550, 25, 200, 60);
		radioButton4.setBounds(750, 25, 150, 60);
		// 라디오 버튼을 그룹으로 묶기

		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		group.add(radioButton4);

		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		add(radioButton4);
	}
}

//선택 극장 및 날짜와 시간 대 표시 패널
class Your_Choice extends JPanel {
    private JLabel theaterLabel;
    private JLabel dateLabel;
    private JLabel dateTimeLabel;

    public Your_Choice() {
        setBounds(9500, 200, 300, 500);
    	setLayout(new GridLayout(3, 1));
        
        theaterLabel = new JLabel("Selected Theater: ");
        dateLabel = new JLabel("Selected Date: ");
        dateTimeLabel = new JLabel("Selected Date and Time: ");

        add(theaterLabel);
        add(dateLabel);
        add(dateTimeLabel);
    }

    public void updateTheater(String theaterName) {
        theaterLabel.setText("Selected Theater: " + theaterName);
    }

    public void updateDate(String date) {
        dateLabel.setText("Selected Date: " + date);
    }

    public void updateDateTime(String dateTime) {
        dateTimeLabel.setText("Selected Date and Time: " + dateTime);
    }
}

//극장 선택 버튼
class Thearter_Button extends JButton {
	private String Thearter_Name;

	public Thearter_Button(String Thearter) {
		Thearter_Name = Thearter;
		setText(Thearter_Name);
		
		addActionListener(e -> {
            System.out.println(get_Thearter_Name());
            
        });
	}

	public String get_Thearter_Name() {
		return Thearter_Name;
	}
}

class Thearter extends JPanel {
	public Thearter() {
		setBounds(0, 0, 1200, 165);
		setLayout(null);

		Thearter_Button bucheon = new Thearter_Button("부천 스타필드");
		Thearter_Button incheon = new Thearter_Button("인천 논현");
		Thearter_Button chungla = new Thearter_Button("청라 지젤");
		Thearter_Button hwagok = new Thearter_Button("화곡");
		// 극장 버튼

		bucheon.setBounds(125, 30, 200, 100);
		incheon.setBounds(375, 30, 200, 100);
		chungla.setBounds(625, 30, 200, 100);
		hwagok.setBounds(875, 30, 200, 100);

		add(bucheon);
		add(incheon);
		add(chungla);
		add(hwagok);

	}
}

public class Choice_date {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null);

		f.setBounds(350, 150, 1200, 800);

		ButtonGroup timeGroup = new ButtonGroup();

		
		
		f.add(new Thearter());
		f.add(new date1(timeGroup));
		f.add(new date2(timeGroup));
		f.add(new date3(timeGroup));
		f.add(new date4(timeGroup));
		f.add(new Your_Choice());
		f.setVisible(true);

	}
}
