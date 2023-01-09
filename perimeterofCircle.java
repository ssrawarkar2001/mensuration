package MensurationFormulae;

import java.util.Scanner;

public class perimeterofCircle {

    public static void main(String[] args) {

        double perimeter, circle, radius, Area;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter radius of circle ");

        radius = sc.nextDouble();
        perimeter = 2 * 3.1412 * radius;
        System.out.println(" perimeter of circle " + perimeter);

    }
}
