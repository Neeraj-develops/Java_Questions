package RecursionAll;

public class BubbbleSortRecursion {
    public static void main(String[] args) {

    }
    public static void bubbleSort(int[]arr, int r,int c){
        if (r>0){
            return;
        }
        if (r>c){
            if(arr[c]<arr[c-1]){
                int temp = arr[c-1];
                arr[c-1]= arr[c];
                arr[c]=temp;
            }
            bubbleSort(arr,r,c+1);
        }else {
            bubbleSort(arr,r-1, 0);
        }
    }
}
