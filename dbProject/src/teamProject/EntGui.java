package teamProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EntGui extends JFrame implements ActionListener{
	
		private static final long serialVersionUID = 1L;
		
		//화면을 구성하는 요소(컴포넌트) 변수 선언
		JLabel la1,la2,la3,la4,la5;			//레이블
		JTextField tf1,tf2,tf3;				//텍스트입력
		JButton bt1,bt2,bt3,bt4;			//실행버튼
		JList<String> jlist;		
		ImageIcon img1,img2,img3;			//이미지
		JPanel pnl1,pnl2,pnl3;			
		Container c = this.getContentPane();			//백그라운드 색
//		private Image background = new ImageIcon
//				("./background/aespa2.jpg").getImage();		//백그라운드 이미지 설정.
		
		public EntGui() {
			init();			//윈도우(화면)를 구성하는 요소를 생성합니다.
		}


		
		@Override
		public void actionPerformed(ActionEvent arg) {
			if(arg.getSource()==bt1) {
				new Itzy();
			}else if(arg.getSource()==bt2) {
				new Blackpink();
			}else if(arg.getSource()==bt3)
				new Aespa();
		}
		
		private void init() {
			//크기와 위치
			la1 = new JLabel("JYP");
			la1.setFont(new Font("맑은고딕",Font.BOLD,30));
			la1.setBounds(270, 50, 200, 200);
			
			bt1 = new JButton("jyp");
			bt1.setIcon(new ImageIcon("./logo/jyp2.jpg"));
			bt1.setBounds(20, 100, 190, 80);
			

			la2 = new JLabel("YG");
			la2.setFont(new Font("맑은고딕",Font.BOLD,30));
			la2.setBounds(270, 150, 200, 200);
			
			bt2 = new JButton("YG");
			bt2.setIcon(new ImageIcon("./logo/yg2.jpg"));
			bt2.setBounds(20, 200, 190, 80);
		
			la3 = new JLabel("SM");
			la3.setFont(new Font("맑은고딕",Font.BOLD,30));
			la3.setBounds(270, 250, 200, 200);
			
			bt3 = new JButton("SM");
			bt3.setIcon(new ImageIcon("./logo/sm3.jpg"));
			bt3.setBounds(20, 300, 190, 80);
			
			
			bt1.addActionListener(this);
			bt2.addActionListener(this);
			bt3.addActionListener(this);
			
			this.add(la1);	this.add(bt1); 
			this.add(la2);	this.add(bt2);
			this.add(la3);	this.add(bt3);
	
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c.setBackground(Color.white);		//백그라운드 색
			this.setTitle("소속사");
			this.setLayout(null);
			this.setSize(400,500);
			this.setResizable(false);
			this.setVisible(true);
			this.setLocationRelativeTo(null);
		}

		
		public static void main(String[] args) {
			new EntGui();
		}

}
