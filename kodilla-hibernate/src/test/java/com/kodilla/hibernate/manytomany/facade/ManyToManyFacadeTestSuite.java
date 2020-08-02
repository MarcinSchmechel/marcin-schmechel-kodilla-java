package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTestSuite {

    @Autowired
    private ManyToManyFacade manyToManyFacade;

    @Test
    public void testFindCompanyContainsLetters(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        manyToManyFacade.addEmployeeToCompany(johnSmith, softwareMachine);
        manyToManyFacade.addEmployeeToCompany(stephanieClarckson, dataMaesters);
        manyToManyFacade.addEmployeeToCompany(lindaKovalsky, dataMaesters);
        manyToManyFacade.addEmployeeToCompany(johnSmith, greyMatter);
        manyToManyFacade.addEmployeeToCompany(lindaKovalsky, greyMatter);

        manyToManyFacade.saveCompany(softwareMachine);
        manyToManyFacade.saveCompany(dataMaesters);
        manyToManyFacade.saveCompany(greyMatter);

        manyToManyFacade.saveEmployee(johnSmith);
        manyToManyFacade.saveEmployee(stephanieClarckson);
        manyToManyFacade.saveEmployee(lindaKovalsky);

        int softwareMachineId = softwareMachine.getId();
        int dataMaestersId = dataMaesters.getId();
        int greyMatterId = greyMatter.getId();

        int johnSmithId = johnSmith.getId();
        int stephanieClarcksonId = stephanieClarckson.getId();
        int lindaKovalskyId = lindaKovalsky.getId();

        //When
        List<Company> companiesList = manyToManyFacade.findCompanyContainsLetters("oft");
        List<Employee> employeeList = manyToManyFacade.findEmployeeContainsLetters("larc");

        //Then
        Assert.assertEquals(1,companiesList.size());
        Assert.assertEquals(1,employeeList.size());

        //CleanUp
        try {
            manyToManyFacade.deleteCompanyById(softwareMachineId);
            manyToManyFacade.deleteCompanyById(dataMaestersId);
            manyToManyFacade.deleteCompanyById(greyMatterId);
            manyToManyFacade.deleteEmployeeById(johnSmithId);
            manyToManyFacade.deleteEmployeeById(stephanieClarcksonId);
            manyToManyFacade.deleteEmployeeById(lindaKovalskyId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
