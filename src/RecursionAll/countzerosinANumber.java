package RecursionAll;

public class countzerosinANumber {
    public static void main(String[] args) {
        System.out.println(count(10030002,0));
    }
    public static int count(int n, int c){
        if (n==0){
            return c;
        }
        if (n%10 ==0){
            c++;
        }
        return count(n/10, c);
    }
}
