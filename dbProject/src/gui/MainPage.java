package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import alb_page.JI01;
import alb_page.JM01;
import alb_page.JM02;
import alb_page.JT01;
import alb_page.JT02;
import alb_page.JT03;
import alb_page.SF01;
import alb_page.SF02;
import alb_page.SF03;
import alb_page.SF04;
import alb_page.YB01;
import ent.Ent;
import ent.EntDao;
import ent_page.Ent_JYP;
import ent_page.Ent_SM;
import ent_page.Ent_YG;
import ggroup.G_Group;
import ggroup.G_GroupDao;
import javafx.scene.control.Hyperlink;
import singer_page.AS_geiselle;
import singer_page.AS_karina;
import singer_page.AS_ningning;
import singer_page.AS_winter;
import singer_page.BL_jennie;
import singer_page.BL_jisu;
import singer_page.BL_lisa;
import singer_page.BL_rose;
import singer_page.FX_amber;
import singer_page.FX_krystal;
import singer_page.FX_luna;
import singer_page.FX_sulli;
import singer_page.FX_victoria;
import singer_page.IT_caeryeong;
import singer_page.IT_lia;
import singer_page.IT_ryujin;
import singer_page.IT_yeji;
import singer_page.IT_yuna;
import singer_page.MI_fei;
import singer_page.MI_jia;
import singer_page.MI_min;
import singer_page.MI_suzy;
import singer_page.TW_chaeyoung;
import singer_page.TW_dahyun;
import singer_page.TW_jeongyeon;
import singer_page.TW_jihyo;
import singer_page.TW_mina;
import singer_page.TW_momo;
import singer_page.TW_nayeon;
import singer_page.TW_sana;
import singer_page.TW_tzuyu;

public class MainPage extends JFrame {

	private static final long serialVersionUID = 1L;
	// 프레임 생성
	JFrame frame = new JFrame("가제:걸그룹 조회하기");
	JLabel lb0, lb1, lb2, lb3, lb4, lb5, lb6;
	JLabel glb, glb1, glb2, glb3, glb4, glb5, glb6, glb7, glb8, glb9;
	JLabel ji1, ji3, ji4, ji5, ji6, ji7;
	JLabel jm1, jm3, jm4, jm5, jm6, jm7;
	JLabel jt1, jt3, jt4, jt5, jt6, jt7;
	JLabel sf1, sf3, sf4, sf5, sf6, sf7;
	JLabel sa1, sa3, sa4, sa5, sa6, sa7;
	JLabel yb1, yb3, yb4, yb5, yb6, yb7;
	JButton btn, btn1, btn2, btn3, btn4, btn5, btn6;
	JButton gbtn1, gbtn2, gbtn3, gbtn4, gbtn5, gbtn6;
	JButton jt01, jt02, jt03;
	JButton yb01;
	JButton ji01;
	JButton jm01, jm02, jm03;
	JButton sf01, sf02, sf03, sf04;
	JButton jis1, jis2, jis3, jis4, jis5;
	JButton jms1, jms2, jms3, jms4;
	JButton jts1, jts2, jts3, jts4, jts5, jts6, jts7, jts8, jts9;
	JButton sfs1, sfs2, sfs3, sfs4, sfs5;
	JButton ybs1, ybs2, ybs3, ybs4;
	JButton sas1, sas2, sas3, sas4;
	JButton ji2, jm2, jt2, sf2, yb2, sa2;
	JButton back;
	ImageIcon img, img1, img2, img3, img4, img5, img6;
	ImageIcon gimg1, gimg2, gimg3, gimg4, gimg5, gimg6;
	JPanel p_main, p_twice, p_blackpink, p_itzy, p_aespa, p_missa, p_fx;

	public static final Color twice_color = new Color(255, 235, 198);
	public static final Color blpink_color = new Color(255, 215, 230);
	public static final Color itzy_color = Color.BLACK;
	public static final Color aespa_color = new Color(169, 218, 255);
	public static final Color missa_color = new Color(252, 81, 121);
	public static final Color fx_color = new Color(214, 208, 255);
	
	

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainPage() { // 프레임을 구성하는 요소
		init();
	}

