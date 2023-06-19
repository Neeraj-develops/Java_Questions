package RecursionAll;

public class BinarySearchinRecursion {
    public static void main(String[] args) {
        int[] arr={1,3,6,8,12,14,17};
        System.out.println(binarySearch(arr ,14));
    }
    public static int binarySearch(int[]arr, int tar){
        int s= 0;
        int e= arr.length-1;
        int ans= searchtarget(arr, tar, s,e);
        return ans;
    }
    public static int searchtarget(int[]arr, int tar, int s, int e){
        int mid= (s+e)/2;

        if (arr[mid]==tar){
            return mid;
        }else if(arr[mid]>tar){
            return searchtarget(arr, tar, s, mid-1);
        }else {
            return searchtarget(arr, tar, mid+1, e);
        }
    }
}
