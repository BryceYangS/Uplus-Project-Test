package com.uplus.test.prod.domain;

import lombok.Getter;

import java.util.List;

import com.uplus.test.prod.rule.ProdRuleCheck;

@Getter
public class EntcProdRqstDomain {

  private EntrRqst entrRqst;
  private ProdRqst prodRqst;

  public EntcProdRqstDomain(EntrRqst entrRqst, List<ProdRqstDtl> prodRqstDtlList, ProdRuleCheck ruleCheck) {
    this.entrRqst = entrRqst;
    this.prodRqst = new ProdRqst(prodRqstDtlList, ruleCheck);
  }
}
