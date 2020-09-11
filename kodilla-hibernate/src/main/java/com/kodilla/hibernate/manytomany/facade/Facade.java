package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.service.CompanyService;
import com.kodilla.hibernate.manytomany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private EmployeeService employeeService;

    public List<Company> getCompaniesByPartialName(String name) {
        return companyService.findByPartialName(name);
    }
    public List<Employee> getEmployeesByPartialFirstNameAndLastName(String lastName,String firstname) {
        return employeeService.findByPartial(lastName, firstname);
    }
}
