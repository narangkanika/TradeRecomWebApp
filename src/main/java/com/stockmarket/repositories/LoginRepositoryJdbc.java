package com.stockmarket.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.stockmarket.customer.Customer;
import com.stockmarket.stock.Stock;

@Repository
public class LoginRepositoryJdbc implements LoginRepository {

	//List<Login> loginList = new ArrayList();
	private JdbcTemplate jdbc;
	//private Customer customer,result;
	/*Customer customer=new Customer();
	Customer result=new Customer();*/
	@Autowired
	public LoginRepositoryJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	
	
	/*@Autowired 
	public LoginRepositoryJdbc(Customer cust){
		this.customer=cust;
		this.result=cust;
	}*/

	/*@Override
	public List<Login> findAll() {

		return jdbc.query("select username,password from Users order by lastName", new RowMapper<Login>() {

			@Override
			public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
				Login login = new Login();
				login.setUsername(rs.getString(1));
				login.setPassword(rs.getString(2));
				return login;
			}

		});
	}*/

	@Override
	public String getPassword(String username) {
		String result="";
		//hardcoding the password now to test
		//result ="Jha";
		result = jdbc.queryForObject("select password from Users where username=?",new Object[] {username}, new RowMapper <String> (){

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				String password=rs.getString(1);
				return password;
			}
	
});
		return result;
	}

	@Override
	public Customer getCustomerDetails(String uname) {

		Customer result = jdbc.queryForObject("select * from Users where username=?",new Object[] {uname}, new RowMapper <Customer> (){

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();
				customer.setUsername(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setPassword(rs.getString(3));
				customer.setGender(rs.getString(4));
				customer.setDateOfBirth(rs.getString(5));
				customer.setPhoneNumber(rs.getLong(6));
				customer.setEmailId(rs.getString(7));
				customer.setMarketCapType(rs.getString(8));
				return customer;
			}
	
});
		return result;
	}

	@Override
	public List<Stock> getStockData(String que) {
		return jdbc.query(que, 
				new RowMapper<Stock>(){

					@Override
					public Stock mapRow(ResultSet rs, int rowNum) throws SQLException {
						Stock stock = new Stock();
						stock.setSymbol(rs.getString(2));
						stock.setCompanyName(rs.getString(3));
						stock.setPrice(rs.getDouble(4));
						stock.setOutstandingShares(rs.getInt(5));
						stock.setMarketCapitalization(rs.getDouble(6));
						stock.setMarketCapType(rs.getString(7));
						return stock;
					}
			
		});
	}

	@Override
	public void updateStockData(List<Stock> list) {
		// TODO Auto-generated method stub
		
	}

}
