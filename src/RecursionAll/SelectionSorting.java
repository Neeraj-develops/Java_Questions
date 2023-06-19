package RecursionAll;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr= {2,5,4,6,1};
        selectionSort(arr, arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[]arr, int r, int c ,int m){
        if (r==0){
            return;
        }
        if (r==c){
            if (arr[c]>arr[m]){
                swap(arr,r,c);

            }else {
                swap(arr,r,m);
            }

        }
        if (r>c){
            if (arr[c]>arr[m]){
                selectionSort(arr, r,c+1,c);

            }else{
                selectionSort(arr, r,c+1,m);
            }


        }else{
            selectionSort(arr, r-1,0,0);
        }
    }
    public static void swap(int[]arr,int last,int max){
        int temp= arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}
