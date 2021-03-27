package com.uplus.test.common;

import lombok.Getter;

@Getter
public enum PrcType {
    PRICE_PLAN_SCREEN_CONFIRM("PC", "요금제"),
    ADVP_SCREEN_CONFIRM("SC","부가"),
    SAVE("AC", "저장");

    private String code;
    private String name;

    PrcType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public boolean isEqualCode(String prcType){
        return this.getCode().equals(prcType);
    }

}
