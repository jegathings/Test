package payroll.employee;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

/**
 * This simple interface has one method: toModel(). It is based on converting a non-model object (Employee) into a
 * model-based object (EntityModel<Employee>).
 *
 * This resource assembler always includes the self link to the single-item resource as well as a link back
 * to the aggregate root.
 */
@Component
class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {

        return EntityModel.of(employee, //
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
}