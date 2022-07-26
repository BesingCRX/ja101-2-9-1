package com.youkeda.application.art.member.service.impl;

import com.youkeda.application.art.member.param.CompanyQueryParam;
import com.youkeda.application.art.member.repository.CompanyRepository;
import com.youkeda.application.art.member.service.CompanyService;
import com.youkeda.application.art.model.Company;

import java.util.List;

public class CpmpanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    @Override
    public Company save(Company company) {
        return null;
    }

    @Override
    public Company find(CompanyQueryParam param) {
        return null;
    }

    @Override
    public List<Company> queryByAccountId(String accountId) {
        return null;
    }

    @Override
    public Company getByDomain(String domainUrl) {
        return null;
    }

    @Override
    public void delete(String companyId) {

    }

    @Override
    public Company get(String companyId) {
        return null;
    }
}
