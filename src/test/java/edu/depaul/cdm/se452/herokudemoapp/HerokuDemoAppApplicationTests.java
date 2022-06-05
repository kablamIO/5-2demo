package edu.depaul.cdm.se452.herokudemoapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.depaul.cdm.se452.herokudemoapp.student.StudentRepository;

@SpringBootTest
class HerokuDemoAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private StudentRepository repository;

	@Test
	void testDatabaseConnection() {
		long expected = 5;
		long actual = repository.count();
		assertEquals(expected, actual);
	}

}
