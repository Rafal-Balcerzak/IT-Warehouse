package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Employee;
import pl.balcerzak.ITWarehouse.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin("*")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @GetMapping("/{id}")
    ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PostMapping
    ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }

    @GetMapping("/company/{companyName}")
    ResponseEntity<List<Employee>> getAllEmployeesByCompanyName(@PathVariable String companyName) {
        return ResponseEntity.ok(employeeService.getAllEmployeesByCompanyName(companyName));
    }

    @DeleteMapping("{id}")
    void deleteEmployeeById(@PathVariable long id) {
        employeeService.deleteEmployeeById(id);
    }

    @PatchMapping
    ResponseEntity<Employee> editEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.editEmployee(employee));
    }
}
