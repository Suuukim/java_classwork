package db.day1;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {		//오라클 idev 스키마 custom# 테이블에 고객을 추가하는 연습
								// SQL insert 실행
	public static void main(String[] args) {

		
		Connection conn = OracleConnectUtil.connect();
		System.out.println("main메소드 확인용 : " + conn);
		
		String sql = "INSERT INTO TBL_PRODUCT#" + 
				"(PCODE, CATEGORY, PNAME, PRICE) " + 
//				" VALUES('sana', '최사나', 'unknown', 22, sysdate)";	//항상 동일한 값.	-> 변경이 필요합니다.
			" VALUES(?, ?, ?, ?)";	//값 부분에 ? -> 해당값은 execute전에 대입
				
		
		//sql 을 실행할 객체 생성 -> PreparedStatement 타입 변수로 참조하고 이것으로 sql 쿼리도 실행합니다.
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
		
			//? 에 해당하는 값을 전달합니다. ? 순서를 1부터 시작하는 index로 지정합니다.
			pstmt.setString(1, "IPAD012");
			pstmt.setString(2, "A4");
			pstmt.setString(3, "아이패드20");
//			pstmt.setNString(parameterIndex, value);	-> 오라클데이터 타입이 NVARCHAR2, NCHAR 일때
			pstmt.setInt(4, 1150000);
			
			pstmt.execute();
			pstmt.close();
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		OracleConnectUtil.close(conn);
	}

}
		
	


