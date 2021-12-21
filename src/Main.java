import constants.Clothes;
import constants.Emotions;
import entities.Homsa;
import entities.Misa;
import exceptions.notReadyToCry;
import misc.Hole;
import misc.Lumber;
import places.Hall;

public class Main {

    public static void main(String[] args) {
	runIncredibleStory();
    }
    private static void runIncredibleStory() {
        Misa misa = new Misa();
        misa.setClothes(Clothes.MOURNING);
        //misa.setIsCry(true);
        try {
            misa.sitAndCry();
        } catch (notReadyToCry notReadyToCry) {
            System.out.println((char) 27 + "[31m[Warning] " + (char)27 + "[0m" + misa.getName() + " не готов" + misa.getGender("lastone") + " плакать!");
        }


        Homsa homsa = new Homsa();
        if (misa.getIsCry()) {
            homsa.think();
        }
        else {
            System.out.println(homsa.getName() + " не думает ни о чем.");
        }

        if (homsa.searchHole()) {
            homsa.setEmotion(Emotions.INTRIGUED);
        }
        else {
            homsa.setEmotion(Emotions.CALM);
            Hall hall = new Hall();
            if (homsa.searchHall(hall)) {
                Lumber lumber = new Lumber();
                homsa.searchLumber(lumber);
                homsa.setEmotion(Emotions.INTRIGUED);
            }
            else {
            homsa.setEmotion(Emotions.CALM);
        }
        }

    }
}
