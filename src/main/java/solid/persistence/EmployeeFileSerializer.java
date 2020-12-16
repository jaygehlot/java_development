package solid.persistence;

import solid.personnel.Employee;

public class EmployeeFileSerializer {

    public String serialize(Employee employee) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("### EMPLOYEE RECORD ###");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("NAME: ");
        stringBuilder.append(employee.getFullName());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("POSITION: ");
        stringBuilder.append(employee.getClass().getTypeName());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("EMAIL: ");
        stringBuilder.append(employee.getEmail());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("MONTHLY WAGE: ");
        stringBuilder.append(employee.getMonthlyIncome());
        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
