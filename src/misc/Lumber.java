package misc;

import interfaces.Misc;

public class Lumber implements Misc {
    public String getName() {
        return "люк";
    }

    public String placedAt() {
        return "под ковром";
    }

    public Boolean isEmply() {
        return false;
    }

    public Coda getObject() {
        return new Coda();
    }
    @Override
    public String toString() {
        return getName();
    }

}
