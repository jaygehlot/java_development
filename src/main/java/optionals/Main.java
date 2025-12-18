package optionals;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        optionalOrElseGet();
        optionalIfPresentOrElse();
        optionalOrElseThrow();
    }

    static void optionalOrElseGet() {
        Object defaultValue = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println("1st Value: " + defaultValue);

        Object actualValue = Optional.ofNullable("Hello")
                .orElseGet(() -> "actual value");

        System.out.println("2nd Value: " + actualValue);
    }

    static void optionalIfPresentOrElse() {
        //consumer -> takes in an argument of some type and does something with it
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));
    }

    static void optionalOrElseThrow() {
        Supplier<IllegalStateException> ise = () -> new IllegalStateException("ISE");
        Object exception = Optional.ofNullable(null)
                .orElseThrow(ise);

        System.out.println("Exception: " + exception);
    }
}
