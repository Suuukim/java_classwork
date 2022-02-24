package gui;

import ggroup.G_Group;
import ggroup.G_GroupDao;

public class Update_test {
	public static void main(String[] args) {
		
		G_GroupDao ss = G_GroupDao.getG_GroupDao();
		G_Group gg = new G_Group();
		
		gg.setD_song("다시만난세계");
		gg.setEnt_code(02);
		
		ss.update(gg);
		
	}
}
