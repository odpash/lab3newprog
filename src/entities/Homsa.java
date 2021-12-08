package entities;

import constants.Clothes;
import constants.Emotions;
import misc.Hole;
import places.Hall;

public class Homsa extends Human {
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

    public boolean searchTerritory() {
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

        public boolean searchHall() {
            Hall hall = new Hall();
            System.out.println(getName() + " приступил к осмотру " + hall.getName());

        }


    public void searchItemCarefully() {

    }
}
