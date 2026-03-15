package com._sculture.actico_project.domain;

import lombok.Getter;

@Getter
public class DecisionResult {

    private String decision;
    private String reason;

    public DecisionResult(String decision, String reason) {
        this.decision = decision;
        this.reason = reason;
    }

    public String getDecision() { return decision; }
    public String getReason() { return reason; }
}
