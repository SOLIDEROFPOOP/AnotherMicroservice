package org.example.eurekaclient.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HumanDto {
    private String name;
    private String surname;
    private Integer age;
}
