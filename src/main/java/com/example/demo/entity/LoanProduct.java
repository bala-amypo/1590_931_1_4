package com.example.demo.entity;

import java.math.BigDecimal;

public class LoanProduct {

    private long id;
    private String productCode;
    private String productName;
    private String loanType;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private Integer minTenureMonths;
    private Integer maxTenureMonths;
    private Double annualInterestRatePercent;
    private Integer baseRiskWeight;

    public LoanProduct(){}

    public LoanProduct(String productCode, String productName, String loanType, BigDecimal minAmount,
            BigDecimal maxAmount, Integer minTenureMonths, Integer maxTenureMonths, Double annualInterestRatePercent,
            Integer baseRiskWeight) {
        this.productCode = productCode;
        this.productName = productName;
        this.loanType = loanType;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.minTenureMonths = minTenureMonths;
        this.maxTenureMonths = maxTenureMonths;
        this.annualInterestRatePercent = annualInterestRatePercent;
        this.baseRiskWeight = baseRiskWeight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Integer getMinTenureMonths() {
        return minTenureMonths;
    }

    public void setMinTenureMonths(Integer minTenureMonths) {
        this.minTenureMonths = minTenureMonths;
    }

    public Integer getMaxTenureMonths() {
        return maxTenureMonths;
    }

    public void setMaxTenureMonths(Integer maxTenureMonths) {
        this.maxTenureMonths = maxTenureMonths;
    }

    public Double getAnnualInterestRatePercent() {
        return annualInterestRatePercent;
    }

    public void setAnnualInterestRatePercent(Double annualInterestRatePercent) {
        this.annualInterestRatePercent = annualInterestRatePercent;
    }

    public Integer getBaseRiskWeight() {
        return baseRiskWeight;
    }

    public void setBaseRiskWeight(Integer baseRiskWeight) {
        this.baseRiskWeight = baseRiskWeight;
    }

    


    
}
