package ru.job4j.condition;

/**
 * @author Sosnov Mikhail
 * @version $Id$
 * @since 0.1
 */

public class PointWith {
    private int x;
    private int y;

    public PointWith(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(PointWith that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

}
