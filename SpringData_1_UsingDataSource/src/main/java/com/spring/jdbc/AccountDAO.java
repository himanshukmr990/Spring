package com.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 



import javax.sql.DataSource;
 

public class AccountDAO  {
     
	private DataSource dataSource;
	 
		public ResultSet getAccounts() throws Exception {
	
			Connection conn = dataSource.getConnection();
			ResultSet result = conn.createStatement().executeQuery("SELECT * FROM accounts");
			return result; 
		}
		
	  public Account getAccount(int accountId) throws Exception {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM accounts where Id = ?");
			ps.setInt(1,accountId);
			ResultSet rs = ps.executeQuery();
			Account  account = new Account();
			rs.next();
			account.setId(rs.getInt(1));
			account.setName(rs.getString(2));
			return account; 
			
		}
 
	  
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	 
	

}
