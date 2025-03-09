package OOPslide2;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class BT2slide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println("Dãy số sau khi sắp xếp tăng dần " + Arrays.toString(a));
    }
}
