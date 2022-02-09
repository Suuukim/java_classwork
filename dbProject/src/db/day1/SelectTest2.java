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
			
			
				
			
			//결과 확인하기 : 테이블 데이터가 7개 행이 있는 상태입니다.
			System.out.println("행 데이터 보기 ------------------");
			while(rs.next()) {
			System.out.printf("custom_id : " + rs.getString("custom_id"));
			System.out.printf("name : " + rs.getString("name"));
			System.out.printf("semail : " + rs.getString("email"));
			System.out.printf("sage :" + rs.getInt("age"));
			System.out.printf("reg_data : " + rs.getDate("reg_date"));
			System.out.println(rs.getTimestamp("reg_date"));
			}
			pstmt.close();
			
		}catch(SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
	}

}
