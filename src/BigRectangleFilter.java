import java.awt.*;
import java.util.ArrayList;

public class BigRectangleFilter implements Filter {
    ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();
    public boolean accept(Object x) {

        if (x instanceof Rectangle) {
            if (((Rectangle) x).getHeight() * 2 + ((Rectangle) x).getWidth() * 2 > 10) {
                return true;
            }
        }

        return false;
    }



}
