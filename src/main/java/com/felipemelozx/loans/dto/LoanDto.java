package com.felipemelozx.loans.dto;

import com.felipemelozx.loans.enums.Loan;

public record LoanDto(Loan type, Integer interestRate) {
}
