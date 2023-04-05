package Resizeable;

public class Square implements Resizeable {
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
        this.size *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }
}
