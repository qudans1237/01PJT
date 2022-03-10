package sql;

import java.sql.*;

public class PreparedStmtTest {
	public static void main(String[] args) throws Exception {

		if (args.length != 3) {
			System.out.println("������ java Example02[no��][id��][pwd��]");
			System.exit(0);
		}

		int no = Integer.parseInt(args[0]);
		String id = args[1];
		String pwd = args[2];

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");

		// Statement / PreparedState �� ����
		// ====== Statement ��� ============
		// Statement stmt = con.createStatement();
		// String createSql = "insert into member values("+no+","_+"'+id+'","'+pwd+'")";
		// int confirm = stmt.executeUpdate(createSql);

		// ======= PreparedStatement ��� =============
		// PrepareStatement �ν��Ͻ� ������ SQL����
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?)");

		// PreparedStatement method ��� Data SET ('' ���ʿ�)
		pstmt.setInt(1, no);
		pstmt.setString(2, id);
		pstmt.setString(3, pwd);
		int confirm = pstmt.executeUpdate();
		/////////////////////////////////////////////

		if (confirm == 1) {
			System.out.println("number TABLE DATA INSERT �Ϸ�");
		} else {
			System.out.println("number TABLE DATA INSERT ����");
		}

		if (pstmt != null) {
			pstmt.close();
		}
		if (con != null) {
			con.close();
		}
	}
}