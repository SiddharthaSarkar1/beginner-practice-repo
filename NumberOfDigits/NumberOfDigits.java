import java.util.Scanner;

public class NumberOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        System.out.println("Number of digits in "+ num +" is : "+ countDigits(num));
    }

    public static int countDigits(int num){
        int count = 0;
        if(num < 0){
            num = num * -1;
        }else if(num == 0){
            num = 1;
        }

        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}