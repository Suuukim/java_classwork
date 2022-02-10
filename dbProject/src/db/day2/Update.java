package db.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day1.OracleConnectUtil;

public class Update {

	public static void main(String[] args) {
		//원하는 고객ID 입력받아서 email 을 수정하게 해주세요.
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt;
		
		String sql = "UPDATE tbl_custom# set email = ? where custom_id = ?";
		Scanner sc = new Scanner(System.in);
		System.out.print("고객 ID를 입력하세요 -> ");
		String id = sc.nextLine();
		System.out.print("수정할 email을 입력하세요. -> ");
		String email = sc.nextLine();
		
		try {
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, email);
			pstmt.setString(2, id);
			
			pstmt.execute();
			pstmt.close();
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		OracleConnectUtil.close(conn);
		
		
		
	}

}
