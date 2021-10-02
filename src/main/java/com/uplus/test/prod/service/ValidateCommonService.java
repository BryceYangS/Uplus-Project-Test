package com.uplus.test.prod.service;

import java.util.Map;

public abstract class ValidateCommonService {
	public final void validateService(Map<String, String> service) {
		validatePriceProd(service);
		validateSubProd(service);
	}

	protected abstract void validatePriceProd(Map<String, String> service);

	protected void validateSubProd(Map<String, String> service) {
	}
}
