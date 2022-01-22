import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        String str = "Hi!"; // new String("Hi!");
//
//        int[] arr = {3, 4, 5, 6};
//
//        System.out.println(Arrays.toString(arr));
//
//        arr = new int[]{7, 8, 9};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        int[][] arr = {
//                {3, 5},
//                {7},
//                {8, 10, 12}
//        };
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
        //System.out.println(Arrays.toString(arr));

       // Find max value and index in array
//        int[] arr = {10, 9, 6, 15, 8, 12};
//
//        int index = 0;
//        int max = arr[index];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//                index = i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(index);

        //Find min value in array
//        int [] arr = {3, 2, 15, 2, 5, 6, 2, 2};
//
//
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println("Min element is:" + min);
//
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (min == arr[i]) {
//                count++;
//                System.out.println("Min element is " + arr[i] + " with index: "  + i);
//            }
//        }
//        System.out.println("Number of min elements is: " + count);
           // Find sum of elements
        int[] arr = {2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements of array: " + sum);
    }
}
