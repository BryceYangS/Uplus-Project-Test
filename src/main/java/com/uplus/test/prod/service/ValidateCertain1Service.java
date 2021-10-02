package com.uplus.test.prod.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 특정 상품 속성 검증 로직
 * 부가서비스에 대한 검증 로직도 override
 */
@Service
@Transactional
public class ValidateCertain1Service extends ValidateCommonService {

	@Override
	protected void validatePriceProd(Map<String, String> service) {
		/* 요금제 검증 로직 */
	}

	@Override
	protected void validateSubProd(Map<String, String> service) {
		/* 부가서비스 속성 검증 로직*/
	}
}
