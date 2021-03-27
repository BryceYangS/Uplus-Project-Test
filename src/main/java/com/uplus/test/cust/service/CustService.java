package com.uplus.test.cust.service;

import com.uplus.test.cust.domain.dto.CustDto;
import com.uplus.test.cust.mapper.CustMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustService {

  @Autowired
  private CustMapper custMapper;

  public List<CustDto> getAllCust(){
    return custMapper.findAll();
  }
}
