package com._sculture.actico_project.domain;

import lombok.Getter;

/**
 * Represents a risk evaluation entity containing customer details and financial information
 * used for assessing risk in transactions.
 */
@Getter
public class RiskEvaluation {

    private String customerId;
    private double amount;
    private int creditScore;

    /**
     * Constructs a new RiskEvaluation with the specified customer details.
     *
     * @param customerId the unique identifier of the customer
     * @param amount the transaction amount
     * @param creditScore the credit score of the customer
     */
    public RiskEvaluation(String customerId, double amount, int creditScore) {
        this.customerId = customerId;
        this.amount = amount;
        this.creditScore = creditScore;
    }
}
