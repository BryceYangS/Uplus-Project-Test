package com.uplus.test.prod.service;

import com.uplus.test.common.PrcType;
import com.uplus.test.prod.domain.EntcProdRqstDomain;
import com.uplus.test.prod.domain.EntrRqst;
import com.uplus.test.prod.domain.ProdRqst;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ProdService {

    public boolean isPC(String prcType){
        EntrRqst entrRqst = new EntrRqst();
        entrRqst.setPrcType(prcType);
        EntcProdRqstDomain entcProdRqstDomain = new EntcProdRqstDomain(entrRqst, Arrays.asList(new ProdRqst(), new ProdRqst()));

//        PrcType.PRICE_PLAN_SCREEN_CONFIRM.getCode().equals(entrRqst.getPrcType())
//        PrcType.PRICE_PLAN_SCREEN_CONFIRM.isEqualCode(entrRqst.getPrcType())
        return PrcType.PRICE_PLAN_SCREEN_CONFIRM.isEqualCode(entrRqst.getPrcType());
    }

}
