package com.felipemelozx.loans.service;

import com.felipemelozx.loans.dto.LoanDto;
import com.felipemelozx.loans.dto.RequestDto;
import com.felipemelozx.loans.dto.ResponseDto;
import com.felipemelozx.loans.enums.Loan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

  public ResponseDto getLoan(RequestDto requestDto) {
    List<LoanDto> availableLoans = new ArrayList<>();

    if(isEligibleForPersonalLoan(requestDto)){
      availableLoans.add(new LoanDto(Loan.PERSONAL, Loan.PERSONAL.getInterestRate()));
    }

    if(isEligibleForConsignmentLoan(requestDto)){
      availableLoans.add(new LoanDto(Loan.CONSIGNMENT, Loan.CONSIGNMENT.getInterestRate()));
    }

    if(isEligibleForGuaranteedLoan(requestDto)){
      availableLoans.add(new LoanDto(Loan.GUARANTEED, Loan.GUARANTEED.getInterestRate()));
    }

    return new ResponseDto(requestDto.name(), availableLoans);
  }




  private boolean isEligibleForPersonalLoan(RequestDto requestDto) {
    return requestDto.income() <= 3000 || requestDto.income() <= 5000
        && requestDto.age() < 30 && "SP".equalsIgnoreCase(requestDto.location());
  }

  private boolean isEligibleForConsignmentLoan(RequestDto requestDto) {
    return requestDto.income() >= 5000;
  }

  private boolean isEligibleForGuaranteedLoan(RequestDto requestDto) {
    return requestDto.income() <= 3000 || requestDto.income() <= 5000
        && requestDto.age() < 30 && "SP".equalsIgnoreCase(requestDto.location());
  }
}
