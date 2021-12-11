package main.tasks1to3;

public class MathFunctions {
    public static double doTask1(double x, double y) {
        double lower = (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y)));
        double upper = (1 + Math.pow(Math.sin(x + y), 2));
        return x + upper / lower;
    }

    public static boolean doTask2(double x, double y) {
        x = Math.abs(x);
        if (y > 5 || y < -3 || x > 6) {
            return false;
        }
        if (y > 0 && x > 4) {
            return false;
        }
        return true;
    }

    public static void doTask3(double a, double b, double h) {
        if (a > b) {
            System.out.println("a>b");
            return;
        }
        double h0 = a;
        System.out.println("         x  |  f(x) ");
        while (h0 <= b) {
            System.out.printf("%10.2f  | %.4f%n",h0,Math.tan(h0));
            h0 += h;
        }
    }
}
