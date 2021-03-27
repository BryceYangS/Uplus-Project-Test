package com.uplus.test.cust.mapper;

import com.uplus.test.cust.domain.dto.CustDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustMapper {
    List<CustDto> findAll();
}
