public class WithoutSortingSecondLarge {
    public static void main(String[] args) {
        int [] arr={2,5,7,8,5};
        storeByIndex(arr);
    }

    public static void storeByIndex(int[] arr){
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for(int i=0;arr.length>i;i++){
            if(largest<arr[i]){
                seclargest = largest;
                largest = arr[i];
            } else if (arr[i]>seclargest&&arr[i]!=largest) {
                seclargest=arr[i];
            }
        }
        System.out.println(seclargest);
    }
}
