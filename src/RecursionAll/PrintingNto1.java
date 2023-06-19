package RecursionAll;

public class PrintingNto1 {
    public static void main(String[] args) {
        just_print(5);
    }
    public static void just_print(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + "->");
        just_print(n-1);
                System.out.print(n + "->");
    }
}
