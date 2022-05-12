package Test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:13306/sampledb", "hr3","1234");
			System.out.println("DB 연결 완료");
			} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
			} catch (SQLException e) {
			System.out.println("DB 연결 오류");
			}
			}

	}