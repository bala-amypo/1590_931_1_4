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

    
    
    
    
}
