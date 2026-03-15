package com._sculture.actico_project.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RiskRequestDTO {

    private String customerId;
    private double amount;
    private int creditScore;
    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public int getCreditScore() { return creditScore; }
    public void setCreditScore(int creditScore) { this.creditScore = creditScore; }

}
