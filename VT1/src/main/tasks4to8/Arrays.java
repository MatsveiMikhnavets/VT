package main.tasks4to8;


public class Arrays {

    public static int[] doTask4(int[] arr) {
        int simplenum = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (!isSimple(arr[i])) {
                arr[i] = -1;
                simplenum--;
            }
        }
        int result[] = new int[simplenum];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                result[j++] = arr[i];
            }
        }
        return result;
    }


    public static int doTask5(int array[]) {
        int counts[] = new int[array.length];
        for (int j = 1; j < array.length; j++) {
            for (int k = 0; k < j; k++) {
                if (array[j] >= array[k]) {
                    if (counts[j] <= counts[k]) {
                        counts[j] = counts[k] + 1;
                    }
                }
            }
        }
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (counts[i] > k) {
                k = counts[i];
            }
        }
        return array.length - (++k);
    }

    public static int[][] doTask6(int array[]) {
        int size = array.length;
        int arr[][] = new int[size][size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = array[(j + k) % size];
            }
            k++;
        }
        return arr;
    }

    public static int[] doTask7(int array[]) {
        int step = array.length / 2;
        while (step > 0) {
            int i, j;
            for (i = step; i < array.length; i++) {
                int value = array[i];
                for (j = i - step; (j >= 0) && (array[j] > value); j -= step)
                    array[j + step] = array[j];
                array[j + step] = value;
            }
            step /= 2;
        }
        return array;
    }

    private static boolean isAscending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static int[] doTask8(int arrA[], int arrB[]) {
        int result[] = new int[arrA.length + arrB.length];
        if (isAscending(arrA) && isAscending(arrB)) {
            int a = 0;
            int b = 0;
            for (int i = 0; i < result.length; i++) {
                if (b >= arrB.length) {
                    result[i] = arrA[a];
                    a++;
                } else if (a >= arrA.length) {
                    result[i] = arrB[b];
                    b++;
                } else if (arrA[a] <= arrB[b]) {
                    result[i] = arrA[a];
                    a++;
                } else {
                    result[i] = arrB[b];
                    b++;
                }
            }

        }
        return result;
    }
    private static boolean isSimple(int num) {
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 1; i < num - 1; i++) {
            if (fastPow(i, num - 1, num) != 1) {
                return false;
            }
        }
        return true;
    }

    private static int fastPow(int a, int z, int n) {
        int a1 = a, z1 = z, x = 1;
        while (z1 != 0) {
            while (z1 % 2 == 0) {
                z1 /= 2;
                a1 = a1 * a1 % n;
            }
            z1--;
            x = x * a1 % n;
        }
        return x;
    }
}
