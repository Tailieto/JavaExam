package lesson4;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int themin = Math.min(module(a), Math.min(module(b), module(c)));
        System.out.println(themin + " is the minimum");
    }

    static int module(int a){
        int result = a >= 0 ? a : -a;
        return result;
    }
}
