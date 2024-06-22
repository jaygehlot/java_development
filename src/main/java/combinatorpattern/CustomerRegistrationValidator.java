package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.ValidationResult.EMAIL_NOT_VALID;
import static combinatorpattern.ValidationResult.IS_NOT_AN_ADULT;
import static combinatorpattern.ValidationResult.PHONE_NUMBER_NOT_VALID;
import static combinatorpattern.ValidationResult.SUCCESS;

public interface CustomerRegistrationValidator extends
        Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("+0") ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAnAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() >= 18 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator validatorChecks) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? validatorChecks.apply(customer) : result;
        };
    }

}
