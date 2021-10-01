package com.uplus.test.prod.controller;

import com.uplus.test.prod.domain.EntcProdRqstDomain;
import com.uplus.test.prod.domain.EntrRqst;
import com.uplus.test.prod.domain.ProdRqstDtl;
import io.swagger.annotations.ApiOperation;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdController {


  @ApiOperation(value = "상품 테스트")
  @GetMapping("/prods/v1")
  public void test() {

  }
}
