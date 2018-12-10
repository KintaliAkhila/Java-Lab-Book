package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import entity.Customer;
import entity.Laptop;
public class LaptopDbConnection {

	    Customer cust=new Customer();

		public void insertCustDetais() throws ClassNotFoundException  {
			
			Scanner sc=new Scanner(System.in);
	
			
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg701","training701");
				PreparedStatement pst=con.prepareStatement("insert into customer values(?,?,?,?)");
				
				pst.setString(1,cust.getCustName());
				
				pst.setString(2,cust.getCustAddress());
				
				pst.setString(3,cust.getCustMailId());
				
				pst.setLong(4,cust.getCustPhoneNo());
				pst.execute();
				ResultSet rs=pst.executeQuery("select * from laptop");
				while(rs.next())
				{
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getInt(4));
				}
			}
				
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		
		
		
		}

	
	}