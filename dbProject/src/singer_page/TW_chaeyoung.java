package singer_page;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TW_chaeyoung extends JFrame implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;
	JLabel la1,la11,la2,la3,la4,la5,la6,la7;
	JTextField tf11;
	JButton bt1,bt2, bt3,bt4,bt5;
	Container c = this.getContentPane();
	
	public TW_chaeyoung() {
		init();
	}

	private void init() {
		
		bt3 = new JButton("");
		bt3.setIcon(new ImageIcon(TW_chaeyoung.class.getResource("../image_files/tw_chaeyoung.jpg")));
		bt3.setBounds(45, 40, 150, 225);
		bt3.setBorderPainted(false);
		
		la1 = new JLabel("채  영");
		la1.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		la1.setBounds(290, -40, 300, 300);
		
		la11 = new JLabel("Chaeyoung");
		la11.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		la11.setBounds(255, 10, 300, 300);
		
		la2 = new JLabel("생일 : 1999-04-23");
		la2.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la2.setBounds(55, 205, 200, 200);
		
		la3 = new JLabel("국적 : 한국");
		la3.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la3.setBounds(55, 235, 200, 200);
		
		la4 = new JLabel("그룹명 : TWICE");
		la4.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la4.setBounds(55, 265, 200, 200);
		
		la5 = new JLabel("파트 : 메인래퍼,서브보컬");
		la5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la5.setBounds(55, 295, 200, 200);
		
		la6 = new JLabel("SNS : ");
		la6.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la6.setBounds(55, 330, 200, 200);
		
		bt5 = new JButton("https://www.instagram.com/twicetagram/");
		bt5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		bt5.setBounds(100, 425, 330, 15);
		bt5.addActionListener(this);
		
		this.add(bt3); this.add(bt5); 						//버튼,이미지
		this.add(la1); this.add(la2); this.add(la3); 		//글씨
		this.add(la4); this.add(la5); this.add(la6);		//글씨
		this.add(la11);
	
		this.setTitle("가수");									//화면 타이틀 이름
		this.setLayout(null);
		this.setSize(500,550);									//화면 사이즈
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null); 						//화면 가운데에서 나오게하기.
		c.setBackground(new Color(255,20,20,20));				//백그라운드 색
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt5) {		//해당 페이지 이동.
			String urlLink = "https://www.instagram.com/twicetagram/";
	    	try {
	    		Desktop.getDesktop().browse(new URI(urlLink));
	    	} catch (IOException e1) {
	    		e1.printStackTrace();
	    	} catch (URISyntaxException e1) {
	    		e1.printStackTrace();
	    	}
		}
		
	}
	public static void main(String[] args) {
		new TW_chaeyoung();
	}
}
