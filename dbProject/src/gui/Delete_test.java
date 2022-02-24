package gui;

import ggroup.G_Group;
import ggroup.G_GroupDao;

public class Delete_test {
	public static void main(String[] args) {
		
		G_GroupDao ss = G_GroupDao.getG_GroupDao();
		G_Group gg = new G_Group();
		gg.setTeam_name("소녀시대");
		
		ss.delete("소녀시대");
		System.out.println(ss);
	}
}
