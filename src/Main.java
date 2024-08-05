import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        System.out.println("---Part 1---");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("---Part 2---");
        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println("---Part 3---");
        boolean[] arr3 = new boolean[4];
        arr3[0] = true;
        arr3[1] = false;
        arr3[2] = true;
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        System.out.println("Task 2");
        System.out.println("---Part 1---");
        System.out.println(Arrays.toString(arr));

        System.out.println("---Part 2---");
        System.out.println(Arrays.toString(arr2));

        System.out.println("Task 3");
        System.out.println("---Part 1---");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        System.out.println("---Part 2---");
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        System.out.println();

        System.out.println("Task 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = arr[i] + 1;
            }
        } System.out.println(Arrays.toString(arr));
    }
}