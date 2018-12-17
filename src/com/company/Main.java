package com.company;

//it checks the last digit of three different integer .
// if last digits of any two integers are same,it prints true, otherwise it prints false.

import java.util.*;



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input first number: ");
        int a = input.nextInt();
        System.out.println("input second number: ");
        int b = input.nextInt();
        System.out.println("input third number: ");
        int c = input.nextInt();

        boolean b1 = true;


        System.out.println(findNumber(a, b, c, true));

        System.out.println("the result is from second method is  : "+ checkLastDigits(a,b,c));

    }

    public static boolean findNumber(int x, int y, int z, boolean xyz) {

        return ((x % 10 == y % 10 || z % 10 == x % 10 || x % 10 == y % 10));

    }

    public static  boolean checkLastDigits(int a, int b, int c){

        boolean compare=false;
        String firstnum = String.valueOf(a);
        String secondnum = String.valueOf(b);
        String thirdnum = String.valueOf(c);

        int first = firstnum.charAt(firstnum.length()-1);
        int second = secondnum.charAt(secondnum.length()-1);
        int third = thirdnum.charAt(thirdnum.length()-1);

        if(first==second ||second==third || third == first) {

            compare = true;
        }
        return compare;
    }

}



