package test.aj.restcrudjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.aj.restcrudjpa.dao.EmployeeDAO;
import test.aj.restcrudjpa.entity.Employee;

import java.util.List;

@Service
public class EmpSerImpl implements EmpServ {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmpSerImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> listAllEmployees() {
        return employeeDAO.listAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeDAO.getEmployeeById(employeeId);
    }
}
