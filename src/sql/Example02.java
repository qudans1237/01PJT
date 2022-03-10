package sql;

import java.sql.*;
import java.util.Scanner;

class Example02 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		System.out.println("��� ��ȣ�� �Է��ϼ���: ");
		int no = sc.nextInt();

		sc.nextLine();
		System.out.println("��� ���̵� �Է��ϼ���: ");
		String id = sc.nextLine();

		sc.nextLine();
		System.out.println("��� ��й�ȣ�� �Է��ϼ���: ");
		String pwd = sc.nextLine();

		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, "scott", "tiger");

//		Statement stmt = con.createStatement();
//		
//		String createSql = "insert into member values('"+no+"',+'"+id+"','"+pwd+"')";
//		
//		System.out.println(stmt.executeUpdate(createSql));
		PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?)");
		pstmt.setInt(1, no);
		pstmt.setString(2, id);
		pstmt.setString(3, pwd);
		int confirm = pstmt.executeUpdate();

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