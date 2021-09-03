package lesson4;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a =  sc.next();
        String b =  sc.next();
        String c =  sc.next();
        double avg = ((Double.parseDouble(a) +  Double.parseDouble(b) + Double.parseDouble(c))/3);
        System.out.println(avg);
    }
}
