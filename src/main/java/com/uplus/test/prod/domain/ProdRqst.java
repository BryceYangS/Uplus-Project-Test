package com.uplus.test.prod.domain;

import java.util.List;

import com.uplus.test.prod.rule.ProdRuleCheck;

public class ProdRqst {

	private ProdRqstDtl expiredPriceProd;
	private ProdRqstDtl activePriceProd;

	private List<ProdRqstDtl> activeAddedValueProdList;
	private List<ProdRqstDtl> expiredAddedValueProdList;

	private ProdRelationGroups prodRelationGroups;

	private ProdRuleCheck ruleCheck;

	public ProdRqst(List<ProdRqstDtl> prodRqstDtlList, ProdRuleCheck ruleCheck) {
		this.ruleCheck = ruleCheck;
	}
	
}
