package example_1000;

import java.io.*;
import java.util.Scanner;

public class Example {


    //Неглухой телефон (1%)
    public void example_1() throws IOException {
        String str;




        Scanner in = new Scanner(System.in);
        String inputData = in.nextLine();
        in.close();
        File inputFile = new File("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\input.txt");

        FileWriter inputWritter = new FileWriter(inputFile);
        inputWritter.write(inputData);
        inputWritter.close();

        FileReader fin = new FileReader(inputFile);
        Scanner sc = new Scanner(fin);
        str = sc.nextLine();
        File outputFile = new File("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\output.txt");
        FileWriter countStepFinish = new FileWriter(outputFile);// Запись числа в файл
        countStepFinish.write(str);
        countStepFinish.close();
    }



//    Требуется сложить два целых числа А и В.

    public static void example_2() throws IOException {

        Scanner in = new Scanner(System.in);

        String a_Str =  in.nextLine();
        String b_Str =  in.nextLine();
        in.close();
        File inputFile = new File("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\A+B.txt");
        FileWriter writer = new FileWriter(inputFile);
        writer.write(a_Str);
        writer.write(b_Str);
        writer.close();

        FileReader fin = new FileReader(inputFile);
        Scanner reader = new Scanner(fin);
        String str = reader.nextLine();
        String[] values = str.split("");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        FileWriter sums = new FileWriter("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\summ.txt");
        int sum = a+b;
        String summ = String.valueOf(sum);

        sums.write(summ);
        sums.close();















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

