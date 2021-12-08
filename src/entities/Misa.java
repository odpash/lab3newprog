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
    public Genders getGender() {
        return Genders.FEMALE;
    }

    public Boolean getIsCry() {
        return this.cryActionInfo;
    }

    public void setIsCry(Boolean isCry) {
        this.cryActionInfo = isCry;
        System.out.println(getName() + " плачет.");
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return ((Misa) o).getGender().genderText().equals(Genders.FEMALE.genderText());
    }


    public void sitAndCry() {
        Corner corner = new Corner();
        Genders g = getGender();
            if (equals(g)) {System.out.println("Она уселась в " + corner.getName() + "");}
            else {System.out.println("Он сел в " + corner.getName() + ""); }
        if (!getIsCry()) {
            setIsCry(true);
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
