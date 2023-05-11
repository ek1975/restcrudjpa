package test.aj.restcrudjpa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.aj.restcrudjpa.entity.Employee;
import test.aj.restcrudjpa.service.EmpServ;

import java.util.List;
import java.util.Optional;

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
    public Optional<Employee> getEmployeeById (@PathVariable int employeeId) {
        return empServ.getEmployeeById(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee e) {
        e.setId(0);
        return empServ.save(e);
    }

    @PutMapping("/employees")
    public Employee updEmp(@RequestBody Employee e) {
        return empServ.save(e);
    }

    @DeleteMapping("/employees/{id}")
    public void delEmpById (@PathVariable int id) {
        empServ.delEmpById(id);
    }
}
