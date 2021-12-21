package misc;

import interfaces.Misc;
import interfaces.additionalObjectInfo;

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
    additionalObjectInfo addInfo = new additionalObjectInfo() {
        @Override
        public String Color() {
            return "черный";
        }

        @Override
        public String Sound() {
            return "клокочущую";
        }
    };
    public String getColor() {
        return addInfo.Color();
    }
    public String getSound() {
        return addInfo.Sound();
    }

    @Override
    public String toString() {
        return getName();
    }
}