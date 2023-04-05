package colorable;

public class Square implements Colorable {


    private double size;
    private String color;

    public Square() {

    }

    public Square(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return size * size;
    }


    @Override
    public String howToColor() {
        return "Color all four sides";
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}' + "Area = " + getArea();
    }
}
