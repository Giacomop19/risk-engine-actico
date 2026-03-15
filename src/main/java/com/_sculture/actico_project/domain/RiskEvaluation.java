package com._sculture.actico_project.domain;

import lombok.Getter;

@Getter
public class RiskEvaluation {

    private String customerId;
    private double amount;
    private int creditScore;

    public RiskEvaluation(String customerId, double amount, int creditScore) {
        this.customerId = customerId;
        this.amount = amount;
        this.creditScore = creditScore;
    }

    public String getCustomerId() { return customerId; }
    public double getAmount() { return amount; }
    public int getCreditScore() { return creditScore; }
}
