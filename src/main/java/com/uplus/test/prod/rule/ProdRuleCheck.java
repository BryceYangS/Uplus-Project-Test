package com.uplus.test.prod.rule;

import org.springframework.stereotype.Component;

/**
 *  룰 체크
 */
public abstract class ProdRuleCheck {

	public final void checkRbms() {
		System.out.println("haha");
		validationSvc();
	}

	abstract void validationSvc();

}
