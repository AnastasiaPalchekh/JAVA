package Interface_Shapes;

public class Main {

    private static Shapes[] generateShapes() {
        Shapes[] shapes = new Shapes[25];
        for(int i = 0; i < shapes.length/5; ++i){
            shapes[i] = new Circle(5);}

        for(int i = (shapes.length/5); i < (2 * shapes.length /5); ++i){
            shapes[i] = new Rectangle (5,15);}

        for(int i =(2*shapes.length/5); i<(3*shapes.length/5);++i){
            shapes[i]= new Square(5);
        }

        for (int i = (3* shapes.length/5); i< (4* shapes.length/5); ++i)
        {
            shapes [i] = new Triangle(5,10);
        }

        for (int i = (4* shapes.length/5);i <(shapes.length);++i)
            {
                shapes [i] = new Rhombus(5,4);
            }

        return shapes;
    }

    public static void main(String[] args) {
        // Calculation
        double cumulativeArea = 0;
        for (Shapes shapes : generateShapes()) {
            cumulativeArea = cumulativeArea + shapes.getArea();
        }
        System.out.println(cumulativeArea);

    }
}
