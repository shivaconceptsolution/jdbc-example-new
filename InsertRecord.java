package scs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ramdb","root","");
		Statement st = conn.createStatement();
	//	int x = st.executeUpdate("insert into stu(rno,sname) values(3,'jay kumar')");
	//	int x = st.executeUpdate("update stu set sname='test' where rno=2");
		int x = st.executeUpdate("delete from stu where rno=2");
		if(x!=0)
		{
			System.out.println("Data Inserted Successfully");
		}
		else
		{
			System.out.println("Data Not Inserted Successfully");
		}
		
		

	}

}
