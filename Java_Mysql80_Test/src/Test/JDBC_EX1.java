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
			System.out.println("DB ���� �Ϸ�");
			} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
			} catch (SQLException e) {
			System.out.println("DB ���� ����");
			}
			}

	}