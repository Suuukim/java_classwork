package alb_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.sound.sampled.FloatControl;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import album.Album;
import album.AlbumDao;
import gui.MainPage;
import gui.MusicPlayer;

@SuppressWarnings("serial")
public class JI01 extends JFrame {
	private static String state = "stop";
	private static boolean muteSound = false;

	public JI01() {
		init();
	}
	

	private void init() {
		Album ji01 = AlbumDao.selectAlbum("ITZY", "JI01");
		File music = new File("D:\\프로젝트 자료\\src\\music_file\\ITZY 1집-LOCO.wav");

		// 재생 음악 타이틀
		JLabel title = new JLabel(ji01.getT_song());
		title.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		title.setForeground(Color.WHITE);
		title.setBounds(660, 130, 400, 40);

		// 음악 재생&일시정지
		JButton playPause = new JButton();
		ImageIcon playPause_pic = new ImageIcon(JI01.class.getResource("../image_files/playpause.png"));
		playPause.setIcon(playPause_pic);
		playPause.setBackground(Color.white);
		playPause.setBounds(550, 230, 90, 90);
		playPause.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (state == "stop") {
					MusicPlayer.Start(music);
					state = "play";
				} else if (state == "play") {
					MusicPlayer.Pause();
					state = "pause";
				} else {
					MusicPlayer.Play();
					state = "play";
				}
			}
		});

		// 음악 정지
		JButton stop = new JButton();
		ImageIcon pause_pic = new ImageIcon(JI01.class.getResource("../image_files/stop.png"));
		stop.setIcon(pause_pic);
		stop.setBackground(Color.white);
		stop.setBounds(750, 230, 90, 90);
		stop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MusicPlayer.Stop();
				state = "stop";
			}

		});

		// 음악 볼륨 조절
		JSlider volume = new JSlider();
		volume.setBounds(620, 340, 150, 40);
		volume.setBackground(MainPage.itzy_color);
		JLabel volume_l = new JLabel(Integer.toString(volume.getValue()));
		volume_l.setBounds(780, 337, 40, 40);
		volume_l.setForeground(Color.white);
		volume.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				volume_l.setText(Integer.toString(volume.getValue()));
				float v = (float) volume.getValue();
				FloatControl gainControl = (FloatControl) MusicPlayer.clip.getControl(FloatControl.Type.MASTER_GAIN);
				try {
					gainControl.setValue((float) (v*0.86-80));
				} catch (Exception ee) {
					System.out.println(ee.getMessage());
				}
			}
		});

		// 앨범 사진
		JLabel image = new JLabel();
		ImageIcon alb_pic = new ImageIcon(JI01.class.getResource("../image_files/ITZY_1.jpg"));
		image.setIcon(alb_pic);
		image.setBounds(100, 50, 350, 350);

		// 정보란
		// 그룹 이름
		JLabel team_name_l = new JLabel("그룹 :");
		team_name_l.setBounds(220, 430, 800, 100);
		team_name_l.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		team_name_l.setForeground(Color.white);

		JLabel team_name = new JLabel(ji01.getTeam_name());
		team_name.setBounds(600, 430, 800, 100);
		team_name.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		team_name.setForeground(Color.WHITE);

		// 앨범명
		JLabel alb_name_l = new JLabel("앨범명 :");
		alb_name_l.setBounds(220, 500, 800, 100);
		alb_name_l.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		alb_name_l.setForeground(Color.white);
		
		JLabel alb_name = new JLabel(ji01.getAlb_name());
		alb_name.setBounds(600, 500, 800, 100);
		alb_name.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		alb_name.setForeground(Color.WHITE);

		// 곡 수
		JLabel song_cnt_l = new JLabel(String.format("곡 수 :"));
		song_cnt_l.setBounds(220, 570, 800, 100);
		song_cnt_l.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		song_cnt_l.setForeground(Color.white);

		JLabel song_cnt = new JLabel(String.format("%d", ji01.getSong_cnt()));
		song_cnt.setBounds(600, 570, 800, 100);
		song_cnt.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		song_cnt.setForeground(Color.WHITE);

		// 타이틀 곡
		JLabel t_song_l = new JLabel(String.format("타이틀 곡 :"));
		t_song_l.setBounds(220, 640, 800, 100);
		t_song_l.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		t_song_l.setForeground(Color.white);

		JLabel t_song = new JLabel(ji01.getT_song());
		t_song.setBounds(600, 640, 800, 100);
		t_song.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		t_song.setForeground(Color.WHITE);

		// 발매일
		JLabel s_date_l = new JLabel("발매일 :");
		s_date_l.setBounds(220, 710, 800, 100);
		s_date_l.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		s_date_l.setForeground(Color.white);

		JLabel s_date = new JLabel(String.format("%s", ji01.getS_date()));
		s_date.setBounds(600, 710, 800, 100);
		s_date.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		s_date.setForeground(Color.WHITE);

		JPanel info = new JPanel();
		info.add(image);
		info.add(team_name_l);
		info.add(team_name);
		info.add(alb_name_l);
		info.add(alb_name);
		info.add(song_cnt_l);
		info.add(song_cnt);
		info.add(t_song_l);
		info.add(t_song);
		info.add(s_date_l);
		info.add(s_date);
		info.add(playPause);
		info.add(stop);
		info.add(volume);
		info.add(volume_l);
		info.add(title);
		info.setBounds(0, 0, 1000, 900);
		info.setLayout(null);
		info.setBackground(MainPage.itzy_color);

		this.setLayout(null);
		this.add(info);
		this.setBounds(0, 0, 1000, 900);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				MusicPlayer.Stop();
			}	
		});
	}

	public static void main(String[] args) {
		new JI01();
	}

}
