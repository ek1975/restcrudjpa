//JPA API is replaced by SDJPA
package test.aj.restcrudjpa.dao;

import test.aj.restcrudjpa.entity.Employee;
import java.util.List;
public interface EmployeeDAO {

    List<Employee> listAllEmployees();

    Employee getEmployeeById(int employeeId);

    Employee save(Employee e);

    void delEmpById(int id);
}
