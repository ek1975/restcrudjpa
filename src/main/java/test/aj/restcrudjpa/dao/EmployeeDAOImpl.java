package test.aj.restcrudjpa.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import test.aj.restcrudjpa.entity.Employee;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> listAllEmployees() {
        TypedQuery<Employee> tq1 = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employeeList = tq1.getResultList();
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return entityManager.find(Employee.class, employeeId);
    }
}
