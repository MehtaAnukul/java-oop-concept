package ClassObject;
import java.util.Scanner;
/**
 * Created by Anukul-PC on 12-03-2018.
 */

public class palindromeUseFun {
    public static boolean isPalindrome(int num)
    {
        int sum,tNum;
        //find reverse number
        tNum=num;
        sum =0;
        while(tNum>0)
        {
            sum = (sum*10) + (tNum%10);
            tNum/=10;
        }

        if(num==sum)
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        int num;

        Scanner s=new Scanner(System.in);

        //input an integer number
        System.out.print("Enter any integer number: ");
        num= s.nextInt();

        if(isPalindrome(num))
            System.out.println(num + " is a Palindrome Number.");
        else
            System.out.println(num + " is not a Palindrome Number.");
    }
}
