package db.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest2 {
// ResultSet 타입 쿼리 결과를 모두 출력하기 : rs.next() 반복조건으로 이용하여 합니다.
	public static void main(String[] args) {

		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom#";
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;		
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.execute();			//insert, update, delete에 사용.
			rs = pstmt.executeQuery();	//select 사용.
			
			System.out.println("행 데이터 보기 ------------------");
			int i=1;
			while(rs.next()) {
			System.out.println(i++ + "행  ");
			System.out.print(String.format("%-20s", rs.getString("custom_id")));		//문자열 오른쪽정렬이 기본
			System.out.print(String.format("%-20s", rs.getString("name")));				// ㄴ -기호는 왼쪽 정렬
			System.out.print(String.format("%-20s", rs.getString("email")));
			System.out.print(String.format("%5d    ", rs.getInt("age")));
			System.out.println(rs.getTimestamp("reg_date"));
			}
			pstmt.close();
			
		}catch(SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
	}

}
