public class ShapeSuper {

    private int x;
    private int y;


    public ShapeSuper(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Rectangle extends ShapeSuper {

    private int width;
    private int height;

    // 1st constructor
    public Rectangle(int x, int y) {
        this(x, y); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // calls constructor from parent (ShapeSuper)
        this.width = width;
        this.height = height;
    }
}
