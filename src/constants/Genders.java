package constants;


public enum Genders {
    MALE("мужской"),
    FEMALE("женский");

    private final String gender;

    Genders(String gender) {
        this.gender = gender;
    }

    public String genderText() {
        return gender;
    }

}
