public class RectangleGoodConstructors {

    // The 1st constructor calls the 2nd constructor, the second constructor calls the 3rd constructor and the
    // 3rd constructor initializes the instance variables.

    // The 3rd constructor does all the work.

    // No matter which constructor we call, the variables will always be initialized in the third constructor.

    // This is known as constructor chaining, the last constructor has the responsibility to initialize the variables.


    private int x;
    private int y;
    private int width;
    private int height;

    public RectangleGoodConstructors() {
        this(0,0); // calls the second constructor
    }

    public RectangleGoodConstructors(int width, int height) {
        this(0, 0, width, height); //calls the third constructor
    }

    public RectangleGoodConstructors(int x, int y, int width, int height) {
        // initializes variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
