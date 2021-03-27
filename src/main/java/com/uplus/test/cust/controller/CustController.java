package com.uplus.test.cust.controller;


import com.uplus.test.cust.domain.dto.CustDto;
import com.uplus.test.cust.service.CustService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustController {

  @Autowired
  CustService custService;

  @GetMapping("/api/v1.0/cust")
  public List<CustDto> getllCust() throws Exception{
    return custService.getAllCust();




  }

}
