package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ApplicantProfile {

    private long id;
    private User user;
    private String fullName;
    private LocalDate dateOfBirth;
    private String employmentType;
    private BigDecimal montlyIncome;
    private BigDecimal existingEmiObligations;
    private Integer creditScore;
    private Integer internalRiskScore;
    private String country;
    private Boolean active;
    
    public ApplicantProfile(){}


    public ApplicantProfile(User user, String fullName, LocalDate dateOfBirth, String employmentType,
            BigDecimal montlyIncome, BigDecimal existingEmiObligations, Integer creditScore, Integer internalRiskScore,
            String country, Boolean active) {
        this.user = user;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.employmentType = employmentType;
        this.montlyIncome = montlyIncome;
        this.existingEmiObligations = existingEmiObligations;
        this.creditScore = creditScore;
        this.internalRiskScore = internalRiskScore;
        this.country = country;
        this.active = active;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getEmploymentType() {
        return employmentType;
    }


    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }


    public BigDecimal getMontlyIncome() {
        return montlyIncome;
    }


    public void setMontlyIncome(BigDecimal montlyIncome) {
        this.montlyIncome = montlyIncome;
    }


    public BigDecimal getExistingEmiObligations() {
        return existingEmiObligations;
    }


    public void setExistingEmiObligations(BigDecimal existingEmiObligations) {
        this.existingEmiObligations = existingEmiObligations;
    }


    public Integer getCreditScore() {
        return creditScore;
    }


    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }


    public Integer getInternalRiskScore() {
        return internalRiskScore;
    }


    public void setInternalRiskScore(Integer internalRiskScore) {
        this.internalRiskScore = internalRiskScore;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public Boolean getActive() {
        return active;
    }


    public void setActive(Boolean active) {
        this.active = active;
    }

    

    
    
    
    
}
