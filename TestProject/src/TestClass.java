
import java.sql.*;


public class TestClass {

	public static void main(String[] args) {
	
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select * from emp");
			
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				
			}
			
			
		} catch (SQLException e) {
			
			System.out.println(e);
			
			
			
		}
		
		
		
	}

}
