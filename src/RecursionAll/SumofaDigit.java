package RecursionAll;
// Q sum of digits of a number 1342= 1+3+4+2=10
public class SumofaDigit {
    public static void main(String[] args) {
        System.out.println(sumDigit(1342));
        System.out.println(productDigit(1342));
    }
    public static int sumDigit(int n){
        if (n==0){
            return 0;
        }

        return n%10 + sumDigit(n/10);
    }
    public static int productDigit(int n){
        if (n==0){
            return 1;
        }

        return n%10 * productDigit(n/10);
    }

}
