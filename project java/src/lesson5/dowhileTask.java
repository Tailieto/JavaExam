package lesson5;

public class dowhileTask {
    public static void main(String... ar){
        int n = 1;
        do {
            if (n % 5 == 0) {
                System.out.print(n + ", ");
                n++;
            }
            else {
                n++;
            }
        } while (n < 101);
    }
}
