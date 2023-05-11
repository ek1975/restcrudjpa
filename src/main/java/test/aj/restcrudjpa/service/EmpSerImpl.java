package test.aj.restcrudjpa.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.aj.restcrudjpa.dao.EmpJpaRepo;
import test.aj.restcrudjpa.entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmpSerImpl implements EmpServ {

    private EmpJpaRepo eJR;

    public EmpSerImpl(EmpJpaRepo eJR) {
        this.eJR = eJR;
    }

    /*  Being commented because it is being replaced by SDJPA
        private EmployeeDAO employeeDAO;

        @Autowired
        public EmpSerImpl(EmployeeDAO employeeDAO) {
            this.employeeDAO = employeeDAO;
        }
*/
        @Override
        public List<Employee> listAllEmployees() {
            return eJR.findAll();
//            return employeeDAO.listAllEmployees();
        }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return eJR.findById(id);
//        return employeeDAO.getEmployeeById(employeeId);
    }

    @Transactional
    @Override
    public Employee save(Employee e) {
        return eJR.save(e);
    }

    @Transactional
    @Override
    public void delEmpById(int id) {
        eJR.deleteById(id);
    }
}
