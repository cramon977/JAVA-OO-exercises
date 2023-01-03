package entities;

public class Rectangle {
    public double width;
    public double height;

    public void setRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double area = this.width * this.height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = this.width * 2 + this.height * 2;
        return perimeter;
    }
    public double getdiagonal(){
        double diagonal = Math.sqrt((Math.pow(this.width, 2)) + (Math.pow(this.height, 2)));
        return diagonal;
    }
    public String toString() {
        return "Area = "
               + getArea()
               +"\nPerimeter = "
               + getPerimeter()
               + "\nDiagonal = "
               + getdiagonal();
    }


}
