package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09800000030"));
        System.out.println(isPhoneNumberValid("078000000004"));

        System.out.println("\nWith Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09800000300"));

        System.out.println("\nWith chaining predicates");
        System.out.println("Is phone number valid and contains 3 = " + isPhoneNumberValidPredicate.and(contains3).test("09800000300"));
        System.out.println("Is phone number valid and contains 3 = " + isPhoneNumberValidPredicate.and(contains3).test("07800000300"));
        System.out.println("//using OR chaining");
        System.out.println("Is phone number valid and contains 3 = " + isPhoneNumberValidPredicate.or(contains3).test("09800000300"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    private static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    private static Predicate<String> contains3 = phoneNumber ->
            phoneNumber.contains("3");
}
