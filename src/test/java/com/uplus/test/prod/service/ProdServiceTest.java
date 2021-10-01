package com.uplus.test.prod.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.uplus.test.prod.rule.ScProdRuleCheck;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdServiceTest {

	@Autowired
	private ProdService prodService;

	@Test
	public void ruleChekcInitTest() {
		assertThat(prodService.saveTmp("SC")).isInstanceOf(ScProdRuleCheck.class);

	}

}