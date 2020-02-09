package ru.ftry.homework2;

public class Point {
    public double x;
    public double y;
    public double x2;
    public double y2;

    public Point (double x, double y, double x2, double y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance () {
        return Math.sqrt(((this.x2 - this.x) * (this.x2 - this.x)) + ((this.y2 - this.y) * (this.y2 - this.y)));
    }
}