	private void init() {
		// 기업, 걸그룹 정보 테이블
		G_Group twice = G_GroupDao.selectOne("TWICE");
		G_Group itzy = G_GroupDao.selectOne("ITZY");
		G_Group missA = G_GroupDao.selectOne("미쓰에이");
		G_Group fx = G_GroupDao.selectOne("f(x)");
		G_Group blackpink = G_GroupDao.selectOne("BLACKPINK");
		G_Group aespa = G_GroupDao.selectOne("aespa");
		Ent jyp = EntDao.selectEnt(1);
		Ent sm = EntDao.selectEnt(2);
		Ent yg = EntDao.selectEnt(3);

		frame = new JFrame("걸그룹 정보조회 프로그램");
		frame.setBounds(30, 0, 700, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
//		--------------프레임 관련 사항 종료----------------------
		p_main = new JPanel();
		p_main.setBounds(0, 0, 700, 900);
		frame.getContentPane().add(p_main);
		p_main.setLayout(null);

		lb0 = new JLabel();
		lb0.setBounds(180, 20, 400, 50);
		lb0.setText("걸그룹 조회하기 프로그램");
		lb0.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		frame.getContentPane().add(lb0);
		p_main.add(lb0);

		// 트와이스

		// 패널
		p_twice = new JPanel();
		p_twice.setBounds(0, 0, 900, 900);
		frame.getContentPane().add(p_twice);
		p_twice.setLayout(null);
		p_twice.setVisible(false);
		p_twice.setBackground(twice_color);

		img = new ImageIcon(MainPage.class.getResource("../image_files/Twice_page.jpg"));
		glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_twice.add(glb);

		glb1 = new JLabel("그룹명 : ");
		glb1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb1.setBounds(55, 300, 200, 50);
		p_twice.add(glb1);

		jt1 = new JLabel(twice.getTeam_name());
		jt1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jt1.setBounds(150, 300, 200, 50);
		p_twice.add(jt1);

		glb2 = new JLabel("소속 가수 :");
		glb2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb2.setBounds(55, 350, 200, 50);
		p_twice.add(glb2);

		jts1 = new JButton("지효");
		jts1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts1.setBounds(150, 363, 60, 23);
		p_twice.add(jts1);
		jts1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_jihyo();
			}
		});

		jts2 = new JButton("사나");
		jts2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts2.setBounds(215, 363, 60, 23);
		p_twice.add(jts2);
		jts2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_sana();
			}
		});

		jts3 = new JButton("나연");
		jts3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts3.setBounds(280, 363, 60, 23);
		p_twice.add(jts3);
		jts3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_nayeon();
			}
		});

		jts4 = new JButton("모모");
		jts4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts4.setBounds(345, 363, 60, 23);
		p_twice.add(jts4);
		jts4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_momo();
			}
		});

		jts5 = new JButton("정연");
		jts5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts5.setBounds(410, 363, 60, 23);
		p_twice.add(jts5);
		jts5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_jeongyeon();
			}
		});

		jts6 = new JButton("다현");
		jts6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts6.setBounds(150, 390, 60, 23);
		p_twice.add(jts6);
		jts6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_dahyun();
			}
		});

		jts7 = new JButton("채영");
		jts7.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts7.setBounds(215, 390, 60, 23);
		p_twice.add(jts7);
		jts7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_chaeyoung();
			}
		});

		jts8 = new JButton("미나");
		jts8.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts8.setBounds(280, 390, 60, 23);
		p_twice.add(jts8);
		jts8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_mina();
			}
		});

		jts9 = new JButton("쯔위");
		jts9.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jts9.setBounds(345, 390, 60, 23);
		p_twice.add(jts9);
		jts9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TW_tzuyu();
			}
		});

		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb3.setBounds(55, 410, 200, 50);
		p_twice.add(glb3);

		jt2 = new JButton("JYP엔터테인먼트");
		jt2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jt2.setBounds(150, 425, 170, 20);
		p_twice.add(jt2);
		jt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ent_JYP();
			}
		});

		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb4.setBounds(55, 450, 200, 50);
		p_twice.add(glb4);

		jt01 = new JButton("1집");
		jt01.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jt01.setBounds(150, 463, 60, 25);
		p_twice.add(jt01);
		jt01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JT01();
			}
		});

		jt02 = new JButton("2집");
		jt02.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jt02.setBounds(220, 463, 60, 25);
		p_twice.add(jt02);
		jt02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JT02();
			}
		});

		jt03 = new JButton("3집");
		jt03.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jt03.setBounds(290, 463, 60, 25);
		p_twice.add(jt03);
		jt03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JT03();
			}
		});

		glb5 = new JLabel("멤버수 :");
		glb5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb5.setBounds(55, 500, 200, 50);
		p_twice.add(glb5);

		jt3 = new JLabel(Integer.toString(twice.getMember_cnt()) + "명");
		jt3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jt3.setBounds(150, 500, 200, 50);
		p_twice.add(jt3);

		glb6 = new JLabel("데뷔곡 :");
		glb6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb6.setBounds(55, 550, 200, 50);
		p_twice.add(glb6);

		jt4 = new JLabel(twice.getD_song());
		jt4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jt4.setBounds(150, 550, 200, 50);
		p_twice.add(jt4);

		glb7 = new JLabel("데뷔일 :");
		glb7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb7.setBounds(55, 600, 200, 50);
		p_twice.add(glb7);

		jt5 = new JLabel(String.format("%s", twice.getD_date()));
		jt5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jt5.setBounds(150, 600, 200, 50);
		p_twice.add(jt5);

		glb8 = new JLabel("팬카페명 :");
		glb8.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb8.setBounds(55, 650, 200, 50);
		p_twice.add(glb8);

		jt6 = new JLabel(twice.getF_name());
		jt6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jt6.setBounds(150, 650, 200, 50);
		p_twice.add(jt6);

		glb9 = new JLabel("리더 :");
		glb9.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb9.setBounds(55, 700, 200, 50);
		p_twice.add(glb9);

		jt7 = new JLabel(twice.getLeader());
		jt7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jt7.setBounds(150, 700, 200, 50);
		p_twice.add(jt7);

		back = new JButton(new ImageIcon(MainPage.class.getResource("../image_files/back.png")));
		back.setBounds(220, 760, 70, 70);
		back.setBackground(Color.white);
		p_twice.add(back);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(30, 0, 700, 900);
				frame.getContentPane().setLayout(null);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				p_twice.setVisible(false);
				p_main.setVisible(true);
			}
		});

		// 메인
		img1 = new ImageIcon(MainPage.class.getResource("../image_files/Twice.jpg"));
		btn1 = new JButton();
		btn1.setIcon(img1);
		btn1.setBounds(20, 90, 300, 200);
		btn1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn1);
		lb1 = new JLabel("TWICE");
		lb1.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 25));
		lb1.setBounds(90, 280, 150, 50);
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb1);
		p_main.add(btn1);

		// 액션리스너
		btn1.addActionListener(new ActionListener() { // 트와이스 이미지 클릭시
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1) {
					frame.setBounds(30, 0, 510, 900);
					frame.getContentPane().setLayout(null);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					p_twice.setVisible(true);
					p_main.setVisible(false);
				}
			}
		});

		// 블랙핑크
		p_blackpink = new JPanel();
		p_blackpink.setBounds(0, 0, 900, 900);
		frame.getContentPane().add(p_blackpink);
		p_blackpink.setLayout(null);
		p_blackpink.setVisible(false);
		p_blackpink.setBackground(blpink_color);
		
		img = new ImageIcon(MainPage.class.getResource("../image_files/BLACKPINK_page.jpg"));
		glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_blackpink.add(glb);

		glb1 = new JLabel("그룹명 :");
		glb1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb1.setBounds(55, 300, 200, 50);
		p_blackpink.add(glb1);

		yb1 = new JLabel(blackpink.getTeam_name());
		yb1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		yb1.setBounds(150, 300, 200, 50);
		p_blackpink.add(yb1);

		glb2 = new JLabel("소속 가수 : ");
		glb2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb2.setBounds(55, 350, 200, 50);
		p_blackpink.add(glb2);

		ybs1 = new JButton("제니");
		ybs1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		ybs1.setBounds(150, 363, 60, 25);
		p_blackpink.add(ybs1);
		ybs1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new BL_jennie();
			}
		});

		ybs2 = new JButton("지수");
		ybs2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		ybs2.setBounds(215, 363, 60, 25);
		p_blackpink.add(ybs2);
		ybs2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new BL_jisu();
			}
		});

		ybs3 = new JButton("로제");
		ybs3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		ybs3.setBounds(280, 363, 60, 25);
		p_blackpink.add(ybs3);
		ybs3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new BL_rose();
			}
		});

		ybs4 = new JButton("리사");
		ybs4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		ybs4.setBounds(345, 363, 60, 25);
		p_blackpink.add(ybs4);
		ybs4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new BL_lisa();
			}
		});

		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb3.setBounds(55, 400, 200, 50);
		p_blackpink.add(glb3);

		yb2 = new JButton("YG엔터테인먼트");
		yb2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		yb2.setBounds(150, 410, 170, 20);
		p_blackpink.add(yb2);
		yb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ent_YG();
			}
		});

		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb4.setBounds(55, 450, 200, 50);
		p_blackpink.add(glb4);

		yb01 = new JButton("1집");
		yb01.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		yb01.setBounds(150, 463, 60, 25);
		p_blackpink.add(yb01);
		yb01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new YB01();
			}
		});

		glb5 = new JLabel("멤버수 :");
		glb5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb5.setBounds(55, 500, 200, 50);
		p_blackpink.add(glb5);

		yb3 = new JLabel(Integer.toString(blackpink.getMember_cnt()) + "명");
		yb3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		yb3.setBounds(150, 500, 200, 50);
		p_blackpink.add(yb3);

		glb6 = new JLabel("데뷔곡 :");
		glb6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb6.setBounds(55, 550, 200, 50);
		p_blackpink.add(glb6);

		yb4 = new JLabel(blackpink.getD_song());
		yb4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		yb4.setBounds(150, 550, 200, 50);
		p_blackpink.add(yb4);

		glb7 = new JLabel("데뷔일 :");
		glb7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb7.setBounds(55, 600, 200, 50);
		p_blackpink.add(glb7);

		yb5 = new JLabel(String.format("%s", blackpink.getD_date()));
		yb5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		yb5.setBounds(150, 600, 200, 50);
		p_blackpink.add(yb5);

		glb8 = new JLabel("팬카페명 :");
		glb8.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb8.setBounds(55, 650, 200, 50);
		p_blackpink.add(glb8);

		yb6 = new JLabel(blackpink.getF_name());
		yb6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		yb6.setBounds(150, 650, 200, 50);
		p_blackpink.add(yb6);

		glb9 = new JLabel("리더 : ");
		glb9.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb9.setBounds(55, 700, 200, 50);
		p_blackpink.add(glb9);

		yb7 = new JLabel("리더가 없습니다.");
		yb7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		yb7.setBounds(150, 700, 200, 50);
		p_blackpink.add(yb7);

		back = new JButton(new ImageIcon(MainPage.class.getResource("../image_files/back.png")));
		back.setBounds(220, 760, 70, 70);
		back.setBackground(Color.white);
		p_blackpink.add(back);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(30, 0, 700, 900);
				frame.getContentPane().setLayout(null);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				p_blackpink.setVisible(false);
				p_main.setVisible(true);
			}
		});

		// 메인
		img2 = new ImageIcon(MainPage.class.getResource("../image_files/BLACKPINK.jpg"));
		btn2 = new JButton();
		btn2.setIcon(img2);
		btn2.setBounds(360, 90, 300, 200);
		btn2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn2);
		lb2 = new JLabel("BLACKPINK");
		lb2.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 25));
		lb2.setBounds(420, 280, 200, 50);
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb2);
		p_main.add(btn2);
		// 액션리스너
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn2) {
					frame.setBounds(30, 0, 510, 900);
					frame.getContentPane().setLayout(null);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					p_blackpink.setVisible(true);
					p_main.setVisible(false);
				}
			}
		});

		// 메인
		img3 = new ImageIcon(MainPage.class.getResource("../image_files/ITZY.jpg"));
		btn3 = new JButton();
		btn3.setIcon(img3);
		btn3.setBounds(20, 350, 300, 200);
		btn3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn3);
		lb3 = new JLabel("ITZY");
		lb3.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 25));
		lb3.setBounds(90, 540, 150, 50);
		lb3.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb3);
		p_main.add(btn3);

		// 있지패널
		p_itzy = new JPanel();
		p_itzy.setBounds(0, 0, 900, 900);
		frame.getContentPane().add(p_itzy);
		p_itzy.setLayout(null);
		p_itzy.setVisible(false);

		img = new ImageIcon(MainPage.class.getResource("../image_files/ITZY_page.jpg"));
		glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_itzy.add(glb);
		p_itzy.setBackground(itzy_color);

		glb1 = new JLabel("그룹명 :");
		glb1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb1.setBounds(55, 300, 200, 50);
		glb1.setForeground(Color.white);
		p_itzy.add(glb1);

		ji1 = new JLabel(itzy.getTeam_name());
		ji1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		ji1.setBounds(150, 300, 200, 50);
		ji1.setForeground(Color.white);
		p_itzy.add(ji1);

		glb2 = new JLabel("소속 가수 :");
		glb2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb2.setBounds(55, 350, 200, 50);
		glb2.setForeground(Color.white);
		p_itzy.add(glb2);

		jis1 = new JButton("예지");
		jis1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jis1.setBounds(150, 363, 60, 25);
		p_itzy.add(jis1);
		jis1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new IT_yeji();
			}
		});

		jis2 = new JButton("류진");
		jis2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jis2.setBounds(215, 363, 60, 25);
		p_itzy.add(jis2);
		jis2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new IT_ryujin();
			}
		});

		jis3 = new JButton("유나");
		jis3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jis3.setBounds(280, 363, 60, 25);
		p_itzy.add(jis3);
		jis3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new IT_yuna();
			}
		});

		jis4 = new JButton("채령");
		jis4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jis4.setBounds(345, 363, 60, 25);
		p_itzy.add(jis4);
		jis4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new IT_caeryeong();
			}
		});

		jis5 = new JButton("리아");
		jis5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jis5.setBounds(410, 363, 60, 25);
		p_itzy.add(jis5);
		jis5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new IT_lia();
			}
		});
		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb3.setBounds(55, 400, 200, 50);
		glb3.setForeground(Color.white);
		p_itzy.add(glb3);

		ji2 = new JButton("JYP엔터테인먼트");
		ji2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		ji2.setBounds(150, 410, 170, 20);
		p_itzy.add(ji2);
		ji2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ent_JYP();
			}
		});

		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb4.setBounds(55, 450, 200, 50);
		glb4.setForeground(Color.white);
		p_itzy.add(glb4);

		ji01 = new JButton("1집");
		ji01.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		ji01.setBounds(150, 463, 60, 25);
		p_itzy.add(ji01);
		ji01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JI01();
			}
		});

		glb5 = new JLabel("멤버수 :");
		glb5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb5.setBounds(55, 500, 200, 50);
		glb5.setForeground(Color.white);
		p_itzy.add(glb5);
		
		ji3 = new JLabel(Integer.toString(itzy.getMember_cnt()) + "명");
		ji3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		ji3.setBounds(150, 500, 200, 50);
		ji3.setForeground(Color.white);
		p_itzy.add(ji3);

		glb6 = new JLabel("데뷔곡 :");
		glb6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb6.setBounds(55, 550, 200, 50);
		glb6.setForeground(Color.white);
		p_itzy.add(glb6);
		
		ji4 = new JLabel(itzy.getD_song());
		ji4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		ji4.setBounds(150, 550, 200, 50);
		ji4.setForeground(Color.white);
		p_itzy.add(ji4);

		glb7 = new JLabel("데뷔일 :");
		glb7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb7.setBounds(55, 600, 200, 50);
		glb7.setForeground(Color.white);
		p_itzy.add(glb7);
		
		ji5 = new JLabel(String.format("%s", itzy.getD_date()));
		ji5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		ji5.setBounds(150, 600, 200, 50);
		ji5.setForeground(Color.white);
		p_itzy.add(ji5);

		glb8 = new JLabel("팬카페명 :");
		glb8.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb8.setBounds(55, 650, 200, 50);
		glb8.setForeground(Color.white);
		p_itzy.add(glb8);
		
		ji6 = new JLabel(itzy.getF_name());
		ji6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		ji6.setBounds(150, 650, 200, 50);
		ji6.setForeground(Color.white);
		p_itzy.add(ji6);

		glb9 = new JLabel("리더 : ");
		glb9.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb9.setBounds(55, 700, 200, 50);
		glb9.setForeground(Color.white);
		p_itzy.add(glb9);
		
		ji7 = new JLabel(itzy.getLeader());
		ji7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		ji7.setBounds(150, 700, 200, 50);
		ji7.setForeground(Color.white);
		p_itzy.add(ji7);

		back = new JButton(new ImageIcon(MainPage.class.getResource("../image_files/back.png")));
		back.setBounds(220, 760, 70, 70);
		back.setBackground(Color.white);
		p_itzy.add(back);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(30, 0, 700, 900);
				frame.getContentPane().setLayout(null);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				p_itzy.setVisible(false);
				p_main.setVisible(true);
			}
		});

		// 액션리스너
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn3) {
					frame.setBounds(30, 0, 510, 900);
					frame.getContentPane().setLayout(null);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					p_itzy.setVisible(true);
					p_main.setVisible(false);
				}
			}
		});

		// 메인
		img4 = new ImageIcon(MainPage.class.getResource("../image_files/aespa.jpg"));
		btn4 = new JButton();
		btn4.setIcon(img4);
		btn4.setBounds(360, 350, 300, 200);
		btn4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn4);
		lb4 = new JLabel("AESPA");
		lb4.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 25));
		lb4.setBounds(440, 540, 150, 50);
		lb4.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb4);
		p_main.add(btn4);

		// 에스파
		p_aespa = new JPanel();
		p_aespa.setBounds(0, 0, 900, 900);
		frame.getContentPane().add(p_aespa);
		p_aespa.setLayout(null);
		p_aespa.setVisible(false);
		p_aespa.setBackground(aespa_color);

		img = new ImageIcon(MainPage.class.getResource("../image_files/aespa_page.jpg"));
		glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_aespa.add(glb);

		glb1 = new JLabel("그룹명 : ");
		glb1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb1.setBounds(55, 300, 200, 50);
		p_aespa.add(glb1);
		
		sa1 = new JLabel(aespa.getTeam_name());
		sa1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sa1.setBounds(150, 300, 200, 50);
		p_aespa.add(sa1);

		glb2 = new JLabel("소속 가수 : ");
		glb2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb2.setBounds(55, 350, 200, 50);
		p_aespa.add(glb2);

		sas1 = new JButton("카리나");
		sas1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sas1.setBounds(150, 365, 75, 23);
		p_aespa.add(sas1);
		sas1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AS_karina();
			}
		});

		sas2 = new JButton("윈터");
		sas2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sas2.setBounds(230, 365, 60, 23);
		p_aespa.add(sas2);
		sas2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AS_winter();
			}
		});

		sas3 = new JButton("지젤");
		sas3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sas3.setBounds(295, 365, 60, 23);
		p_aespa.add(sas3);
		sas3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AS_geiselle();
			}
		});

		sas4 = new JButton("닝닝");
		sas4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sas4.setBounds(360, 365, 60, 23);
		p_aespa.add(sas4);
		sas4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AS_ningning();
			}
		});

		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb3.setBounds(55, 400, 200, 50);
		p_aespa.add(glb3);

		sa2 = new JButton("SM엔터테인먼트");
		sa2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sa2.setBounds(150, 415, 180, 20);
		p_aespa.add(sa2);
		sa2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ent_SM();
			}
		});

		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb4.setBounds(55, 450, 250, 50);
		p_aespa.add(glb4);
		
		JLabel sa = new JLabel("정규앨범이 아직 없습니다.");
		sa.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sa.setBounds(150, 450, 200, 50);
		p_aespa.add(sa);

		glb5 = new JLabel("멤버수 :");
		glb5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb5.setBounds(55, 500, 200, 50);
		p_aespa.add(glb5);
		
		sa3 = new JLabel(Integer.toString(itzy.getMember_cnt()) + "명");
		sa3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sa3.setBounds(150, 500, 200, 50);
		p_aespa.add(sa3);

		glb6 = new JLabel("데뷔곡 : ");
		glb6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb6.setBounds(55, 550, 200, 50);
		p_aespa.add(glb6);
		
		sa4 = new JLabel(Integer.toString(itzy.getMember_cnt()) + "명");
		sa4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sa4.setBounds(150, 550, 200, 50);
		p_aespa.add(sa4);

		glb7 = new JLabel("데뷔일 : ");
		glb7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb7.setBounds(55, 600, 200, 50);
		p_aespa.add(glb7);
		
		sa5 = new JLabel(String.format("%s", aespa.getD_date()));
		sa5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sa5.setBounds(150, 600, 200, 50);
		p_aespa.add(sa5);

		glb8 = new JLabel("팬카페명 : ");
		glb8.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb8.setBounds(55, 650, 200, 50);
		p_aespa.add(glb8);
		
		sa6 = new JLabel(aespa.getF_name());
		sa6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sa6.setBounds(150, 650, 200, 50);
		p_aespa.add(sa6);

		glb9 = new JLabel("리더 : ");
		glb9.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb9.setBounds(55, 700, 200, 50);
		p_aespa.add(glb9);
		
		sa7 = new JLabel(aespa.getLeader());
		sa7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sa7.setBounds(150, 700, 200, 50);
		p_aespa.add(sa7);

		back = new JButton(new ImageIcon(MainPage.class.getResource("../image_files/back.png")));
		back.setBounds(220, 760, 70, 70);
		back.setBackground(Color.white);
		p_aespa.add(back);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(30, 0, 700, 900);
				frame.getContentPane().setLayout(null);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				p_aespa.setVisible(false);
				p_main.setVisible(true);
			}
		});

		// 액션리스너
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn4) {
					frame.setBounds(30, 0, 510, 900);
					frame.getContentPane().setLayout(null);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					p_aespa.setVisible(true);
					p_main.setVisible(false);
				}
			}
		});

		// 메인
		img5 = new ImageIcon(MainPage.class.getResource("../image_files/Miss A.jpg"));
		btn5 = new JButton();
		btn5.setIcon(img5);
		btn5.setBounds(20, 610, 300, 200);
		btn5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn5);
		lb5 = new JLabel("MISS A");
		lb5.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 25));
		lb5.setBounds(90, 800, 150, 50);
		lb5.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb5);
		p_main.add(btn5);

		// 미쓰에이
		p_missa = new JPanel();
		p_missa.setBounds(0, 0, 900, 900);
		frame.getContentPane().add(p_missa);
		p_missa.setLayout(null);
		p_missa.setVisible(false);
		p_missa.setBackground(missa_color);

		img = new ImageIcon(MainPage.class.getResource("../image_files/Miss A_page.jpg"));
		glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_missa.add(glb);

		glb1 = new JLabel("그룹명 :");
		glb1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb1.setBounds(55, 300, 200, 50);
		p_missa.add(glb1);
		
		jm1 = new JLabel(missA.getTeam_name());
		jm1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jm1.setBounds(150, 300, 200, 50);
		p_missa.add(jm1);
		
		glb2 = new JLabel("소속 가수 : ");
		glb2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb2.setBounds(55, 350, 200, 50);
		p_missa.add(glb2);

		jms1 = new JButton("페이");
		jms1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jms1.setBounds(150, 365, 60, 23);
		p_missa.add(jms1);
		jms1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MI_fei();
			}
		});

		jms2 = new JButton("지아");
		jms2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jms2.setBounds(215, 365, 60, 23);
		p_missa.add(jms2);
		jms2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MI_jia();
			}
		});

		jms3 = new JButton("민");
		jms3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jms3.setBounds(280, 365, 60, 23);
		p_missa.add(jms3);
		jms3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MI_min();
			}
		});

		jms4 = new JButton("수지");
		jms4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jms4.setBounds(345, 365, 60, 23);
		p_missa.add(jms4);
		jms4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MI_suzy();
			}
		});

		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb3.setBounds(55, 400, 200, 50);
		p_missa.add(glb3);

		jm2 = new JButton("JYP엔터테인먼트");
		jm2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jm2.setBounds(150, 415, 180, 20);
		p_missa.add(jm2);
		jm2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ent_JYP();
			}
		});

		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb4.setBounds(55, 450, 200, 50);
		p_missa.add(glb4);

		jm01 = new JButton("1집");
		jm01.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jm01.setBounds(150, 463, 60, 25);
		p_missa.add(jm01);
		jm01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JM01();
			}
		});

		jm02 = new JButton("2집");
		jm02.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		jm02.setBounds(215, 463, 60, 25);
		p_missa.add(jm02);
		jm02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JM02();
			}
		});

		glb5 = new JLabel("멤버수 : ");
		glb5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb5.setBounds(55, 500, 200, 50);
		p_missa.add(glb5);
		
		jm3 = new JLabel(Integer.toString(missA.getMember_cnt()) + "명");
		jm3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jm3.setBounds(150, 500, 200, 50);
		p_missa.add(jm3);
		
		glb6 = new JLabel("데뷔곡 : ");
		glb6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb6.setBounds(55, 550, 200, 50);
		p_missa.add(glb6);
		
		jm4 = new JLabel(missA.getD_song());
		jm4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jm4.setBounds(150, 550, 200, 50);
		p_missa.add(jm4);
		
		glb7 = new JLabel("데뷔일 : ");
		glb7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb7.setBounds(55, 600, 200, 50);
		p_missa.add(glb7);
		
		jm5 = new JLabel(missA.getD_song());
		jm5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jm5.setBounds(150, 600, 200, 50);
		p_missa.add(jm5);

		glb8 = new JLabel("팬카페명 : ");
		glb8.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb8.setBounds(55, 650, 200, 50);
		p_missa.add(glb8);
		
		jm6 = new JLabel(missA.getF_name());
		jm6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jm6.setBounds(150, 650, 200, 50);
		p_missa.add(jm6);

		glb9 = new JLabel("리더 : ");
		glb9.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb9.setBounds(55, 700, 200, 50);
		p_missa.add(glb9);
		
		jm7 = new JLabel("리더가 없습니다.");
		jm7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jm7.setBounds(150, 700, 200, 50);
		p_missa.add(jm7);

		back = new JButton(new ImageIcon(MainPage.class.getResource("../image_files/back.png")));
		back.setBounds(220, 760, 70, 70);
		back.setBackground(Color.white);
		p_missa.add(back);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(30, 0, 700, 900);
				frame.getContentPane().setLayout(null);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				p_missa.setVisible(false);
				p_main.setVisible(true);
			}
		});

		// 액션리스너
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn5) {
					frame.setBounds(30, 0, 510, 900);
					frame.getContentPane().setLayout(null);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					p_missa.setVisible(true);
					p_main.setVisible(false);
				}
			}
		});

		// 메인
		img6 = new ImageIcon(MainPage.class.getResource("../image_files/f(x).jpg"));
		btn6 = new JButton();
		btn6.setIcon(img6);
		btn6.setBounds(360, 610, 300, 200);
		btn6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn6);
		lb6 = new JLabel("f(x)");
		lb6.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lb6.setBounds(440, 800, 150, 50);
		lb6.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb6);
		p_main.add(btn6);

