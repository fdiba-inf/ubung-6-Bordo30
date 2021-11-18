package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int nextDigit;
        int sum = 0;
        boolean palindrome = false;
        int temp = number;

        while(number > 0) {
            nextDigit = number % 10;
            sum = (sum*10) + nextDigit;
            number /= 10;
        }

        if(temp == sum) {
            palindrome = true;
        }

        System.out.println("Palindrome: " + palindrome);
    }
}
