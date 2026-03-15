package com._sculture.actico_project.service;

import com._sculture.actico_project.dto.request.RiskRequestDTO;
import com._sculture.actico_project.dto.response.RiskResponseDTO;

public interface RiskService {

    RiskResponseDTO evaluateRisk(RiskRequestDTO riskRequest);
}
