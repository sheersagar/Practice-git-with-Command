import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] arr = {4,5,4,2,1,5};
//        iterationMethod(arr);
//        System.out.println(Arrays.toString(arr));

        recMethod(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    // Bubble Sort by Iteration Method....

    public static void iterationMethod(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int[] recMethod(int[] arr, int c, int r){
        if(r == 0){
            return null;
        }

        if(c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            recMethod(arr, c + 1, r);
        } else {
            recMethod(arr, 0, r-1);
        }
        return arr;
    }
}
