package CollectionsTests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTest {

    @Test
    public void xyz() {
        Assert.assertThat(true, is(true));
    }

    @Test
    public void equalsTest() {
        Student student1 = new Student("H1234");
        Student student2 = new Student("H1234");

        assertTrue(student1.equals(student2)); //fails because equals from Object is being used
                                                //overriding equals on Student will fix this
    }

    @Test
    public void hashCodeTest() {
        Map<Integer, Student> studentMap = new HashMap<>();

    }



    static class Student {
        private String registrationNumber;

        Student(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        @Override
        public int hashCode() {
            return Objects.hash(registrationNumber);
        }
    }
}
