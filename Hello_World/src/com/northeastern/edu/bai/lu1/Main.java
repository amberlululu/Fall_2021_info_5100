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

        printDayOfTheWeek(0);
        printDayOfTheWeekSwitch(3);
        printMonth("Jan");
//        printSeason("Oct");




    }

    static void printDayOfTheWeek(int day){
        // Sun =0, Mon =1....
        if(day ==0){
            System.out.println("Today is Sunday");
        }else if(day==1){
            System.out.println("Today is Monday");
        }else if(day==2){
            System.out.println("Today is Tuesday");
        }else if(day==3){
            System.out.println("Today is Wednesday");
        }else if(day==4){
            System.out.println("Today is Thursday");
        }else if(day==5){
            System.out.println("Today is Friday");
        }else if(day==6){
            System.out.println("Today is Saturday");
        }else{
            System.out.println("Today is invalid day");
        }
    }

    static void printDayOfTheWeekSwitch(int day){
        switch(day){
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is invalid day");
                break;

        }

    }

    static void printMonth(String month){
        switch(month){
            case "Jan":
                System.out.println("January");
                break;
            case "Feb":
                System.out.println("february");
                break;
            case "Mar":
                System.out.println("March");
                break;
            case "Apr":
                System.out.println("April");
                break;
            case "May":
                System.out.println("May");
                break;
            case "Jun":
                System.out.println("June");
                break;
            case "Jul":
                System.out.println("July");
                break;
            case "Aug":
                System.out.println("August");
                break;
            case "Sep":
                System.out.println("september");
                break;
            case "Oct":
                System.out.println("October");
                break;
            case "Nov":
                System.out.println("November");
                break;
            case "Dec":
                System.out.println("December");
                break;
        }
    }

//    static void printSeason(String month){
//        switch(month){
//            case "Jan","Feb","Mar":
//                System.out.println("Spring");
//                break;
//            case "Apr","May","Jun":
//                System.out.println("Summer");
//                break;
//            case "Jul","Aug","Sep":
//                System.out.println("Fall");
//                break;
//            case "Oct","Nov","Dec":
//                System.out.println("Winter");
//                break;
//        }
//    }

}
