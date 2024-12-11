package com.felipemelozx.loans.service;

import com.felipemelozx.loans.dto.LoanDto;
import com.felipemelozx.loans.dto.RequestDto;
import com.felipemelozx.loans.dto.ResponseDto;
import com.felipemelozx.loans.enums.Loan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LoanServiceTest {
  private LoanService loanService;

  @BeforeEach
  void setUp() {
    loanService = new LoanService();
  }

  @Test
  void getLoansCase1(){
    RequestDto request = new RequestDto(25, "123.456.789-00","John Doe", 4000.00, "SP");

    ResponseDto response = loanService.getLoan(request);

    assertThat(response.customer()).isEqualTo("John Doe");
    assertThat(response.loans())
             .hasSize(2)
             .extracting(LoanDto::type)
             .containsExactlyInAnyOrder(Loan.PERSONAL, Loan.GUARANTEED);
  }

  @Test
  void getLoansCase2(){
    RequestDto request = new RequestDto(35, "987.654.321-00","Jane Smith", 7000.00, "RJ");

    ResponseDto response = loanService.getLoan(request);

    assertThat(response.customer()).isEqualTo("Jane Smith");
    assertThat(response.loans())
        .hasSize(1)
        .extracting(LoanDto::type)
        .containsExactlyInAnyOrder(Loan.CONSIGNMENT);
  }
}