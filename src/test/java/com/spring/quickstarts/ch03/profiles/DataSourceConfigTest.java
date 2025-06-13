package com.spring.quickstarts.ch03.profiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class DataSourceConfigTest {

	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(classes = DataSourceConfig.class)
	@ActiveProfiles("dev")
	public static class DevDataSourceTest {
		
		@Autowired
		private DataSource dataSource;
		
		@Test
		public void should_be_embedded_datasource() {
			assertNotNull(dataSource);
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			List<String> results = jdbcTemplate.query("select id, name from employee", new RowMapper<String>() {
		        @Override
		        public String mapRow(ResultSet rs, int rowNum) throws SQLException {
		          return rs.getLong("id") + ":" + rs.getString("name");
		        }
		      });
			assertEquals(1, results.size());
		    assertEquals("1:A", results.get(0));
		}
		
	}
	
}
