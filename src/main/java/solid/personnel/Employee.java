package solid.personnel;

public abstract class Employee {

  private String firstName;
  private String lastName;
  private int monthlyIncome;
  private int nbHoursPerWeek;

  public Employee(String fullName, int monthlyIncome) {
    setMonthlyIncome(monthlyIncome);

    String[] names = fullName.split(" ");
    this.firstName = names[0];
    this.lastName = names[1];
  }

  private void setMonthlyIncome(int monthlyIncome) {
    this.monthlyIncome = monthlyIncome;
  }

  public String getFullName() {
    return this.firstName + this.lastName;
  }

  public String getEmail() {
    return null;
  }

  public int getMonthlyIncome() {
    return monthlyIncome;
  }

  public int getNbHoursPerWeek() {
    return nbHoursPerWeek;
  }

  void setNbHoursPerWeek(int nbHoursPerWeek) {
    this.nbHoursPerWeek = nbHoursPerWeek;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", monthlyIncome=" + monthlyIncome +
            ", nbHoursPerWeek=" + nbHoursPerWeek +
            '}';
  }
}
