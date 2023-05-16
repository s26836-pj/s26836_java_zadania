package Zad5_2;

public class MovablePoint implements Movable {
    int x;
    int y;
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public void moveUp() {
        y++;
    }
    public void moveDown() {
        y--;
    }
    public void moveLeft() {
        x--;
    }
    public void moveRight() {
        x++;
    }
}
