package enums;

public class AllAboutEnums {

    public static void main(String[] args) {
        //Gender maleGender = Gender.valueOf("Male".toUpperCase());

        //System.out.println(maleGender instanceof Gender);

        //UseGender useGender = new UseGender(maleGender);

        System.out.println(Gender.valueOf("Male".toUpperCase()).equals(Gender.MALE));

    }


}
