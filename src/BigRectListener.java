import java.awt.*;
import java.util.ArrayList;

public class BigRectListener {
    public static void main(String[] args) {
        Filter brf = new BigRectangleFilter();

        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(2, 2);
        Rectangle r3 = new Rectangle(5, 5);
        Rectangle r4 = new Rectangle(1, 9);
        Rectangle r5 = new Rectangle(2, 1);
        Rectangle r6 = new Rectangle(6, 8);
        Rectangle r7 = new Rectangle(2, 3);
        Rectangle r8 = new Rectangle(5, 2);
        Rectangle r9 = new Rectangle(3, 3);
        Rectangle r10 = new Rectangle(150, 150);


        ArrayList<Rectangle> rectangleList= new ArrayList<Rectangle>();

        rectangleList.add(r1);
        rectangleList.add(r2);
        rectangleList.add(r3);
        rectangleList.add(r4);
        rectangleList.add(r5);
        rectangleList.add(r6);
        rectangleList.add(r7);
        rectangleList.add(r8);
        rectangleList.add(r9);
        rectangleList.add(r10);

        ArrayList<Rectangle> bigRectList = new ArrayList<Rectangle>();


        for (Rectangle rectangle : rectangleList) {
            if (brf.accept(rectangle)) {
                bigRectList.add(rectangle);
            }
        }
        CollectClass.collectAllRect(bigRectList);
    }

}
