package com._sculture.actico_project.dto.response;

import lombok.Getter;

@Getter
public class RiskResponseDTO {

    private String decision;
    private String reason;

    public RiskResponseDTO(String decision, String reason) {
        this.decision = decision;
        this.reason = reason;
    }

    public String getDecision() { return decision; }
    public String getReason() { return reason; }
}
