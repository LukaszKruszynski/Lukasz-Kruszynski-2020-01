package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.exception.FounderException;
import com.kodilla.hibernate.manytomany.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {
    @Autowired
    private EmployeeService employeeService;
    private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeFacade.class);

    public List<Employee> findByPartOfLastName(String lastName) throws FounderException {
        LOGGER.info("Start found employee by part of name...");
        if (lastName.length() < 1) {
            LOGGER.error(FounderException.ERR_VALUE_MUST_CONTAIN_AT_LEAST_ONE_CHARACTER);
            throw new FounderException(FounderException.ERR_VALUE_MUST_CONTAIN_AT_LEAST_ONE_CHARACTER);
        }
        LOGGER.info("Operation completed.");
        return employeeService.findByPartOfLastName(lastName);
    }
}
