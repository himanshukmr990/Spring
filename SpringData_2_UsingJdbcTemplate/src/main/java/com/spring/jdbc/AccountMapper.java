package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountMapper implements RowMapper<Account> {

	//will be called for every record by JDBCTemplate,ResultSet will be same for every call but rownum will be changing starts from 0
	public Account mapRow(ResultSet rs, int rownum) throws SQLException {
		System.out.println("rownum "+rownum);
		  Account account = new Account();
	      account.setId(rs.getInt("Id"));
	      account.setName(rs.getString("Name"));
	      return account;
	}

}
