package misc;

import interfaces.Misc;

public class Hole implements Misc {
    public String getName() {
        return "дыра";
    }

    public String placedAt() {
        return "крыша чулана";
    }

    public Boolean isEmply() {
        return true;
    }

    @Override
    public String toString() {
        return getName();
    }
}