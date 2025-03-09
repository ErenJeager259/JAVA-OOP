package OOPslide2;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class BT1slide2 {
    static void randomm(int[] a) {
        Random rand = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = rand.nextInt(i);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++)
            a[i] = sc.nextInt();
        randomm(a);
        System.out.println("Dãy số sau khi tráo đổi: " + Arrays.toString(a));
    }
}

