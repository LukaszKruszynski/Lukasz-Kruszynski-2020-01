package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeEmployeeAndCompanyTestSuite {
    @Autowired
    Facade facade;

    @Autowired
    EmployeeDao repository;

    @Test
    public void getEmployeesByPartialName() {
        //Given
        Employee andrzejKucharczyk = new Employee("Andrzej", "Kucharczyk");
        Employee damianSztacheta = new Employee("Damian", "Sztacheta");
        Employee jakubNowy = new Employee("Jakub", "Nowy");

        Company company1 = new Company("Factory");
        Company company2 = new Company("Shop");
        Company company3 = new Company("Development");

        company1.getEmployees().add(andrzejKucharczyk);
        company2.getEmployees().add(damianSztacheta);
        company3.getEmployees().add(jakubNowy);

        andrzejKucharczyk.getCompanies().add(company1);
        damianSztacheta.getCompanies().add(company2);
        jakubNowy.getCompanies().add(company3);

        //When
        repository.save(andrzejKucharczyk);
        repository.save(damianSztacheta);
        repository.save(jakubNowy);

        List<Employee> search1 = facade.getEmployeesByPartialFirstNameAndLastName("char", "");
        List<Employee> search2 = facade.getEmployeesByPartialFirstNameAndLastName("char", "ndr");
        List<Employee> search3 = facade.getEmployeesByPartialFirstNameAndLastName("klon", "mietek");
        List<Employee> search4 = facade.getEmployeesByPartialFirstNameAndLastName("sss", "ddd");
        List<Employee> search5 = facade.getEmployeesByPartialFirstNameAndLastName("tach", "ia");
        List<Employee> search6 = facade.getEmployeesByPartialFirstNameAndLastName("", "");
        List<Employee> search7 = facade.getEmployeesByPartialFirstNameAndLastName("ow", "ak");
        List<Employee> search8 = facade.getEmployeesByPartialFirstNameAndLastName("sad", "dup");

        //Then
        assertTrue(search1.contains(andrzejKucharczyk));
        assertTrue(search2.contains(andrzejKucharczyk));
        assertTrue(search3.isEmpty());
        assertTrue(search4.isEmpty());
        assertTrue(search5.contains(damianSztacheta));
        assertTrue(search6.isEmpty());
        assertTrue(search7.contains(jakubNowy));
        assertTrue(search8.isEmpty());

        //cleanUp
        repository.deleteAll();
    }

}
