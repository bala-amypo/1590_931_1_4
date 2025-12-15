package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanApplication {

    private long id;
    private ApplicantProfile applicant;
    private LoanProduct loanProduct;
    private LocalDate applicationDate;
    private BigDecimal requestedAmount;
    private Integer requestedTenureMonths;
    
    
}
