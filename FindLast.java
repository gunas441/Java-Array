public class FindLast {
    public static void main(String[] args) {
        int [] arr={2,5,7,8,5};
        findLastElament(arr);
    }

    public static void findLastElament(int[] arr){
        int n = arr.length;
        int temps=0;
        int largest=0;
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temps=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temps;
                }
            }
           arr2[i]=arr[i];
        }
        for (int i : arr2) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println("Largest = "+largest);
    }
}
