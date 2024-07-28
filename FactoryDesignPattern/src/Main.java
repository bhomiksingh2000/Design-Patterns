public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("CIRCLE");
        shapeFactory.getShape("RECTANGLE");
        shapeFactory.getShape("SQUARE");
        shapeFactory.getShape("No shape");
    }
}