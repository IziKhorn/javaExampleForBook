package example_1000;

import java.io.*;
import java.util.Scanner;

public class Example {

    public void example_1(){

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a_Str = in.nextLine();
        String b_Str = in.nextLine();
        in.close();

        int a = Integer.parseInt(a_Str);
        int b = Integer.parseInt(b_Str);

        String oper;

        if (a > b) {
            oper = ">";
            System.out.println(oper);
        }
        else if(a < b){
            oper = "<";
            System.out.println(oper);
        }
        else {
            oper = "=";
            System.out.println(oper);
        }
    }
}

