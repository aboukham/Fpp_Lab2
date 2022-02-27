package lab2;

import java.util.Scanner;

public class MainOfProg3 {

    public static void printArea(Scanner sc, String shape){
        //first way using if statement
        /*if (shape.equals("T")){
            System.out.println("Enter the base of Triangle:");
            double base = sc.nextDouble();
            System.out.println("Enter the height of Triangle:");
            double height = sc.nextDouble();
            Triangle    t = new Triangle(base, height);
            System.out.println("The area of Triangle is: " + t.computeArea());
        }else if (shape.equals("R")){
            System.out.println("Enter the width of Rectangle:");
            double width = sc.nextDouble();
            System.out.println("Enter the height of Rectangle:");
            double height = sc.nextDouble();
            Rectangle   r = new Rectangle(width, height);
            System.out.println("The area of Triangle is: " + r.computeArea());

        }else if (shape.equals("C")){
            System.out.println("Enter the radius of Circle:");
            double radius = sc.nextDouble();
            Circle      c = new Circle(radius);
            System.out.println("The area of Circle is: " + c.computeArea());
        }else
            System.out.println("I'm sorry, you entered invalid input: ");*/
        //second way using switch
        switch (shape) {
            case "T":
                System.out.println("Enter the base of Triangle:");
                double base = sc.nextDouble();
                System.out.println("Enter the height of Triangle:");
                double height = sc.nextDouble();
                Triangle t = new Triangle(base, height);
                System.out.println("The area of Triangle is: " + t.computeArea());
                break;
            case "R":
                System.out.println("Enter the width of Rectangle:");
                double width = sc.nextDouble();
                System.out.println("Enter the height of Rectangle:");
                height = sc.nextDouble();
                Rectangle r = new Rectangle(width, height);
                System.out.println("The area of Triangle is: " + r.computeArea());
                break;
            case "C":
                System.out.println("Enter the radius of Circle:");
                double radius = sc.nextDouble();
                Circle c = new Circle(radius);
                System.out.println("The area of Circle is: " + c.computeArea());
                break;
            default:
                System.out.println("I'm sorry, you entered invalid input: ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter C for circle");
            System.out.println("Enter R for rectangle");
            System.out.println("Enter T for triangle");
            String shape = sc.next();
            printArea(sc, shape);
            System.out.println("Do you want to continue?(yes/no)");
            String  response = sc.next();
            if (response.equalsIgnoreCase("no"))
                break;
            else if (response.equalsIgnoreCase("yes"))
                continue;
            else
                System.out.println("you entered invalid input, you can continue");
        }
    }
}
