package Task1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c=new Circle();
        int r=sc.nextInt();
        c.setR(r);
        c.getR();
        System.out.print(c.square(r));
    }
}