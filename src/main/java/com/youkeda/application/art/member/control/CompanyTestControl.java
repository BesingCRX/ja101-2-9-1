package com.youkeda.application.art.member.control;

import com.youkeda.application.art.member.param.CompanyQueryParam;
import com.youkeda.application.art.member.service.CompanyService;
import com.youkeda.model.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test/Company")
public class CompanyTestControl {

    private static final Logger LOG = LoggerFactory.getLogger(CompanyTestControl.class);

    @Autowired
    private CompanyService companyService;

    @GetMapping(path = "/save")
    public Company testAddCompany() {
        Company company = new Company();
        company.setId("0");
        company.setGmtModified(LocalDateTime.now());
        company.setGmtCreated(LocalDateTime.now());
        company.setName("测试公司");
        company.setCode("Q200312138");
        company.setDomain("127.0.0.1");

        Company addedCompany = companyService.save(company);

        return addedCompany;
    }

    @GetMapping(path = "/find")
    public Company testModifyCompany() {
        CompanyQueryParam companyQueryParam = new CompanyQueryParam();
        companyQueryParam.setCode("Q200312138");
        companyQueryParam.setDomain("127.0.0.1");
        return companyService.find(companyQueryParam);
    }

    @GetMapping(path = "/delete")
    public boolean testDelCompany() {
        return companyService.delete("0");
    }
}
