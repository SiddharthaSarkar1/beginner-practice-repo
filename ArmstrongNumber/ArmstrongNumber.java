import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num) ? num + " is an Armstrong Number." : num + " in not an Armstrong Number.");
    }

    public static boolean isArmstrong(int num){
        int temp = num;
        int sum  = 0;
        int digitCount = String.valueOf(num).length();

        while(temp != 0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digitCount);
            temp = temp / 10; 
        }

        return sum == num;
    }
}