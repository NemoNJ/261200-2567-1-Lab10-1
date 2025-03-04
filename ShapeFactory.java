public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;

    private static final int MAX_EACH_SHAPE = 2;
    private static final int MAX_TOTAL_SHAPES = 5;

    private static int circleCount = 0;
    private static int rectangleCount = 0;
    private static int squareCount = 0;
    private static int totalShapes = 0;

    public static Shape getShape(int type){
        if (totalShapes >= MAX_TOTAL_SHAPES) {
            System.out.println("Cannot create more Shapes limit of 5 reached");
            return null;
        }

        switch (type) {
            case TYPE_CIRCLE:
                if (circleCount < MAX_EACH_SHAPE) {
                    circleCount++;
                    totalShapes++;
                    return new Circle();
                }
                break;
            case TYPE_RECTANGLE:
                if (rectangleCount < MAX_EACH_SHAPE) {
                    rectangleCount++;
                    totalShapes++;
                    return new Rectangle();
                }
                break;
            case TYPE_SQUARE:
                if (squareCount < MAX_EACH_SHAPE) {
                    squareCount++;
                    totalShapes++;
                    return new Square();
                }
                break;
            default:
                System.out.println("Invalid shape type");
                return null;
        }
        System.out.println("Cannot create more specific Shapes limit of 2 reached");
        return null;
    }
}
