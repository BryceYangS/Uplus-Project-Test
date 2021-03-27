package com.uplus.test.prod.domain;

import lombok.Data;

@Data
public class EntrRqst {

  private String rqstNo;
  private String hldUsrNo;
  private String rlUsrNo;
  private String prcType;
  private Cust hldUsr;
  private Cust rlUsr;

  private static class Cust{
    private String custKdCd;
    private int age;
  }


}
