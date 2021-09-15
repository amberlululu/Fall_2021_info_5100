package com.northeastern.edu.bai.lu1;

import java.sql.SQLOutput;

// primitive type of Java

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.out.println();
        int numOfStudent = 62;

        Integer test =52;
        int max  =Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("Max value of Integer is " + max);
        System.out.println("Max value of Integer is " + min);

        max = max+1;
        min = min-1;
        System.out.println("Max value of Integer is " + max);
        System.out.println("Max value of Integer is " + min);

        short maxShort = Short.MAX_VALUE;
        short minShort  = Short.MIN_VALUE;
        System.out.println("Max value of maxShort is " + maxShort);
        System.out.println("Max value of minShort is " + minShort);


        // we are using 32 bit float
        float myFloat = 5.23f;
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("Max value of maxShort is " + maxFloat );
        System.out.println("Min value of minShort is " + minFloat);

        double myDouble = 5.23d;
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double .MIN_VALUE;
        System.out.println("Max value of maxShort is " + maxDouble);
        System.out.println("Min value of maxShort is " + minDouble);
        System.out.println("the value of myDouble is " + myDouble);

        char ch = '\u00A9';
        System.out.println("My character is " + ch);


        boolean bTestValue = true;
        // set isTrue to false
        System.out.println(bTestValue);

        bTestValue = !bTestValue;

        System.out.println(bTestValue);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        System.out.println("Max value of maxLong is "+ maxLong);
        System.out.println("Max value of maxLong is "+ minLong);


        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        System.out.println("Max value of maxByte is " + maxByte);
        System.out.println("Max value of maxByte is " + minByte);



    }

}
