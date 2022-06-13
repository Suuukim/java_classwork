package proc_0311;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import db.day1.OracleConnectUtil;

public class ReturnBook2 {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect();
		Scanner sc = new Scanner(System.in);
		String sql = "{ call return_book2(?,?) } ";
		
		System.out.println("데이터베이스에 저장합니다");
		System.out.print("책 번호 -> ");
		String bcode = sc.nextLine();
		System.out.print("반납 날짜 -> ");
		String return_date = sc.nextLine();
		
		
		CallableStatement cstmt=null;
		
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, bcode);
			cstmt.setString(2, return_date);
			cstmt.execute();
			cstmt.close();
		}catch (SQLException e) {
			System.out.println("실행오류 : " + e.getMessage());
		}
		finally {
			OracleConnectUtil.close(conn);
		}
	}
}
