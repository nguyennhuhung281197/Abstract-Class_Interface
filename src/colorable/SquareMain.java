package colorable;

public class SquareMain {
    public static void main(String[] args) {

        Square square = new Square();
        square.setSize(2);
        square.setColor("black");


        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(2);
        rectangle.setWidth(3);


        Colorable[] colorable = new Colorable[2];
        colorable[0] =  square;
        colorable[1] =  rectangle;

        for (Colorable colorable1 : colorable) {
            System.out.println(colorable1);
             if (colorable1 instanceof Square){
                 Square colorable2 = (Square)colorable1;
                 System.out.println(colorable2.howToColor());
             }
        }

    }
}
