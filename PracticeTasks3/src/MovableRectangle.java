public class MovableRectangle implements Movable {
    private MovablePoint upperLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.upperLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    @Override
    public void moveUp() {
        this.upperLeft.y += this.upperLeft.ySpeed;
        this.bottomRight.y += this.bottomRight.ySpeed;
    }
    @Override
    public void moveDown() {
        this.upperLeft.y -= this.upperLeft.ySpeed;
        this.bottomRight.y -=this.bottomRight.ySpeed;
    }
    @Override
    public void moveRight() {
        this.upperLeft.x += this.upperLeft.xSpeed;
        this.bottomRight.x += this.bottomRight.xSpeed;
    }
    @Override
    public void moveLeft() {
        this.upperLeft.x -= this.upperLeft.xSpeed;
        this.bottomRight.x -= this.bottomRight.xSpeed;
    }
    @Override
    public String toString() {
        return "x1 = " + this.upperLeft.x + "\ny1 = " + this.upperLeft.y + "\nx2 = " + this.bottomRight.x +
                "\ny2 = " + this.bottomRight.y + "\n";
    }
}