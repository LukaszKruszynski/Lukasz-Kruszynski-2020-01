package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.exception.FounderException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeFacadeEmployeeAndCompanyTestSuite {
    @Autowired
    private EmployeeFacade employeeFacade;
    @Autowired
    private EmployeeDao employeeRepository;
    @Autowired
    private CompanyFacade companyFacade;
    private Employee andrzejKucharczyk;
    private Employee damianSztacheta;
    private Employee jakubNowy;
    private Company destructingFactory;
    private Company goodWeed;
    private Company programingCompany;

    @Before
    public void initialObjectsToTests() {
        andrzejKucharczyk = new Employee("Andrzej", "Kucharczyk");
        damianSztacheta = new Employee("Damian", "Sztacheta");
        jakubNowy = new Employee("Jakub", "Nowy");

        destructingFactory = new Company("Killers");
        goodWeed = new Company("Happy Stuff");
        programingCompany = new Company("Best Soft Ever");

        destructingFactory.getEmployees().add(andrzejKucharczyk);
        goodWeed.getEmployees().add(damianSztacheta);
        programingCompany.getEmployees().add(jakubNowy);

        andrzejKucharczyk.getCompanies().add(destructingFactory);
        damianSztacheta.getCompanies().add(goodWeed);
        jakubNowy.getCompanies().add(programingCompany);

        employeeRepository.save(andrzejKucharczyk);
        employeeRepository.save(damianSztacheta);
        employeeRepository.save(jakubNowy);
    }

    @After
    public void cleanUp() {
        employeeRepository.deleteAll();
    }

    @Test
    public void getEmployeesByPartialLastName() throws FounderException {
        //Given
        //initialObjectsToTests()
        //When
        //initialObjectsToTests()
        List<Employee> search1 = employeeFacade.findByPartOfLastName("char");
        List<Employee> search2 = employeeFacade.findByPartOfLastName("che");
        List<Employee> search3 = employeeFacade.findByPartOfLastName("No");
        List<Employee> search4 = employeeFacade.findByPartOfLastName("das");
        List<Employee> search5 = employeeFacade.findByPartOfLastName("sad");

        //Then
        assertEquals(search1.get(0).getLastName(),andrzejKucharczyk.getLastName());
        assertEquals(search2.get(0).getLastName(),damianSztacheta.getLastName());
        assertEquals(search3.get(0).getLastName(),jakubNowy.getLastName());
        assertTrue(search4.isEmpty());
        assertTrue(search5.isEmpty());
    }

    @Test
    public void getCompaniesByPartialName() throws FounderException {
        //Given
        //initialObjectsToTests()
        //When
        //initialObjectsToTests()
        List<Company> search1 = companyFacade.findByPartOfName("ll");
        List<Company> search2 = companyFacade.findByPartOfName("ff");
        List<Company> search3 = companyFacade.findByPartOfName("t ");
        List<Company> search4 = companyFacade.findByPartOfName("klamstryyyy");
        List<Company> search5 = companyFacade.findByPartOfName("iTakNieZnajdziesz");

        //Then
        assertEquals(search1.get(0).getName(),destructingFactory.getName());
        assertEquals(search2.get(0).getName(),goodWeed.getName());
        assertEquals(search3.get(0).getName(),programingCompany.getName());
        assertTrue(search4.isEmpty());
        assertTrue(search5.isEmpty());
    }
}
