package entities;

import constants.Clothes;
import constants.Emotions;
import constants.Genders;
import interfaces.gender;
import misc.Coda;
import misc.Hole;
import misc.Lumber;
import places.Hall;

import java.util.Objects;

public class Homsa extends Human implements gender {
    private Clothes clothes = Clothes.DEFAULT;
    private Emotions emotion = Emotions.CALM;
    private static final String eyeColor = "зеленый";
    private static final Integer personHeight = 187;
    private static final String personName = "Хомса";
    private static final Genders personGender = Genders.MALE;
    private boolean hasHeight;
    public Homsa() {
        Homsa.personHeightTranscription heightTranscription = new Homsa.personHeightTranscription(Homsa.getEditionalHomsaInfo.getPersonHeight());

        System.out.println("У персонажа " + getName() + " был " + Homsa.getEditionalHomsaInfo.getEyeColor() +
                " цвет глаз, он" + getGender("lastone") + " был" + getGender("lastone") + " " + heightTranscription + getGender("lasttwo") + " ростом.");
    }

    public static class getEditionalHomsaInfo {
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
    }



    public void setEmotion(Emotions emotion) {
        if (emotion == null) {
            throw new NullPointerException("emotion can't be null");
        }
        this.emotion = emotion;
        System.out.println(getName() + " " + getEmotion().emotionText());
    }

    public Emotions getEmotion() {
        return this.emotion;
    }



    public void think() {
        System.out.println(getName() + " попытался представить несчастье.");
    }

    public boolean searchHole() {
        Hole hole = new Hole();
        System.out.println(getName() + " осмотрел " + hole.getName() + " на " + hole.placedAt());
        if (hole.isEmply()) {
            System.out.println(getName() + " ничего не нашел.");
            return false;
        } else {
            System.out.println(getName() + " что-то нашел!");
            return true;
        }
        }

        public boolean searchHall(Hall hall) {
            if (hall == null) {
                throw new NullPointerException("hall can't be null");
            }
            System.out.println(getName() + " приступил к осмотру " + hall.getName());
            if (hall.isEmply()) {
                System.out.println(getName() + " ничего не нашел.");
                return false;
            }
            else {
                System.out.println(getName() + " что-то нашел!");
                Lumber lumber = hall.getObject();
                System.out.println("Это " + lumber.getName() + " находящийся " + lumber.placedAt());
                return true;
            }
        }

        public boolean searchLumber(Lumber lumber) {
            if (lumber == null) {
                throw new NullPointerException("lumber can't be null");
            }
            if (lumber.isEmply()){
                System.out.println(getName() + " ничего не нашел.");
                return false;
            }
            else {
                Coda coda = new Coda();
                System.out.println(getName() + " нашел " + coda.getColor() + " " + coda.getSound() + " " + coda.getName() + "!");
                return true;
            }
        }

    @Override
    public String toString() {
        return getName();
    }


    @Override
    public int hashCode() {
        return Objects.hash(clothes, emotion);
    }


}
