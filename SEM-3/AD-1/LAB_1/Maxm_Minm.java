package LAB_1;
public class Maxm_Minm {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,43,2,1,3,54,5,2,21};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}