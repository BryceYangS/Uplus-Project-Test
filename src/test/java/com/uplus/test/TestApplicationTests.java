package com.uplus.test;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {


	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSQlSession() throws Exception{
		System.out.println(sqlSessionTemplate.toString());
	}

}
