package lesson5;

public class switchTask {
    public static void main(String...ar){
        int a = 3;
        switch(a){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            default:
                System.out.println("Другой день недели");
                break;
        }
    }
}
