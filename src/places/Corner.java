package places;

import java.util.Objects;

public class Corner extends Place{
    public String getName() {
        return "угол";
    }
    @Override
    public String toString() {
        return getName();
    }

}
