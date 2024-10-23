package Oct.Task23102024;

import java.util.Scanner;

public class Task1 {
    static int sum(int num1,int num2){
        return num1+num2;
    }
    static int sub(int num1,int num2){
        return num1-num2;
    }
    static int mul(int num1, int num2){
        return num1*num2;
    }
    static double  div(int num1,int num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1= sc.nextInt();
        System.out.println("Enter the number2:");
        int num2= sc.nextInt();
        System.out.println("Sum: "+sum(num1,num2));
        System.out.println("Sub: "+sub(num1,num2));
        System.out.println("Mul: "+mul(num1,num2));
        System.out.println("Div: "+div(num1,num2));
    }
}
