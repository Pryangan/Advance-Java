import java.sql.*;
public class TestConnector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Successful");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinexam", "root", "");
			System.out.println("Connection Established");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from mst_user");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			st.close();
			con.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception "+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Not established");
		}
		
	}

}
