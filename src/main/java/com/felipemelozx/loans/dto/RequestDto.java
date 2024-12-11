package com.felipemelozx.loans.dto;

public record RequestDto(Integer age,
                         String cpf,
                         String name,
                         Double income,
                         String location) {
}
