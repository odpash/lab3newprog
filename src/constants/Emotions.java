package constants;


public enum Emotions {
    CALM("спокоен"),
    INTRIGUED("заинтригован");

    private final String emotion;

    Emotions(String emotion) {
        this.emotion = emotion;
    }

    public String emotionText() {
        return emotion;
    }

}
