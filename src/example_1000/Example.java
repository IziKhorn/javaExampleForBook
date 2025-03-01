package example_1000;

import java.io.*;
import java.util.Scanner;

public class Example {


    //Неглухой телефон (1%)
    public void example_1() throws IOException {
        String str;


        File inputFile = new File("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\input.txt");
        FileReader fin = new FileReader(inputFile);
        Scanner sc = new Scanner(fin);
        str = sc.nextLine();
        File outputFile = new File("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\output.txt");
        FileWriter countStepFinish = new FileWriter(outputFile);// Запись числа в файл
        countStepFinish.write(str);
        countStepFinish.close();
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

