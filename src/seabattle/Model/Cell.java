package seabattle.Model;

/**
 * Created by lysenko on 10.12.2017.
 */
public class Cell {
    int x;
    int y;
    public Ship ship = null;
    public boolean isShoot;

    public Cell(int x, int y, Ship ship, boolean isShoot) {
        this.x = x;
        this.y = y;
        this.ship = ship;
        this.isShoot = isShoot;
    }
}
