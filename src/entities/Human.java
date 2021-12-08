package entities;

import constants.Clothes;

public abstract class Human {

    public abstract String getName();

    public abstract Clothes getClothes();

    public abstract void setClothes(Clothes clothes);

}