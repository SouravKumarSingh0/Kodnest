import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class MianApp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "root123";
		
		String sql1 = "insert into student values(?,?)";
		
		Connection conn = null;
		try {
			//Establishing connection
			conn = DriverManager.getConnection(url, username, password);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student name");
			String name = sc.next();
			
			System.out.println("Enter the student age");
			int age = sc.nextInt();
			
			Student student = new Student(name, age);
			String sname = student.getNmae();
			int sage = student.getAge();
			
			conn.setAutoCommit(false);
			
		PreparedStatement pt = conn.prepareStatement(sql1);
		pt.setString(1, sname);
		pt.setInt(2, sage);
		int executeUpdate = pt.executeUpdate();
		conn.commit();
		}
		
		catch(Exception e) {
			System.out.println("exception occured");
			conn.rollback();
		}
		
		System.out.println("success");
		

	}

}
