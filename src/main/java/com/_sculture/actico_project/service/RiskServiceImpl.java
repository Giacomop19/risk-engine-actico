package com._sculture.actico_project.service;

import com._sculture.actico_project.domain.DecisionResult;
import com._sculture.actico_project.domain.RiskEvaluation;
import com._sculture.actico_project.domain.RuleEngine;
import com._sculture.actico_project.dto.request.RiskRequestDTO;
import com._sculture.actico_project.dto.response.RiskResponseDTO;
import com._sculture.actico_project.repository.DecisionRepository;
import com._sculture.actico_project.repository.entity.DecisionEntity;
import org.springframework.stereotype.Service;

/**
 * Implementation of the RiskService interface.
 * Handles the business logic for risk evaluation, including rule engine processing and decision persistence.
 */
@Service
public class RiskServiceImpl implements RiskService {

    private final RuleEngine ruleEngine;
    private final DecisionRepository decisionRepository;

    /**
     * Constructs a new RiskServiceImpl with the required dependencies.
     *
     * @param ruleEngine the rule engine for evaluating risks
     * @param decisionRepository the repository for saving decisions
     */
    public RiskServiceImpl(RuleEngine ruleEngine,
                           DecisionRepository decisionRepository) {
        this.ruleEngine = ruleEngine;
        this.decisionRepository = decisionRepository;
    }

    /**
     * Evaluates the risk based on the provided request.
     * Creates a RiskEvaluation object, evaluates it using the rule engine, saves the decision, and returns the response.
     *
     * @param request the risk request data
     * @return the risk response data
     */
    @Override
    public RiskResponseDTO evaluateRisk(RiskRequestDTO request) {

        RiskEvaluation evaluation =
                new RiskEvaluation(
                        request.getCustomerId(),
                       request.getAmount(),
                        request.getCreditScore()

                );

        DecisionResult result = ruleEngine.evaluate(evaluation);

        DecisionEntity decisionEntity = new DecisionEntity();
        decisionEntity.setCustomerId(request.getCustomerId());
        decisionEntity.setDecision(result.getDecision());

        decisionRepository.save(decisionEntity);

        return new RiskResponseDTO(
                result.getDecision(),
                result.getReason()
        );
    }
}
