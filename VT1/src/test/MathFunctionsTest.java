package test;

import org.junit.Test;
import main.tasks1to3.MathFunctions;

public class MathFunctionsTest {

    @Test
    public void doTask1() {
        System.out.println("\nTest for 1 task");
        System.out.println("result f(3,1)=" + MathFunctions.doTask1(3, 1));
        System.out.println("result f(11,7)=" + MathFunctions.doTask1(11, 7));
        System.out.println("result f(1.4,0.3)=" + MathFunctions.doTask1(1.4, 0.3));
    }

    @Test
    public void doTask2() {
        System.out.println("\nTest for 2 task");
        System.out.println("p(3,1) isBelongs " + MathFunctions.doTask2(3, 1));
        System.out.println("p(-10,0.24) isBelongs " + MathFunctions.doTask2(-10, 0.24));
        System.out.println("p(4.25,-0.1) isBelongs " + MathFunctions.doTask2(4.25, -0.1));
        System.out.println("p(4.25,0.1) isBelongs " + MathFunctions.doTask2(4.25, 0.1));
    }

    @Test
    public void doTask3() {
        System.out.println("\nTest for 3 task");
        System.out.println("F(-5,10,2) :");
        MathFunctions.doTask3(-5, 10, 2);
        System.out.println("F(-1,1,0.25):");
        MathFunctions.doTask3(-1, 1, 0.25);
    }
}