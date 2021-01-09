import java.sql.*;
import java.util.Scanner;
public class ConnectDemo 
{
	public static void main(String args[])
	{
		
		try 
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter dept id");
			int deptid=sc.nextInt();
			System.out.println("Enter dept name");
			String deptname=sc.next();
			System.out.println("Enter dept location");
			String deptloc=sc.next();
				Class.forName("oracle.jdbc.OracleDriver");
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sys as sysdba","oracle");
				Statement stmt=con.createStatement();
				PreparedStatement ps=con.prepareStatement("insert into dept values(?,?,?)");
				ps.setInt(1,deptid);
				ps.setString(2,deptname);
				ps.setString(3,deptloc);
				ps.executeUpdate();
				
				ResultSet rs=stmt.executeQuery("Select * from dept");
				
				while(rs.next())
				{
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				
			}
			
			catch (SQLException e) {
			
				System.out.println(e.getMessage());
			}
			catch ( ClassNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
	
	}
}
