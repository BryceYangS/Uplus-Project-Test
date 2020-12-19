package com.uplus.test.prod.service;


import static org.junit.jupiter.api.Assertions.*;

import com.uplus.test.prod.domain.dto.CustDto;
import com.uplus.test.prod.mapper.CustMapper;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;


class CustServiceTest {

  @Autowired
  private CustMapper custMapper;

  @Test
  void getAllCust() {
    List<CustDto> custDtoList =  custMapper.findAll();
    assertThat(custDtoList.size()).isEqualTo(5);

  }
}