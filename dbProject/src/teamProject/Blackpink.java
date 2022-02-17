package teamProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Blackpink extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	//화면을 구성하는 요소(컴포넌트) 변수 선언
	JLabel laAE1,laAE2;			//레이블
	JTextField tf1,tf2,tf3;				//텍스트입력
	JButton btAE1,btAE2,btAE3,btAE4;			//실행버튼
	ImageIcon img1,img2,img3;			//이미지
	JPanel pnAE1,pnAE2,pnAE3;			
	Container c = this.getContentPane();			//백그라운드 색
//	private Image background = new ImageIcon
//			("./background/aespa2.jpg").getImage();		//백그라운드 이미지 설정.

	public Blackpink() {
		init();
	}
	
	private void init() {
		laAE1 = new JLabel("Blackpink");
		laAE1.setFont(new Font("Algerian",Font.BOLD,30));
		laAE1.setBounds(155, -100, 300, 280);
		
		btAE1 = new JButton();
		btAE1.setIcon(new ImageIcon("./group/BLACKPINK.jpg"));
		btAE1.setBounds(0, 55, 500, 300);
		
		btAE2 = new JButton();
		btAE2.setIcon(new ImageIcon("./logo/building4.jpg"));
		btAE2.setBounds(200, 480, 80, 30);
		btAE2.addActionListener(this);
		
		this.add(laAE1); this.add(btAE1);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setBackground(Color.white);		//백그라운드 색
		this.setTitle("걸그룹");
		this.setLayout(null);
		this.setSize(500,600);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btAE2) {
			new EntGui();
		}
	}
	
	public static void main(String[] args) {
		new Blackpink();
	}
	
	
	
}