package RecursionAll;

import java.util.ArrayList;

public class CeilingBinaryRecursion {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[] arr={1,3,6,8,12,14,17};
        binarySearch(arr ,15);
        System.out.println(list);

        //Adding one list all elements into another
//        ArrayList<Integer> list_1= new ArrayList<>();
//        ArrayList<Integer> list_2= new ArrayList<>();
//        list_2.add(2);
//        list_2.add(3);
//        list_2.add(4);
//
//        list_1.addAll(list_2);
//        System.out.println(list_1);

        ArrayList<Integer> ans= binarySearch(arr, 15, new ArrayList<Integer>());
        System.out.println(ans);
    }

    public static ArrayList binarySearch(int[]arr, int tar, ArrayList<Integer> list){
        int s= 0;
        int e= arr.length-1;
        int ans= searchCeiling(arr, tar, s,e);
        list.add(arr[ans]);
        list.add(ans);
        return list;
    }
    public static void binarySearch(int[]arr, int tar){
        int s= 0;
        int e= arr.length-1;
        int ans= searchCeiling(arr, tar, s,e);
        list.add(arr[ans]);
        list.add(ans);
    }

    public static int searchCeiling(int[]arr, int tar, int s, int e){
        int mid= (s+e)/2;

        if (s>e){
            return s;
        }

       if(arr[mid]>tar){
            return searchCeiling(arr, tar, s, mid-1);
        }else {
            return searchCeiling(arr, tar, mid+1, e);
        }


    }

}
