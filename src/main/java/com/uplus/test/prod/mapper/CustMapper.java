package com.uplus.test.prod.mapper;

import com.uplus.test.prod.domain.dto.CustDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustMapper {
    List<CustDto> findAll();
}
