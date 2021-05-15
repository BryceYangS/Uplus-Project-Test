package com.uplus.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uplus.test.prod.rule.EtcProdRuleCheck;
import com.uplus.test.prod.rule.PcProdRuleCheck;
import com.uplus.test.prod.rule.ProdRuleCheck;
import com.uplus.test.prod.rule.ScProdRuleCheck;
import com.uplus.test.prod.service.ProdService;

@Configuration
public class ProdRuleCheckConfig {

	@Bean
	public ProdRuleCheck pcProdRuleCheck() {
		return new PcProdRuleCheck();
	}

	@Bean
	public ProdRuleCheck scProdRuleCheck() {
		return new ScProdRuleCheck();
	}

	@Bean
	public ProdRuleCheck etcProdRulcCheck() {
		return new EtcProdRuleCheck();
	}
}
