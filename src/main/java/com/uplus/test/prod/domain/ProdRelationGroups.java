package com.uplus.test.prod.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdRelationGroups {
	private Map<String, Map<String, List<String>>> prodRelations;

	public ProdRelationGroups(Map<String, Map<String, List<String>>> prodRelations) {
		this.prodRelations = prodRelations;
	}

	public List<String> getAllTargetProdCds(String prodCd, String relationCode) {
		return prodRelations.getOrDefault(prodCd, new HashMap<>()).getOrDefault(relationCode, Collections.emptyList());
	}
}
