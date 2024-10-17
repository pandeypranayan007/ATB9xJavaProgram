package Oct.practiceJava;

import java.util.Scanner;

public class Task17102024_one {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        float score= sc.nextFloat();
//        System.out.println("enter the second number:");
//        int b= sc.nextInt();
//        int c=(a+b);
//        System.out.println("result :"c );

        if(score<=100 && score>=90){
            System.out.println("Grade: A");
        } else if (score<=89 && score>=80) {
            System.out.println("Grade: B");
        } else if (score<=79 && score>=70) {
            System.out.println("Grade: C");

        } else if (score<=69 && score>=60) {
            System.out.println("Grade: D");
        } else if (score<=59 && score>=33) {
            System.out.println("Grade: E");

        }else{
            System.out.println("fail");
        }
        sc.close();// closing the scanner is best practise but still the garbage collection will do it if you dont do it
    }
}
