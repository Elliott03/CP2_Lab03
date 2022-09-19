import java.awt.*;
import java.util.ArrayList;

public class CollectClass {
    public static void collectAllRect(ArrayList<Rectangle> fullArray) {
        for (Rectangle rec : fullArray) {
            System.out.println(rec.toString() + "\t" + (rec.height * 2 + rec.width * 2));
        }

    }
    public static void collectAllWord(ArrayList<String> fullArray) {
        for (String s : fullArray) {
            System.out.println(s);
        }
    }
}

