package RecursionAll;

public class ChecktheArrayisSortedOrNot {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        System.out.println(check(arr,1));
    }
    public  static boolean check(int[] arr,int i){
        if (i == arr.length){
            return true;
        }

        return arr[i]>arr[i-1] && check(arr, i+1);
    }
}
