package gui;

import java.sql.Date;

import ggroup.G_Group;
import ggroup.G_GroupDao;

public class Insert_test {
	public static void main(String[] args) {
		
		G_GroupDao ss = G_GroupDao.getG_GroupDao();
		
		G_Group gg = new G_Group();
		gg.setEnt_code(02);
		gg.setTeam_name("소녀시대");
		gg.setMember_cnt(9);
		gg.setD_song("다시만난세계");
		gg.setD_date(new Date(20070805));
		gg.setF_name("twinkle");
		gg.setLeader("태연");
		
		ss.insert(gg);
		
	}
}
