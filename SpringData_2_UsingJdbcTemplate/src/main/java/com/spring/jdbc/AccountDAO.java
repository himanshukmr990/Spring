package com.spring.jdbc;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
/*
 * NO Pre Query stuff  (getConnection,prepareStatement) 
 * NO Post Query Stuff (closing ResultSet,Handling Exception) 
 * 
 */

public class AccountDAO {
	
 
	private JdbcTemplate jdbcTemplate; 						 
	
	 
	public int getAccountsCount() {

		String sql="SELECT count(*) FROM accounts"; 
		int result=jdbcTemplate.queryForObject(sql,Integer.class);
		return result;
	}
  
	public String getAccountName(int accountId) {
		String sql="SELECT name FROM accounts  where Id = ? "; 
//		String ac_name=jdbcTemplate.queryForObject(sql, new Object[] {accountId}, String.class);
		String ac_name=jdbcTemplate.queryForObject(sql,String.class,accountId);
		return ac_name;
 	}
	
	 
	public Account getAccountDetails(Integer id) {
		String SQL = "select name from accounts  where  Id = ?"; 
		
		/** ROW MAPPER :To assist JdbcTemplate to map the result(columns) of SQL to the class (properties)
	     	- BeanPropertyRowMapper is a defaults RowMapper implementation that converts a row into a new instance 
		      of the specified mapped target class.
		**/
		
		Account account = jdbcTemplate.queryForObject(SQL, new Object[] { id },new BeanPropertyRowMapper<Account>(Account.class));
		

		/**MAPPER:- Using user defined Row Mapper **/
		
//		Account account = jdbcTemplate.queryForObject(SQL, new Object[] { id }, new AccountMapper());
		
		
		
		return account;
	}
	
	 
	public List<Account> listAllAccounts(){            
		String SQL = "select * from accounts "; 
		List<Account> accounts = jdbcTemplate.query(SQL, new AccountMapper());
		return accounts;
	}
	
	 
	public int create(int id,String name) {
		String SQL = "insert into account ( id,  name) values (?, ?)"; 
		return jdbcTemplate.update(SQL, id, name);
	}
 
	 
	public int delete(int id) {
		
		String SQL = "delete from account  where Id = ?"; 
		
        return jdbcTemplate.update(SQL, id);		 
	}

	 
	public int update(int id, String name) {
		String SQL = "update account  set  name = ? where id = ?"; 
		return jdbcTemplate.update(SQL, name, id);
		 
	}
	
	// execute for DDL
	public void createTable() {
		String SQL = "create table Table2 (id integer , name varchar(20))"; 
		jdbcTemplate.execute(SQL);
		System.out.println("Table Created"); 
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
