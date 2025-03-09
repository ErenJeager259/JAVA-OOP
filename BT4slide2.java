package OOPslide2;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class BT4slide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int value = 1,left = 0,right = n-1,top = 0,bot = n-1;
        while(value <= n*n){
            for(int i = left;i <= right;i++){
                a[top][i] = value;
                value++;
            }
            top++;
            for(int i = top;i <= bot;i++){
                a[i][right] = value;
                value++;
            }
            right--;
            for(int i = right;i >= left;i--){
                a[bot][i] = value;
                value++;
            }
            bot--;
            for(int i = bot;i >= top;i--){
                a[i][left] = value;
                value++;
            }
            left++;
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.printf("%4d",a[i][j] );
            }
            System.out.println();
        }
    }
}
