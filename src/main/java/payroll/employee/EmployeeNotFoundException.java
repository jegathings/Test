package payroll.employee;
//@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Order")
class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}