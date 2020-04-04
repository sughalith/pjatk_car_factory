package pl.pjatk.zjazd2.a1;

public class Rectangle {
    private int x;
    private int y;

    public int calculateArea() {
        return this.x * this.y;
    }

    public int calculateArea(int x, int y) {
        return x * y;
    }

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
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
