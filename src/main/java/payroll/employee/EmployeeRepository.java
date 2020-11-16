package payroll.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.employee.Employee;

/*
In a typical Java application, you might expect to write a class that implements
CustomerRepository. However, that is what makes Spring Data JPA so powerful: You
need not write an implementation of the repository interface. Spring Data JPA
creates an implementation when you run the application.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}