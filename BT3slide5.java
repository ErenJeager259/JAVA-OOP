package OOPslide5;

public class BT3slide5 {
    public static void main(String[] args) {
        int n = 5;
        long start1 = System.nanoTime();
        // System.out.println("Start 1 " + start1);
        String s1 = "";
        for (int i = 1; i <= n; i++) {
            s1 += "cr7";
        }
        long end1 = System.nanoTime();
        //  System.out.println("End 1 " + end1);
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        // System.out.println("Start2 " + start2);
        StringBuffer s2 = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            s2.append("cr7");
        }
        long end2 = System.nanoTime();
        // System.out.println("End2 " + end2);
        long time2 = end2 - start2;

        System.out.println("Thời gian với String (+): " + time1  + " s");
        System.out.println("Thời gian với StringBuffer (append): " + time2 + " s");
        System.out.println("Thời gian StringBuffer gấp số lần so với String: " + time1/time2);
    }
}
