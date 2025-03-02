import java.util.Scanner;

public class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num + " is a Palindrome Number.");
        }else{
            System.out.println(num + " is not a Palindrome Number.");
        }
    }

    public static boolean isPalindrome(int num){
        int originalNumber = num;
        int reversedNumber = 0;
        while(num != 0){
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num / 10;
        }
        return originalNumber == reversedNumber;
    }
}