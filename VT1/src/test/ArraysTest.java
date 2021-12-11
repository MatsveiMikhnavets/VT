package test;

import org.junit.Test;
import main.tasks4to8.Arrays;

public class ArraysTest {

    @Test
    public void doTask4() {
        System.out.println("\nTest for 4 task");
        int arr[] = {1, 3, 5, 7, 8, 9, 101};
        System.out.print("Array : ");
        writeArray(arr);
        System.out.println();
        System.out.print("Simple : ");
        writeArray(Arrays.doTask4(arr));
    }

    @Test
    public void doTask5() {
        System.out.println("\nTest for 5 task");
        int arr[] = {5, 10, 6, 12, 3, 24, 7, 100, 8, 9, 1, 12, 12};
        int arr2[] = {100, 99, 26, 17, 11, 9, 6, 4, 1, 0};
        int arr3[] = {1, 5, 7, 9, 10, 16, 19, 19, 44, 51, 100, 120};
        System.out.println("N = " + arr.length + " for random K = " + Arrays.doTask5(arr));
        System.out.println("N = " + arr2.length + " for descending sorted K = " + Arrays.doTask5(arr2));
        System.out.println("N = " + arr3.length + " for sorted K = " + Arrays.doTask5(arr3));
    }


    @Test
    public void doTask6() {
        System.out.println("\nTest for 6 task");
        int arr[] = {1, 3, 5, 7, 8, 9};
        System.out.print("Array : ");
        writeArray(arr);
        System.out.println();
        System.out.println("Matrix : ");
        int array[][] = Arrays.doTask6(arr);
        for (int i = 0; i < arr.length; i++) {
            writeArray(array[i]);
            System.out.println();
        }
    }

    @Test
    public void doTask7() {
        System.out.println("\nTest for 7 task");
        int arr2[] = {100, 99, 26, 17, 11, 9, 6, 4, 1, 0};
        writeArray(arr2);
        System.out.println();
        writeArray(Arrays.doTask7(arr2));

    }

    @Test
    public void doTask8() {
        System.out.println("\nTest for 8 task");
        int arrA[] = {1, 3, 5, 7, 8, 9, 101};
        int arrB[] = {1, 3, 5, 7, 8, 9, 10, 23, 45};
        System.out.print("A: ");
        writeArray(arrA);
        System.out.println();
        System.out.print("B: ");
        writeArray(arrB);
        System.out.println();
        System.out.print("Result: ");
        writeArray(Arrays.doTask8(arrA, arrB));
    }

    private static void writeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}