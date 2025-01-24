package LAB_2;

public class Q1 {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int largest = Integer.MIN_VALUE;
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i; j < arr.length; j++) {
//                sum = 0;
//                for(int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//                if(sum > largest) {
//                    largest = sum;
//                }
//            }
//        }
//        System.out.println(largest);

    public static void Kadane(int[] arr) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int j : arr) {
            cs += j;
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        Kadane(arr);
    }
}
