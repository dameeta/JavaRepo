package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mySqlJava {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2) + " "+ rs.getString(3)+" "+ rs.getString(4)+" " + rs.getInt(5) );
		}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			con.close();

		}
		int xc[]=new int[3];
		xc[0]=22;
		xc[1]=21;
		xc[2]=22;
		try {
			for(int i=0;i<4;i++)
			{
				System.out.println(xc[i]);
				
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		System.out.println("Please check the limit of array " +  e);
		}
	}

}
