package OOPslide2;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class BT3slide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        while(h < 2 || h > 10) {
            h = sc.nextInt();
        }
        for(int i = 1;i <= h;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1;i <= h;i++){
            for(int j = 1;j <= h-i;j++)
                System.out.print(" ");
            for(int j = 1;j <= 2*i-1;j++)
                System.out.print("*");
            for(int j = 1;j <= h-i;j++)
                System.out.print(" ");
            System.out.println();
        }

    }
}