//		//에프엑스
		p_fx = new JPanel();
		p_fx.setBounds(0, 0, 900, 900);
		frame.getContentPane().add(p_fx);
		p_fx.setLayout(null);
		p_fx.setVisible(false);
		p_fx.setBackground(fx_color);

		img = new ImageIcon(MainPage.class.getResource("../image_files/f(x)_page.jpg"));
		glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_fx.add(glb);

		glb1 = new JLabel("그룹명 :");
		glb1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb1.setBounds(55, 300, 200, 50);
		p_fx.add(glb1);
		
		sf1 = new JLabel(fx.getTeam_name());
		sf1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sf1.setBounds(150, 300, 200, 50);
		p_fx.add(sf1);
		
		glb2 = new JLabel("소속 가수 : ");
		glb2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb2.setBounds(55, 350, 200, 50);
		p_fx.add(glb2);

		sfs1 = new JButton("빅토리아");
		sfs1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sfs1.setBounds(150, 363, 90, 23);
		p_fx.add(sfs1);
		sfs1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FX_victoria();
			}
		});

		sfs2 = new JButton("엠버");
		sfs2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sfs2.setBounds(245, 363, 60, 23);
		p_fx.add(sfs2);
		sfs2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FX_amber();
			}
		});

		sfs3 = new JButton("루나");
		sfs3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sfs3.setBounds(310, 363, 60, 23);
		p_fx.add(sfs3);
		sfs3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FX_luna();
			}
		});

		sfs4 = new JButton("크리스탈");
		sfs4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sfs4.setBounds(375, 363, 90, 23);
		p_fx.add(sfs4);
		sfs4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FX_krystal();
			}
		});

		sfs5 = new JButton("설리");
		sfs5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sfs5.setBounds(150, 390, 60, 23);
		p_fx.add(sfs5);
		sfs5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FX_sulli();
			}
		});

		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb3.setBounds(55, 410, 200, 50);
		p_fx.add(glb3);

		sf2 = new JButton("SM엔터테인먼트");
		sf2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sf2.setBounds(150, 425, 180, 20);
		p_fx.add(sf2);
		sf2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Ent_SM();
			}
		});

		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb4.setBounds(55, 450, 200, 50);
		p_fx.add(glb4);

		sf01 = new JButton("1집");
		sf01.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sf01.setBounds(150, 463, 60, 25);
		p_fx.add(sf01);
		sf01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF01();
			}
		});

		sf02 = new JButton("2집");
		sf02.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sf02.setBounds(215, 463, 60, 25);
		p_fx.add(sf02);
		sf02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF02();
			}
		});

		sf03 = new JButton("3집");
		sf03.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sf03.setBounds(280, 463, 60, 25);
		p_fx.add(sf03);
		sf03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF03();
			}
		});

		sf04 = new JButton("4집");
		sf04.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		sf04.setBounds(345, 463, 60, 25);
		p_fx.add(sf04);
		sf04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SF04();
			}
		});

		glb5 = new JLabel("멤버수 :");
		glb5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb5.setBounds(55, 500, 200, 50);
		p_fx.add(glb5);

		sf3 = new JLabel(Integer.toString(fx.getMember_cnt()) + "명");
		sf3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sf3.setBounds(150, 500, 200, 50);
		p_fx.add(sf3);
		
		glb6 = new JLabel("데뷔곡 : ");
		glb6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb6.setBounds(55, 550, 200, 50);
		p_fx.add(glb6);
		
		sf4 = new JLabel(fx.getD_song());
		sf4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sf4.setBounds(150, 550, 200, 50);
		p_fx.add(sf4);

		glb7 = new JLabel("데뷔일 : ");
		glb7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb7.setBounds(55, 600, 200, 50);
		p_fx.add(glb7);
		
		sf5 = new JLabel(String.format("%s", fx.getD_date()));
		sf5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sf5.setBounds(150, 600, 200, 50);
		p_fx.add(sf5);

		glb8 = new JLabel("팬카페명 : ");
		glb8.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb8.setBounds(55, 650, 200, 50);
		p_fx.add(glb8);

		sf6 = new JLabel(fx.getF_name());
		sf6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sf6.setBounds(150, 650, 200, 50);
		p_fx.add(sf6);
		
		glb9 = new JLabel("리더 : ");
		glb9.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		glb9.setBounds(55, 700, 200, 50);
		p_fx.add(glb9);
		
		sf7 = new JLabel(fx.getLeader());
		sf7.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		sf7.setBounds(150, 700, 200, 50);
		p_fx.add(sf7);
		

		back = new JButton(new ImageIcon(MainPage.class.getResource("../image_files/back.png")));
		back.setBounds(220, 750, 70, 70);
		back.setBackground(Color.white);
		p_fx.add(back);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(30, 0, 700, 900);
				frame.getContentPane().setLayout(null);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				p_fx.setVisible(false);
				p_main.setVisible(true);
			}
		});

		// 액션리스너
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn6) {
					frame.setBounds(30, 0, 510, 900);
					frame.getContentPane().setLayout(null);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					p_fx.setVisible(true);
					p_main.setVisible(false);
				}
			}
		});

	}

}
