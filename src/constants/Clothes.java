package constants;

public enum Clothes {
    MOURNING("траурно"),
    BRIGHTLY("ярко"),
    DEFAULT("обычно");


    private final String title;

    Clothes(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
