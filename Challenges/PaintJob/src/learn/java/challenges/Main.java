package learn.java.challenges;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PaintJob pj = new PaintJob();
        int res = pj.getBucketCount(2.75, 3.25, 2.5, 1);
        res = pj.getBucketCount(7.25, 4.3, 2.35);

        System.out.println("El resultado es: " + res);
    }
}
