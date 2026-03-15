package com._sculture.actico_project.integration;

import com._sculture.actico_project.domain.DecisionResult;
import com._sculture.actico_project.domain.RiskEvaluation;
import com._sculture.actico_project.domain.RuleEngine;
import org.springframework.stereotype.Component;

@Component
public class ActicoRuleEngine implements RuleEngine {

    @Override
    public DecisionResult evaluate(RiskEvaluation evaluation) {

        if(evaluation==null){
            return null;
        }
        if(evaluation.getCreditScore()<600){
            return new DecisionResult("REJECT", "Credit score too low");
        }
        if(evaluation.getAmount()>50000){
            return new DecisionResult("MANUAL REVIEW", "Amount exceeds automatic approval threshold");
        }
        return new DecisionResult("APPROVED", "Risk acceptable");
    }
}
