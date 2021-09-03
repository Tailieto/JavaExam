package lesson5;

public class factorial {
    public static void main(String... ar){
        int n = (int) (Math.random() * 10);
        System.out.println(n);
        for (int a = 1, b = n; a < b; a++){
            n *= a;
        }
        System.out.println(n);
    }
}
