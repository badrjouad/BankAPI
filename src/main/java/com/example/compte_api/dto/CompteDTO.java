package com.example.compte_api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CompteDTO {
    private Long id;
    private long number;
    private String object;
    private LocalDate createdAt;
    PersonneDTO personne;


}
