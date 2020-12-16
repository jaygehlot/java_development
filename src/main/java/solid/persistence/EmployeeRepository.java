package solid.persistence;

import solid.personnel.Employee;
import solid.personnel.FullTimeEmployee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EmployeeRepository {

  private EmployeeFileSerializer serializer;

  public EmployeeRepository(EmployeeFileSerializer serializer) {
    this.serializer = serializer;
  }

  public List<Employee> findAll() {
    return List.of(
        new FullTimeEmployee("Anna Smith", 2000),
        new FullTimeEmployee("Billy Leech", 920),
        new FullTimeEmployee("Steve Jones", 800),
        new FullTimeEmployee("Magda Iovan", 920));
  }

  /**
   * Save method has a Single Repository of saving that Employee to the file system
   *
   * @param employee Employee to save
   * @throws IOException
   */
  public void save(Employee employee) throws IOException {
    String serializedString = this.serializer.serialize(employee);

    Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
    Files.write(path, serializedString.getBytes());
  }
}
