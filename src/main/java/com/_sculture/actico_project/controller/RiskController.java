package com._sculture.actico_project.controller;

import com._sculture.actico_project.dto.request.RiskRequestDTO;
import com._sculture.actico_project.dto.response.RiskResponseDTO;
import com._sculture.actico_project.service.RiskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for handling risk evaluation operations.
 * Provides endpoints for assessing risks based on input data.
 */
@RestController
@RequestMapping("/api/v1/risk")
public class RiskController {

    private final RiskService riskService;

    public RiskController(RiskService riskService) {
        this.riskService = riskService;
    }

    /**
     * Evaluates the risk for a given request.
     * This endpoint processes the risk evaluation request and returns the result.
     *
     * @param request the {@link RiskRequestDTO} containing the data for risk evaluation
     * @return a {@link RiskResponseDTO} with the risk evaluation result
     */
    @PostMapping("/evaluate")
    public RiskResponseDTO evaluate(@RequestBody RiskRequestDTO request){
        return riskService.evaluateRisk(request);
    }
}
