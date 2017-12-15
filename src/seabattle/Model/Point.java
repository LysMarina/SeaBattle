package seabattle.Model;

import java.util.Random;

/**
 Created by lysenko on 10.12.2017.
 */
public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getRandomPoint() {
        return new Point(new Random().nextInt(10), new Random().nextInt(10));
    }
}
