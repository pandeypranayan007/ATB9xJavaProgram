package Oct.Task22102024;

//Reverse the number using for loop. (In - 12345, Out - 54321)

import java.sql.SQLOutput;
import java.util.Scanner;public class Task1 {


        public static void main(String[] agr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No:");
           int n = sc.nextInt();
           System.out.println("Reverse No:");
           // reveerse no.
            int rev=0;
            // remainder
            int rem;

            while (n > 0) {
                rem = n % 10;
                rev = (rev * 10) + rem;
                n = n / 10;

            }
            System.out.println(rev);
        }

    }
