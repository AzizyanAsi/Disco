package disco.task1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x - 0, 2.0) + Math.pow(y - 0, 2.0));

    }

    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(x - secondPoint.getX(), 2.0) + Math.pow(y - secondPoint.getY(), 2.0));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
