package java8;

public class CommitteeMembers {

    final String firstName;

    final String lastName;

    final Integer age;


    public CommitteeMembers(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CommitteeMembers{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
