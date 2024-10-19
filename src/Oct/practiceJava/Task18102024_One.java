package Oct.practiceJava;

import java.util.Scanner;

public class Task18102024_One {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();

        System.out.println("Choose Option:");
        int num =sc.nextInt();

        switch (num){
            case 1:
                int addition = a+b;
                System.out.println("Addition: "+addition);
                break;
            case 2:
                int subtraction = a-b;
                System.out.println("subtraction: "+subtraction);
                break;
            case 3:
                int multi= a*b;
                System.out.println("multiplication: "+multi);
                break;
            case 4:
                int div=  a/b;
                System.out.println("division: "+div);
                break;
            default:
                System.out.println("Calculator is not working");
        }
    }
}
