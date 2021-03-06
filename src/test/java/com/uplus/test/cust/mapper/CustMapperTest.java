package com.uplus.test.cust.mapper;

import com.uplus.test.cust.domain.dto.CustDto;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


class CustMapperTest {


  @Autowired
  CustMapper custMapper;

  @Test
  void findAll() {
    List<CustDto> custDtoList = custMapper.findAll();

    assertThat(custDtoList.size()).isEqualTo(5);


  }
}