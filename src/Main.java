import constants.Clothes;
import constants.Emotions;
import entities.Homsa;
import entities.Misa;
import misc.Hole;

public class Main {

    public static void main(String[] args) {
	runIncredibleStory();
    }
    private static void runIncredibleStory() {
        Misa misa = new Misa();
        misa.setClothes(Clothes.MOURNING);
        misa.sitAndCry();

        Homsa homsa = new Homsa();
        if (misa.getIsCry()) {
            homsa.think();
        }
        else {
            System.out.println(homsa.getName() + " не думает ни о чем.");
        }

        if (homsa.searchTerritory()) {
            homsa.setEmotion(Emotions.INTRIGUED);
        }
        else {
            homsa.setEmotion(Emotions.CALM);
        }

        homsa.searchItemCarefully();
    }
}
