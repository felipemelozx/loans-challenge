package com.felipemelozx.loans.dto;

public record RequestDto(Byte age,
                         String cpf,
                         String name,
                         Long income,
                         String location) {
}
