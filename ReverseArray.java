//Algorithm

/*Condition-> 0<5/2,i++

Input -> 12345

Calculation -> 5-0-1, 5-1-1, 5-2-1, 5-3-1, 5-4-1

Outpu ->4,3,2,1,0

Asign->temp->5,4,3,2,1*/

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        reverse(arr);
    }

    public static void reverse(int[] arr){
        int size = arr.length;
        for(int i=0;i<size/2;i++){
            int temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
