package equals;

class Person{
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (!name.equals(person.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    public Person(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}


public class EqualsMethod {
    public static void main(String[] args) {

        System.out.println(new Object());

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");
        Person person3 = new Person(6, "Jay");

        //makes object reference person1, point to person2 object
        //person1 = person2;

        //== checks for if the references are pointing to the same objects, for non-primitive objects
        System.out.println("Are references pointing to same object?===============");
        System.out.println(person1 == person2);

        //until the equals method has been implemented for the Person class, this will still be false
        // because its taking equals from the Object class where == is still being used, once equals has been
        //implemented in Person, this will then be True
        System.out.println("================================EQUALS");
        System.out.println(person1.equals(person2));
        System.out.println("===============================HASHCODE");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println("\n");

        System.out.println("Person 2 and Person 3 Equals:" + person2.equals(person3));
        System.out.println("Person2 hashcode:" + person2.hashCode());
        System.out.println("Person3 hashcode:" + person3.hashCode());
        System.out.println("\n");

        Double double2 = 72.2;
        Double double3 = 72.2;
        // with Double objects, if two objects have the value, Java just creates TWO objects
        //and the two references point to different objects
        System.out.println("Double ==");
        System.out.println(double2 == double3);
        System.out.println("Double .equals");
        System.out.println(double2.equals(double3));

        Integer integer1 = 5;
        Integer integer2 = 5;

        // with Integer objects, if two objects have the value, Java just creates one object
        //and the two references point to the same object
        System.out.println("Integer");
        System.out.println(integer1 == integer2);

        //dont compare non-primitive objects with == , only use == to check if two references point to the same
        //object, always use .equals with non primitives


        String text1 = "Hello";
        String text2 = "Hello";
        //This evaluates to true, because Java is optimising things here and creating only one
        //object rather than two, but still always better to use .equals() rather than == for non-primitive types
        System.out.println("String using ==");
        System.out.println(text1 == text2.intern());

        String text3 = "Hello";
        String text4 = "Hello1234".substring(0, 5);
        System.out.println(text4);
        //this will now print out false, because we have two different objects, == checks if objects are referring to
        //the same thing

        System.out.println(text3==text4); //will be false since text4 created a new object (substring returns a new String object)

        //this will print out true, because the object that text3 is pointing to, contains the same value, as what text4 is pointing to
        System.out.println(text3.equals(text4));


    }



}
