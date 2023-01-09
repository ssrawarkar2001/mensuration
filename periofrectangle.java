package MensurationFormulae;

import java.util.Scanner;

public class periofrectangle {
    public static void main(String[] args) {
        int area, perimeter, rectangle, circle, l, b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the length of rectangle ");
        l = sc.nextInt();
        System.out.println(" enter the bredth of rectangle ");
        b= sc.nextInt();
        perimeter = 2 * (l+b);
        System.out.println(" perimeter of rectangle " + perimeter);


    }
}
