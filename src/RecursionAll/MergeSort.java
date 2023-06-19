package RecursionAll;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        int[] ans= mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid= (arr.length)/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr, 0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left, right);
    }
    public static int[] merge(int[] left, int[]right){
        int[] max= new int[left.length+ right.length];
        int l=0;
        int r=0;
        int k=0;

        while(l< left.length && r<right.length){
            if (left[l]<right[r]) {
                max[k] = left[l];
                l++;
            }else{
                max[k] = right[r];
                r++;
            }
            k++;
        }
        while(l< left.length){
            max[k]=left[l];
            l++;
            k++;
        }
        while(r< right.length){
            max[k]=right[r];
            r++;
            k++;
        }
        return max;
    }
}
