package com.example.compte_api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class PersonneDTO {

    private Long id;
    private String name;
    private String lastName;
}
