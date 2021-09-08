package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Hello world!
 *
 */
public class App 
{
static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        //char[] str;
        String str = new String();
        App reader = new App();
        int a = reader.readint1();
        int b = reader.readint2();

            str = reader.math(a,b);
            reader.printer(str);

    }

    private int readint1(){
        out.print("Enter an integer: ");
        int int1 = in.nextInt();
        return int1;
    }
    private int readint2(){
        out.print("Enter another integer: ");
        int int2 = in.nextInt();
        return int2;
    }

    private String math( int a,int b){
        return String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d /%d = %d", a, b, a+b,a,b,a-b,a,b,a*b,a,b,a/b);
                       // return Str;
                }


    private void printer(String str){System.out.print(str);
}}
