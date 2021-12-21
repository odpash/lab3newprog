package entities;

import constants.Clothes;
import constants.Genders;
import exceptions.notReadyToCry;
import interfaces.gender;
import places.Corner;

import java.util.Objects;

public class Misa extends Human implements gender {
    private Clothes clothes = Clothes.DEFAULT;
    private Boolean cryActionInfo = false;
    private static final String eyeColor = "синий";
    private static final Integer personHeight = 160;
    private static final String personName = "Миса";
    private static final Genders personGender = Genders.FEMALE;
    private boolean hasHeight;
    public Misa() {
        personHeightTranscription heightTranscription = new personHeightTranscription(getEditionalMisaInfo.getPersonHeight());

        System.out.println("У персонажа " + getName() + " был " + getEditionalMisaInfo.getEyeColor() +
                " цвет глаз, он" + getGender("lastone") + " был" + getGender("lastone") + " " + heightTranscription + getGender("lasttwo") + " ростом.");
    }

    public static class getEditionalMisaInfo {
        public static String getEyeColor() {
            return eyeColor;
        }
        public static Integer getPersonHeight() {
            return personHeight;
        }
    }
    @Override
    public String getName() {
        return personName;
    }

    @Override
    public Clothes getClothes() {
        return clothes;
    }

    @Override
    public void setClothes(Clothes clothes) {
        if (clothes == null) {
            throw new NullPointerException("clothes can't be null");
        }
        this.clothes = clothes;
        System.out.println(getName() + " одевается " + getClothes().getTitle());
    }


    public class personHeightTranscription {
        Integer height;
        public personHeightTranscription(Integer currentHeight) {
            if (currentHeight == null) {
                throw new NullPointerException("currentHeight can't be null");
            }
            height = currentHeight;
            hasHeight = true;
        }
        @Override
        public String toString() {
            return (height > 160 ? "высок": "низк");
        }
    }

    public String getGender(String mode) {
        if (mode == null) {
            throw new NullPointerException("mode can't be null");
        }
        if (mode.equals("standart")) {
            return personGender.genderText();
        } else {
            class additionalGenderInfo {
                private String currentLastOneLetter() {
                    return (personGender.genderText().equals("женский") ? "а" : "");
                }

                private String currentLastTwoLetters() {
                    return (personGender.genderText().equals("женский") ? "ая" : "ий");
                }
            }
            final additionalGenderInfo additionInfoAboutGender = new additionalGenderInfo();
            if (mode.equals("lastone")) { return additionInfoAboutGender.currentLastOneLetter(); }
            else if (mode.equals("lasttwo")) { return additionInfoAboutGender.currentLastTwoLetters(); }
        }
        return mode;
    }
    public Boolean getIsCry() {
        return this.cryActionInfo;
    }

    public void setIsCry(Boolean isCry) {
        if (isCry == null) {
            throw new NullPointerException("isCry can't be null");
        }
        this.cryActionInfo = isCry;
        System.out.println(getName() + " плачет.");
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ((Misa) o).getGender("standart");
        return false;
    }


    public void sitAndCry() throws notReadyToCry {
        Corner corner = new Corner();
        System.out.println("Он" + getGender("lastone") + " уселась в " + corner.getName() + "...");
        if (!getIsCry()) {
            setIsCry(true);
        } else {
            throw new notReadyToCry (getName() + " уже плачет!");
        }

        }
    @Override
    public String toString() {
        return getName();
    }


    @Override
    public int hashCode() {
        return Objects.hash(clothes, cryActionInfo);
    }


}
