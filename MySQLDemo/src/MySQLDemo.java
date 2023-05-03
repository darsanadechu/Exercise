import java.sql.*;

public class MySQLDemo {
	
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String username="root";
		String password="Darsana@2001";
		String query="SELECT * FROM StudentList WHERE admno=1000";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement st = con.createStatement();
			
			//select
			ResultSet rs1 = st.executeQuery(query);
			rs1.next();
			System.out.println("student with admno=1000 details:");
			String name = rs1.getString("name");
			System.out.println(name);
			String course = rs1.getString("course");
			System.out.println(course);
			String dob = rs1.getString("dob");
			System.out.println(dob);
			int income = rs1.getInt("income");
			System.out.println(income);
			
			//select whole table
			System.out.println("table:");
			ResultSet rs2 = st.executeQuery("SELECT * FROM StudentList");
			while(rs2.next())
			{
				System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getString(4)+" "+rs2.getString(5)+" "+rs2.getInt(6));
			}
			
			//update
			st.executeUpdate("UPDATE StudentList SET name = 'Darsana' WHERE admno = 1000");
			
			//insert
			String InsertQuery = "INSERT INTO StudentList VALUES (1009,'jj','F','2000-04-17','science',12000)";
			int m = st.executeUpdate(InsertQuery);
			if(m==1)
				System.out.println("insertion successfull");
		    else
				System.out.println("insertion failed");
			
			//delete
			st.executeUpdate("DELETE FROM StudentList WHERE admno = 1009");
			
			st.close();
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}