package com.felipemelozx.loans.controller;

import com.felipemelozx.loans.dto.RequestDto;
import com.felipemelozx.loans.dto.ResponseDto;
import com.felipemelozx.loans.service.LoanService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class LoansController {

  private final LoanService loanService;

  public LoansController(LoanService loanService) {
    this.loanService = loanService;
  }

  @PostMapping
  public ResponseDto getLoans(@RequestBody RequestDto requestDto){
    return loanService.getLoan(requestDto);
  }
}
