package labs.itacademy.skarpen.labs1_2_3;

import java.util.Scanner;

/**
 * Created by user on 28.12.2019.
 */
public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        if (d > 10) {
            System.out.println("High Five");
        } else if (d < 1) {
            System.out.println("shh");
        } else
            for (int i = 0; i < d; i++) {
                System.out.println("df");
            }


    }
}

