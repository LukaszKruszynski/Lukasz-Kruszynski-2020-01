package com.kodilla.hibernate.manytomany.service;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    CompanyDao repository;

    public List<Company> findByPartOfName(String name) {
        return repository.findByPartOfName(name);
    }
}
