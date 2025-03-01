import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
        int num, rev = 0, rem, tempNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        tempNum = num;
        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reverse of "+ tempNum + " is : "+ rev);
    }
}