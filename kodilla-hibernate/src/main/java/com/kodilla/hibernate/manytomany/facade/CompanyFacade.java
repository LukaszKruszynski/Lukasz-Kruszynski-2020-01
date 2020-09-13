package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.exception.FounderException;
import com.kodilla.hibernate.manytomany.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {
    @Autowired
    private CompanyService companyService;
    private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeFacade.class);

    public List<Company> findByPartOfName(String name) throws FounderException {
        LOGGER.info("Start found company by part of name...");
        if (name.length() < 1) {
            LOGGER.error(FounderException.ERR_VALUE_MUST_CONTAIN_AT_LEAST_ONE_CHARACTER);
            throw new FounderException(FounderException.ERR_VALUE_MUST_CONTAIN_AT_LEAST_ONE_CHARACTER);
        }
        LOGGER.info("Operation completed.");
        return companyService.findByPartOfName(name);
    }
}
