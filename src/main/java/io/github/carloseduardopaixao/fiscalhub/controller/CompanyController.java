package io.github.carloseduardopaixao.fiscalhub.controller;

import io.github.carloseduardopaixao.fiscalhub.dto.request.CreateCompanyRequest;
import io.github.carloseduardopaixao.fiscalhub.dto.response.CompanyResponse;
import io.github.carloseduardopaixao.fiscalhub.service.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyResponse create(@Valid @RequestBody CreateCompanyRequest request) {
        return companyService.create(request);
    }
}