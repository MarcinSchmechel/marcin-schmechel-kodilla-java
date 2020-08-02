package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Company> findCompanyContainsLetters(String lettersInCompanyName){
        return companyDao.retrieveCompaniesContainsLetters(lettersInCompanyName);
    }

    public List<Employee> findEmployeeContainsLetters(String lettersInEmployeeLastname){
        return employeeDao.retrieveEmployeeContainsLetters(lettersInEmployeeLastname);
    }

    public void saveCompany(Company company){
        companyDao.save(company);
    }

    public void saveEmployee(Employee employee){
        employeeDao.save(employee);
    }

    public void addEmployeeToCompany(Employee employee, Company company){
        company.getEmployees().add(employee);
        employee.getCompanies().add(company);
    }

    public void deleteCompanyById(int companyId){
        companyDao.deleteById(companyId);
    }

    public void deleteEmployeeById(int employeeId){
        employeeDao.deleteById(employeeId);
    }

}
