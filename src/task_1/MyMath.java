package task_1;

public class MyMath {

    public static double abs(double a) {
        if (a >= 0) {
            return a;
        } else {
            return -1 * a;
        }
    }

    public static float abs(float a) {
        if (a >= 0) {
            return a;
        } else {
            return -1 * a;
        }
    }

    public static int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return -1 * a;
        }
    }

    public static long abs(long a) {
        if (a >= 0) {
            return a;
        } else {
            return -1 * a;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double[] array) {
        double maxArray = array[0];
        for (double i : array) {
            if (i > maxArray) {
                maxArray = i;
            }
        }
        return maxArray;
    }
    public static int max(int[] array) {
        int maxArray = array[0];
        for (int i : array) {
            if (i > maxArray) {
                maxArray = i;
            }
        }
        return maxArray;
    }
}