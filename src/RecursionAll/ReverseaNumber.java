package RecursionAll;

public class ReverseaNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(1234, 0));
    }
    public static int reverseNumber(int n, int t){
        if(n==0){
            return t;
        }
        t=t*10+ (n%10);

        return reverseNumber(n/10, t);
    }
}
