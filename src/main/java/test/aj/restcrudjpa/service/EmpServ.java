package test.aj.restcrudjpa.service;

import test.aj.restcrudjpa.entity.Employee;
import java.util.List;
import java.util.Optional;

public interface EmpServ {
    List<Employee> listAllEmployees();

    Optional<Employee> getEmployeeById(int employeeId);

    Employee save(Employee e); //Create/Update

    void delEmpById(int id);
}
