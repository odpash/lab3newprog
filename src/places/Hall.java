package places;

import misc.Lumber;

public class Hall extends Place{
    Lumber lumber = new Lumber();
    public String getName() {
        return "зал";
    }
    public Boolean isEmply() {return false;}
    public Lumber getObject() {return lumber;}
}
