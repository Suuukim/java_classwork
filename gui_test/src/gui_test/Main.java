package gui_test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main implements ActionListener{

	JFrame frame = new JFrame();
	
	JLabel la1,la2,la3;
	JTextField tf1,tf2,tf3;
	JButton bt1,bt2,bt3;
	
	
	public Main() {
		init();
	}
	
	private void init() {
		
		la1 = new JLabel("걸그룹 이름을 입력하세요.");
		la1.setBounds(100, 0, 100, 100);
		frame.add(la1);
		
		frame.setSize(1000,1000);
		Dimension frameSize = frame.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((screenSize.width - frameSize.width)/2,(screenSize.height - frameSize.height)/2);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	public static void main(String[] args) {
		new Main();
	}
}
