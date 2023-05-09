package test.aj.restcrudjpa.dao;

import org.springframework.transaction.annotation.Transactional;
import test.aj.restcrudjpa.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> listAllEmployees();

    Employee getEmployeeById(int employeeId);
}
