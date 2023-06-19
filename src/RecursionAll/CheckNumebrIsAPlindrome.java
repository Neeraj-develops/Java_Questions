package RecursionAll;

public class CheckNumebrIsAPlindrome {
    public static void main(String[] args) {
        System.out.println(plaindrome(12321));
    }
    public static boolean plaindrome(int n){
        if (check(n,0)==n){
            return true;
        }
        else {
            return false;
        }
    }
    public static int check(int n, int t){
        if(n==0){
            return t;
        }
        t=t*10+ (n%10);
        return check(n/10, t);
    }
}
