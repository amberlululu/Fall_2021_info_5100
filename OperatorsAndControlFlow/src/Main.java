import java.util.*;

public class Main {
    public static void main(String[] args) {
        // + add
        // - minus
        //* multiply
        // / divide
        // == equals to
        // != is not equal to
        // < less than
        // > bigger than
        //

        int b = 25;
        if(b ==10 || b > 22){
            System.out.println("b is is eaual to 10 or greater than 22");
        }

        // result = (condition) ? value1: value2;
        b = 18;
        int result  = 9;
        if(b > 10){
            result = 10;

        }else{
            result = 12;
        }

        result = b>10? 10: 12;


        if(b < 10){
            System.out.println("b is less than 10");
        }else if(b> 20){
            System.out.println("b is greater than 20");
        }else{
            System.out.println(" b is not a valid number");
        }
       // change positive num to negative
       int  a = -5;
        // take negative of a
        a = ~a;
        a = a+1;
        System.out.println("A's value should be " + a);



        // Array

        // loops
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = -3;
        arr[3] = 7;
        arr[4] = 0;


        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int num : arr){
            System.out.println(num);
        }

        boolean[] bValues = {true, false, false, true};
        for(boolean bValue: bValues){
            // bValue is only inside the for loop it cannot be achieved outside
            System.out.println(bValue);
        }

        //System.out.println(bValue); cannot be reached


        // while loop

        int count  = 10;

        while(count  > 0){
            System.out.println("Count value" + count);
            count--;
        }

        // Do while

        // differnece : do part at least run one time

        System.out.println();


        do{
            System.out.println("count value" + count);
            count --;
        }while(count > 0);

         // String is a class
        // one you create a string it cannot be change if you change the content it basically create a new string and add the new value
        char[] name ={'A','M','B','E','R'};
        for(char c : name){
            System.out.println(c);
        }

        System.out.println();

        String myName = "Amber Bai";
        String name1 = "Amber Bai";
        String name2 = "Amber Bai ";

        // If the first string is lexicographically greater than the second string,
        // it returns a positive number (difference of character value).
        // If the first string is less than the second string lexicographically, it returns a negative number,
        // and if the first string is lexicographically equal to the second string,it returns 0.
        System.out.println(name1.compareTo(name2));






    }





}
