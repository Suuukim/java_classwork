package db.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import db.day1.OracleConnectUtil;

public class Delete {
	public static void main(String[] args) {
		//원하는 고객ID 입력받아서 회원탈퇴를 해보세요.
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt;
		
		String sql = "DELETE FROM TBL_CUSTOM# tp WHERE custom_id = ?";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객 ID를 입력하세요 -> ");
		String id = sc.nextLine();
		System.out.print("삭제가 완료되었습니다. ");
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setNString(1, id);
			
			pstmt.execute();
			pstmt.close();
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
	
		OracleConnectUtil.close(conn);
		
	}
}
