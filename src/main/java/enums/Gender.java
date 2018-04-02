package enums;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private String genderType;

    Gender(String genderType) {
        this.genderType = genderType;
    }

    public String getGenderType() {
        return genderType;
    }
}
