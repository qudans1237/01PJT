package sql;

import java.sql.*;

public class DeleteJDBC{
	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		
		Statement stmt = con.createStatement();
		
		String sql = "DELETE FROM firstJDBC";
		
		int i = stmt.executeUpdate(sql);
		System.out.println("delete�� record�� ���� :"+i+"���� �����Ǿ����ϴ�.");
		
		if(stmt != null){
			 stmt.close();
		}
		if(con != null){
			con.close();
		}
	}
}