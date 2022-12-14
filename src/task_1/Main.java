package task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(MyMath.abs(-190));
        System.out.println(MyMath.max(30.0,30.02));
        System.out.println(MyMath.max(301,30));
        System.out.println(MyMath.abs(-190.11));
        double[] arrays = {4.0,5.0,6.0,7.0};
        System.out.println(MyMath.max(arrays));
        int[] arraysI = {4,5,6,7};
        System.out.println(MyMath.max(arraysI));
    }
}
