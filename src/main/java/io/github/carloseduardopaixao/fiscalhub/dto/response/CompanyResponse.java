package io.github.carloseduardopaixao.fiscalhub.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CompanyResponse {

    private Long id;

    private String corporateName;

    private String tradeName;

    private String document;

    private String stateRegistration;

    private String municipalRegistration;

    private String email;

    private String phone;

    private String active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}