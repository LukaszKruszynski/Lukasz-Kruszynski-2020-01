package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    ArrayList<Employee> findByLastName(@Param("LASTNAME") String lastName);

    @Query(nativeQuery = true)
    ArrayList<Employee> findByPartOfLastName(@Param("LASTNAME") String lastName);
}
