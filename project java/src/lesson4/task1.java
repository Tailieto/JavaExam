package lesson4;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            int i = sc.nextInt();
            System.out.println(dual(i));
        }
        catch ( Exception err ) {
            System.out.println( "Not an integer!" );
        }

    }

    static String dual(int i){
        String result = (i & 1) == 0 ? "Чётное" : "Нечётное";
        return result;

    }
}
