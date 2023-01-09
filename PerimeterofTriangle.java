package MensurationFormulae;

import java.util.Scanner;

public class PerimeterofTriangle {
    public static void main(String[] args) {
       double perimeter, S1, S2, S3;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enther the length of first side of triangle");
        S1 = sc.nextInt();
        System.out.println(" Enter the length of second side of triangle");
        S2 = sc.nextInt();
        System.out.println(" Enter the length of third side of triangle");
        S3 = sc.nextInt();

        perimeter = S1 + S2 + S3;
        System.out.println("perimeter of triangle " + perimeter);
    }
}
