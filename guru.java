/**
 * guru
 */
public class guru {

    static int[] Replace(int[] arr){

        int arr1[] = new int[arr.length];

        for (int k = 0; k < arr.length; k++) {
            arr1[k] = (int)Math.abs(arr[k]+Math.pow(k+1, 2)); 
        }

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,9,4,1,-7};
        System.out.println(Replace(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}