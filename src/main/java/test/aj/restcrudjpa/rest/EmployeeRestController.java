package test.aj.restcrudjpa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee e) {
        e.setId(0);
        Employee ne = empServ.save(e);
        return ne;
    }

    @DeleteMapping("/employees/{employeeId}")
    public void delEmpById (@PathVariable int id) {
        empServ.delEmpById(id);
    }
}
