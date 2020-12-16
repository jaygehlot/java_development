package solid;

import solid.logging.ConsoleLogger;
import solid.persistence.EmployeeFileSerializer;
import solid.persistence.EmployeeRepository;
import solid.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
  public static void main(String[] args) {
    EmployeeFileSerializer serializer = new EmployeeFileSerializer();
    ConsoleLogger logger = new ConsoleLogger();

    EmployeeRepository repository = new EmployeeRepository(serializer);
    List<Employee> employees = repository.findAll();

    employees.forEach(employee -> {
      try {
        repository.save(employee);
        logger.writeInfo("Saved employee " + employee.toString());
      } catch (IOException e) {
        logger.writeError("Error saving employee", e);
      }
    });
  }
}
