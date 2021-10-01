package com.uplus.test.prod.service;

import java.util.Map;

import com.uplus.test.common.PrcType;
import com.uplus.test.prod.domain.EntcProdRqstDomain;
import com.uplus.test.prod.rule.EtcProdRuleCheck;
import com.uplus.test.prod.rule.PcProdRuleCheck;
import com.uplus.test.prod.rule.ProdRuleCheck;
import com.uplus.test.prod.rule.ScProdRuleCheck;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProdService {

    private final Map<String, ProdRuleCheck> ruleMap;

    public ProdRuleCheck saveTmp(String prcType) {
        ProdRuleCheck ruleCheck;

        if (PrcType.PRICE_PLAN_SCREEN_CONFIRM.isEqualCode(prcType)) {
            ruleCheck = new PcProdRuleCheck();
        } else if (PrcType.ADVP_SCREEN_CONFIRM.isEqualCode(prcType)) {
            ruleCheck = new ScProdRuleCheck();
        } else {
            ruleCheck = new EtcProdRuleCheck();
        }

        EntcProdRqstDomain prodRqstDomain = new EntcProdRqstDomain(null, null, ruleCheck);

        return ruleCheck;
    }

}
