package MensurationFormulae;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double area, circle, radius;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter circumferance of circle");
        radius = sc.nextDouble();
        area = 3.1412 * radius * radius;
        System.out.println(" Area of circle " + area );
    }
}
