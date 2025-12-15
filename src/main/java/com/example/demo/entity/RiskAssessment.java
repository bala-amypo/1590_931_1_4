package com.example.demo.entity;

import java.time.LocalDateTime;

public class RiskAssessment {
    
    private long id;
    private LoanApplication loanApplication;
    private String eligibilityStatus;
    private String riskLevel;
    private Integer score;
    private Double debtToIncomeRatio;
    private String remarks;
    private LocalDateTime evaluatedOn;

    public RiskAssessment(){}

    public RiskAssessment(LoanApplication loanApplication, String eligibilityStatus, String riskLevel, Integer score,
            Double debtToIncomeRatio, String remarks, LocalDateTime evaluatedOn) {
        this.loanApplication = loanApplication;
        this.eligibilityStatus = eligibilityStatus;
        this.riskLevel = riskLevel;
        this.score = score;
        this.debtToIncomeRatio = debtToIncomeRatio;
        this.remarks = remarks;
        this.evaluatedOn = evaluatedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }

    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    public void setEligibilityStatus(String eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Double getDebtToIncomeRatio() {
        return debtToIncomeRatio;
    }

    public void setDebtToIncomeRatio(Double debtToIncomeRatio) {
        this.debtToIncomeRatio = debtToIncomeRatio;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDateTime getEvaluatedOn() {
        return evaluatedOn;
    }

    public void setEvaluatedOn(LocalDateTime evaluatedOn) {
        this.evaluatedOn = evaluatedOn;
    }

    
}
