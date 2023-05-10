package test.aj.restcrudjpa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.aj.restcrudjpa.dao.EmployeeDAO;
import test.aj.restcrudjpa.entity.Employee;
import test.aj.restcrudjpa.service.EmpServ;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmpServ empServ;

    @Autowired
    public EmployeeRestController(EmpServ empServ) {
        this.empServ = empServ;
    }

    @GetMapping("/employees")
    public List<Employee> listAllEmployees() {
        return empServ.listAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById (@PathVariable int employeeId) {
        return empServ.getEmployeeById(employeeId);
    }
}
