package com.felipemelozx.loans.dto;

import java.util.List;

public record ResponseDto(String customer,
                          List<LoanDto> loans) {
}
