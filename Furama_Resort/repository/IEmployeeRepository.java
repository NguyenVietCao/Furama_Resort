package repository;

import models.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayEmployee();
    void addEmployee(Employee employee);
    void editEmployeeRepository(List<Employee>employees);
}

