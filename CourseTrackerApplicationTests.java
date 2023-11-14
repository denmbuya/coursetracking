package com.course.tracker;

import static org.assertj.core.api.Assertions.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

// @SpringBootTest
class CourseTrackerApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() {

	}

	@Test
	void ItShouldAddNumbers() {
		int numberOne = 20;
		int numberTwo = 30;
		Calculator underTest = new Calculator(numberOne, numberTwo);

		int results = underTest.add(numberOne, numberTwo);
		assertThat(results).isEqualTo(50);
	}

	@Test
	public void testGivenDatasourceAvailableWhenAccessDatailsThenExpectDetails() throws SQLException {
		assertThat(dataSource.getClass().getName()).isEqualTo("com.zaxxer.hikari.HikariDataSource");
		assertThat(dataSource.getConnection().getMetaData().getDatabaseProductName()).isEqualTo("H2");
	}

	class Calculator {
		int a, b;

		Calculator(int a, int b) {
			this.a = a;
			this.b = b;
		}

		int add(int a, int b) {
			return a + b;
		}
	}

}
