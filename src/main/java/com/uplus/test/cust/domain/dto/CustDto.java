package com.uplus.test.cust.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustDto {

  private String custId;
  private String custType;
  private String custNm;
  private String custBday;
  private int custAge;

  public void setCustBday(String custBday) {
    this.custBday = custBday;

    System.out.println(custBday.substring(0, 2));
    if (custBday.substring(0, 2).equals("00")) {
      this.custAge = 0;
    }else{
      this.custAge = 99;
    }
  }
}
