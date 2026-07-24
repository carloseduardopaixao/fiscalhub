package io.github.carloseduardopaixao.fiscalhub.service;

import io.github.carloseduardopaixao.fiscalhub.dto.request.CreateCompanyRequest;
import io.github.carloseduardopaixao.fiscalhub.dto.response.CompanyResponse;
import io.github.carloseduardopaixao.fiscalhub.entity.Company;
import io.github.carloseduardopaixao.fiscalhub.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyResponse create(CreateCompanyRequest request) {

        if (companyRepository.existsByDocument(request.getDocument())) {
            throw new IllegalArgumentException("Já existe uma empresa cadastrada com este documento.");
        }

        Company company = Company.builder()
                .corporateName(request.getCorporateName())
                .tradeName(request.getTradeName())
                .document(request.getDocument())
                .stateRegistration(request.getStateRegistration())
                .municipalRegistration(request.getMunicipalRegistration())
                .email(request.getEmail())
                .phone(request.getPhone())
                .build();

        company = companyRepository.save(company);

        return CompanyResponse.builder()
                .id(company.getId())
                .corporateName(company.getCorporateName())
                .tradeName(company.getTradeName())
                .document(company.getDocument())
                .stateRegistration(company.getStateRegistration())
                .municipalRegistration(company.getMunicipalRegistration())
                .email(company.getEmail())
                .phone(company.getPhone())
                .active(company.getActive())
                .createdAt(company.getCreatedAt())
                .updatedAt(company.getUpdatedAt())
                .build();
    }
}