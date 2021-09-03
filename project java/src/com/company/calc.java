package com.company;
import java.io.IOException;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(sum(b,c));
    }

    static int sum(int i, int a){
        return i + a;
    }
}
