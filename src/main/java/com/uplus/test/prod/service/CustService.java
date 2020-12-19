package com.uplus.test.prod.service;

import com.uplus.test.prod.domain.dto.CustDto;
import com.uplus.test.prod.mapper.CustMapper;
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
