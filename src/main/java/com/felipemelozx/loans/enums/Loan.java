package com.felipemelozx.loans.enums;

public enum Loan {
    PERSONAL(4),
    GUARANTEED(3),
    CONSIGNMENT(2);

    private final int interestRate;

    Loan(int interestRate) {
      this.interestRate = interestRate;
    }

    public int getInterestRate() {
      return interestRate;
    }
  }