package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.isAnAdult;
import static combinatorpattern.CustomerRegistrationValidator.isEmailValid;
import static combinatorpattern.CustomerRegistrationValidator.isPhoneNumberValid;
import static combinatorpattern.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice", "alice@gmail.com", "+0998877665543",
                LocalDate.of(2020, 1, 1));

        //System.out.println(new CustomerValidatorService().isValidCustomer(alice));


        ValidationResult result = isEmailValid().and(isPhoneNumberValid()).and(isAnAdult()).apply(alice);
        System.out.println(result);

        if(result != SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }


}
