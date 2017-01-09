package com.citi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryJdbc implements LoginRepository {

	//List<Login> loginList = new ArrayList();
	private JdbcTemplate jdbc;

	@Autowired
	public LoginRepositoryJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

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
		result = jdbc.queryForObject("select password from Users where username=?",new Object[] {username}, new RowMapper <String> (){

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				String password=rs.getString(1);
				return password;
			}
	
});
		return result;
	}

}
