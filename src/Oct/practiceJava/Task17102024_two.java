package Oct.practiceJava;

import java.util.Scanner;

public class Task17102024_two {
    public static void main(String[] agr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int a= sc.nextInt();
        System.out.println("Enter the second no:");
        int b= sc.nextInt();
        System.out.println("enter the third no:");
        int c= sc.nextInt();
        if(b == c && c == a){
            System.out.println("equilateral triangle:");
        } else if (b == c && c !=a) {
            System.out.println("Isosceles triangle:");
        }else if (b != c && a!=b){
            System.out.println("Scalene Triangle");
        }else{
            System.out.println("no triangle exist");
        }
        sc.close();

    }
}
