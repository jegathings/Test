package payroll.employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * When an EmployeeNotFoundException is thrown, this extra tidbit of Spring MVC configuration
 * is used to render an HTTP 404
 */

/**
 * A controller advice allows you to use exactly the same exception handling techniques but
 * apply them across the whole application, not just to an individual controller. You can
 * think of them as an annotation driven interceptor.
 *
 * Any class annotated with @ControllerAdvice becomes a controller-advice and three types of
 * method are supported:
 *
 * Exception handling methods annotated with @ExceptionHandler.
 * Model enhancement methods (for adding additional data to the model) annotated with
 * @ModelAttribute. Note that these attributes are not available to the exception handling
 * views.
 * Binder initialization methods (used for configuring form-handling) annotated with
 * @InitBinder.
 */
@ControllerAdvice
class EmployeeNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}