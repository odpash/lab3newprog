package entities;

import constants.Clothes;
import constants.Emotions;
import constants.Genders;
import interfaces.gender;
import misc.Coda;
import misc.Hole;
import misc.Lumber;
import places.Hall;

public class Homsa extends Human implements gender {
    private Clothes clothes = Clothes.DEFAULT;
    private Emotions emotion = Emotions.CALM;

    @Override
    public String getName() {
        return "Хомса";
    }

    @Override
    public Clothes getClothes() {
        return clothes;
    }

    public void setEmotion(Emotions emotion) {
        this.emotion = emotion;
        System.out.println(getName() + " " + getEmotion().emotionText());
    }

    public Emotions getEmotion() {
        return this.emotion;
    }

    @Override
    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
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
    public String getGender() {
        return Genders.MALE.genderText();
    }
}
