package test.aj.restcrudjpa.service;

import test.aj.restcrudjpa.entity.Employee;

import java.util.List;

public interface EmpServ {
    List<Employee> listAllEmployees();

    Employee getEmployeeById(int employeeId);
}
