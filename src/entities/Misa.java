package entities;

import constants.Clothes;
import constants.Genders;
import interfaces.gender;
import places.Corner;

import java.util.Objects;

public class Misa extends Human implements gender {
    private Clothes clothes = Clothes.DEFAULT;
    private Boolean cryActionInfo = false;
    @Override
    public String getName() {
        return "Миса";
    }

    @Override
    public Clothes getClothes() {
        return clothes;
    }

    @Override
    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
        System.out.println(getName() + " одевается " + getClothes().getTitle());
    }

    @Override
    public String getGender() {
        return Genders.FEMALE.genderText();
    }

    public Boolean getIsCry() {
        return this.cryActionInfo;
    }

    public void setIsCry(Boolean isCry) {
        this.cryActionInfo = isCry;
        System.out.println(getName() + " плачет.");
        }

        public void sitAndCry() {
        Corner corner = new Corner();
            if (Objects.equals(getGender(), Genders.FEMALE.genderText())) System.out.println("Она уселась в " + corner.getName() + "");
            if (Objects.equals(getGender(), Genders.MALE.genderText())) System.out.println("Он сел в " + corner.getName() + "");
        if (!getIsCry()) {
            setIsCry(true);
        }
        }


}
