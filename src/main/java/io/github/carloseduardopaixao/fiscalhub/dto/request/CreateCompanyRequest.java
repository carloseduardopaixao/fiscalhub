package io.github.carloseduardopaixao.fiscalhub.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateCompanyRequest {

    @NotBlank
    @Size(max = 255)
    private String corporateName;

    @Size(max = 255)
    private String tradeName;

    @NotBlank
    @Size(max = 14)
    private String document;

    @Size(max = 30)
    private String stateRegistration;

    @Size(max = 30)
    private String municipalRegistration;

    @Email
    @Size(max = 255)
    private String email;

    @Size(max = 20)
    private String phone;

    @Size(max = 1)
    private String active;
}