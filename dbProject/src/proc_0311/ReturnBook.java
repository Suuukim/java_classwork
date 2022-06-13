package proc_0311;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import db.day1.OracleConnectUtil;

public class ReturnBook {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect();
		Scanner sc = new Scanner(System.in);
		String sql ="{ Call return_book(?,?,?,?) }";
		
		System.out.println("데이터를 입력하세요.");
		System.out.print("회원번호 입력 -> ");
		int mem_idx = Integer.parseInt(sc.nextLine());
		System.out.print("책코드번호 입력 -> ");
		String bcode = sc.nextLine();
		System.out.print("반납날짜 입력 -> ");
		String return_date = sc.nextLine();
		
		CallableStatement cstmt = null;
		
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, mem_idx);
			cstmt.setString(2, bcode);
			cstmt.setString(3, return_date);
			cstmt.registerOutParameter(4, Types.VARCHAR);
			
			cstmt.executeUpdate();
			System.out.println("실행 결과 : " + cstmt.getString(4));
			cstmt.close();
		}catch(SQLException e){
			System.out.println("실행 오류 : " + e.getMessage());
		}finally {
			OracleConnectUtil.close(conn);
		}
	}

}
