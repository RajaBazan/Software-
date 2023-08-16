package hello.com;

import java.util.Scanner;

class Rectangle12 {
    public double length;
    public double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
class cuboid1 extends Rectangle12{
    public double height;
    public void setHeight(double height){
        this.height = height;
    }
    public double getvolume(){
        return length * width *height;
    }
}
public class Software_Civil_Engineers_for_measurement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle12 rect = new Rectangle12();
        System.out.println("Enter the length of Rectangle: ");
        double l = sc.nextDouble();
        rect.setLength(l);
        System.out.println("Enter the Width of Rectangle: ");
        double w = sc.nextDouble();
        rect.setWidth(w);
        double area = rect.getArea();
        System.out.println("Area of Rectangle: " + area);
//        here we are using cuboid volume
        cuboid1 cube = new cuboid1();

        System.out.println("Enter the Length for cuboid");
        double li = sc.nextDouble();
        cube.setLength(li);
        System.out.println("Enter the width for cuboid");
        double wi = sc.nextDouble();
        cube.setWidth(wi);
        System.out.println("Enter the Height for cuboid");
        double h = sc.nextDouble();
        cube.setHeight(h);
        double volume = cube.getvolume();
        System.out.println("Volume of Cuboid: " + volume);
    }
}
