package com._sculture.actico_project.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DecisionEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String customerId;
    private String decision;

    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public void setDecision(String decision) { this.decision = decision; }


}
