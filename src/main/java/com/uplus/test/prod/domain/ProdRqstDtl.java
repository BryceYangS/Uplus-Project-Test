package com.uplus.test.prod.domain;

import java.time.LocalDateTime;

public class ProdRqstDtl {
	private LocalDateTime prodEndDateTime;



	public boolean isExpired() {
		return prodEndDateTime.isBefore(LocalDateTime.of(9999, 12, 31, 23,59,59));
	}
}
