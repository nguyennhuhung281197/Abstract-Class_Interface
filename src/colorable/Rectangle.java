package colorable;

import Resizeable.Resizeable;
    public class Rectangle implements Colorable {
        private double width;
        private double height;

        public Rectangle() {
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getAreaRectangle(){
            return width * height;
        }

        @Override
        public String howToColor() {
            return "Color all four sides";
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height +
                    '}' + "Area = " + getAreaRectangle() ;
        }
    }
