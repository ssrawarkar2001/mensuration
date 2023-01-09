package MensurationFormulae;

import java.util.Scanner;

public class semiPerimeter {
    public static void main(String[] args) {
        double perimeter, radius, Circle;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter semip perimeter value ");
        radius = sc.nextDouble();
        perimeter = 3.1412 * radius + 2 * radius;
        System.out.println(" semi perimeter " + perimeter);


    }
}
