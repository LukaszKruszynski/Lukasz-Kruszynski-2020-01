package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
}