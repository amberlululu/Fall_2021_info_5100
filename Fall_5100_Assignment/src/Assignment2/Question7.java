package Assignment2;
import java.util.*;
//7)Add Strings-https://leetcode.com/problems/add-strings/
// Given two non-negative integers,num1 and num2 represented as string,return the sum of num1 and num2 as a string.
// You must solve the problem without using any built-in library for handling large integers (such asBigInteger).
// You must also not convert the inputs to integers directly.
// Example 1:Input:num1 = "11", num2 = "123" Output:"134"
// Example 2:Input:num1 = "456", num2 = "77" Output:"533"
// Example 3:Input:num1 = "0", num2 = "0"      Output:"0"
// Constraints:•1 <= num1.length, num2.length <= 104•num1 and num2 consist of only digits.•num1 and num2 don't have any leading zeros except for the zero itself.

public class Question7 {
    public static void main(String[] args) {
       String  str1 = "11", str2 = "123";
        System.out.println(addString(str1, str2));
        String  str3 = "456", str4 = "77";
        System.out.println(addString(str3, str4));
        String  str5 = "0", str6 = "0";
        System.out.println(addString(str5, str6));

    }

    // Time Complexity  O(n)
    // Space Complexity O(1)

    public static String addString(String s1, String s2){
        int pointer1 =s1.length()-1;
        int pointer2 =s2.length()-1;
        int carry = 0;
        int sum;

        StringBuilder sb = new StringBuilder();
        while(pointer1 >=0 || pointer2 >=0){
            int a = 0;
            int b = 0;

            if(pointer1 >=0){
                a  = s1.charAt(pointer1)-'0';
            }
            if(pointer2 >=0){
                b = s2.charAt(pointer2)-'0';
            }

            sum = a+b+carry;
            int last = sum%10;
            carry = sum/10;
            sb.append(last);

            pointer1--;
            pointer2--;

        }

        if(carry >0){
            sb.append(carry);
        }
        return sb.reverse().toString();

    }
}
