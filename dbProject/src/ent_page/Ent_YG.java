package ent_page;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Ent_YG extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	Container c = this.getContentPane();
	JButton bt1,bt2,bt3,bt4;
	JLabel la1,la2,la3,la4,la5,la6;
	
	public Ent_YG() {
		init();
	}
	
	private void init() {
		la1 = new JLabel("YG");
		la1.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,22));
		la1.setBounds(350, -20, 300, 299);
		
		la6 = new JLabel("엔터테인먼트");
		la6.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,22));
		la6.setBounds(300, 20, 300, 299);
		
		la2 = new JLabel("대표 : 황보경");
		la2.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,14));
		la2.setBounds(55, 200, 300, 200);
		
		la3 = new JLabel("주소 : 서울특별시 마포구 희우정로1길 7");
		la3.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,14));
		la3.setBounds(55, 250, 300, 200);
		
		la4 = new JLabel("회사번호 : 02-3142-1104");
		la4.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,14));
		la4.setBounds(55, 300, 300, 200);
		
		la5 = new JLabel("설립년도 : 1998년");
		la5.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,14));
		la5.setBounds(55, 350, 300, 200);
		
		bt4 = new JButton("yg로고");
		bt4.setIcon(new ImageIcon(Ent_YG.class.getResource("../image_files/yg1.jpg")));
		bt4.setBounds(15, 10, 250, 249);
		bt4.setBackground(Color.white);
		bt4.setBorderPainted(false);
		
		
		this.add(la1); this.add(la2); this.add(la3); this.add(la4); this.add(la5);
		this.add(bt4); this.add(la6);
		
		this.setLayout(null);
		this.setSize(500,550);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public static void main(String[] args) {
		new Ent_YG();
	}
	
}
