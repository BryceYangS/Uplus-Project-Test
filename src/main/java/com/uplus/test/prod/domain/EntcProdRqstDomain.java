package com.uplus.test.prod.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class EntcProdRqstDomain {

  private EntrRqst entrRqst;
  private List<ProdRqst> prodRqstList;

  public EntcProdRqstDomain(EntrRqst entrRqst,
      List<ProdRqst> prodRqstList) {
    this.entrRqst = entrRqst;
    this.prodRqstList = prodRqstList;
  }
}
