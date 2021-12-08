package misc;

import interfaces.Misc;

public class Coda implements Misc {
    public String getName() {
        return "кода";
    }

    public String placedAt() {
        return "под домом";
    }

    @Override
    public Boolean isEmply() {
        return true;
    }

    public String getColor() {
        return "черный";
    }

    public String getSound() {
        return "клокочущую";
    }

    @Override
    public String toString() {
        return getName();
    }
}
