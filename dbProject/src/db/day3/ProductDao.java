package db.day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day1.OracleConnectUtil;
import db.vo.Custom;
import db.vo.Product;

public class ProductDao {
	//변수명 한꺼번에 바꾸기 : alt + shift + r
	//singleton
	private static ProductDao productdao = new ProductDao();
	
	private ProductDao() { }
	
	public static ProductDao getInstance() {
		return productdao;
	}
	
	//selectOne 쿼리
	public static Product selectOne(String pcode) {
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt = null;
		String sql="select * from tbl_product# where pcode = ?";
		ResultSet rs= null;	
		Product vo = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pcode);
			rs=pstmt.executeQuery();
			if(rs.next()) {			//조회 결과 1개 행 있으면
				vo = new Product();
				vo.setPcode(rs.getString(1));
				vo.setCategory(rs.getString(2));
				vo.setPname(rs.getNString(3));
				vo.setPrice(rs.getInt(4));
			}	//없으면 (else) null 반환 
			
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		//?
		
		OracleConnectUtil.close(conn);
		return vo;
	}
	
	//insert 쿼리
	public void insert(Product vo) {
		Connection conn = OracleConnectUtil.connect();
		String sql = "INSERT INTO TBL_PRODUCT#" + 
				"(PCODE, CATEGORY, PNAME, PRICE) " + 
				" VALUES(?, ?, ?, ?)";
				
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
		
			//? 에 해당하는 값을 전달합니다. ? 순서를 1부터 시작하는 index로 지정합니다.
			pstmt.setString(1, vo.getPcode());
			pstmt.setString(2, vo.getCategory());
			pstmt.setString(3, vo.getPname());
			pstmt.setInt(4, vo.getPrice());
			
			pstmt.execute();
			System.out.println("고객 1건이 새로 등록되었습니다.!!");
			pstmt.close();
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		OracleConnectUtil.close(conn);
	}
	
	//update 쿼리
	public void update(Product vo) {
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt = null;
		String sql = "UPDATE TBL_PRODUCT# SET PNAME = ?, PRICE =?, CATEGORY=? WHERE PCODE=?";
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  vo.getPname());			//방법2)
			pstmt.setInt(2,  vo.getPrice());			//방법2)
			pstmt.setString(3,  vo.getCategory());			//방법2)
			pstmt.setString(4, vo.getPcode());		//방법2)
			
			pstmt.execute();
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		System.out.println("정상적으로 email이 변경 되었습니다.");
		OracleConnectUtil.close(conn);
	} 
		
	
	//delete 쿼리
	public void delete(String pcode) {
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM TBL_PRODUCT# WHERE PCODE=?";
		//String custom_id = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pcode);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		System.out.println("정상적으로 회원 탈퇴되었습니다.");
		OracleConnectUtil.close(conn);
	}
	
	public List<Product> selectAll() {
		Connection conn = OracleConnectUtil.connect();
		String sql="select * from tbl_pcode#";
		PreparedStatement pstmt = null;
		ResultSet rs= null;		
		List<Product> products = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();	//select 
			
			while(rs.next()) {
				products.add(new Product(rs.getString(1), 		//방법1) 커스텀생성자
							rs.getString(2), 
							rs.getString(3), 
							rs.getInt(4) ));
			}	
			pstmt.close();
			
		}catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		OracleConnectUtil.close(conn);
		return products;
	}
	
}
