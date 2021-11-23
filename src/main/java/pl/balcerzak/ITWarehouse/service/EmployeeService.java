package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee getEmployeeById(long id);

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployeesByCompanyName(String companyName);

}
