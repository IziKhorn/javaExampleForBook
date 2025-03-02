package example_1000;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

        String a_Str = in.nextLine();
        String b_Str = in.nextLine();
        in.close();
        File inputFile = new File("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\A+B.txt");
        FileWriter writer = new FileWriter(inputFile);
        writer.write(a_Str);
        writer.write(b_Str);
        writer.close();

        FileReader fin = new FileReader(inputFile);
        Scanner reader = new Scanner(fin);
        String str = reader.nextLine();
        char[] strs = str.toCharArray();

        System.out.println(strs.length);

        int n = strs.length;
        List<String> bufferString = new ArrayList<String>();

        if (n == 2) {
            bufferString.add(String.valueOf(strs[0]));
            bufferString.add(String.valueOf(strs[1]));
        } else if (n == 4) {
            bufferString.add(new StringBuffer().append(strs[0]).append(strs[1]).toString());
            bufferString.add(new StringBuffer().append(strs[2]).append(strs[3]).toString());
        }


        String a_str = bufferString.get(0);
        String b_str = bufferString.get(1);
        int a = Integer.parseInt(a_str);
        int b = Integer.parseInt(b_str);
        System.out.println(a);
        System.out.println(b);
        FileWriter sums = new FileWriter("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\summ.txt");
        int sum = a + b;
        String summ = String.valueOf(sum);

        System.out.println(sum);
        sums.write(summ);
        sums.close();


    }


    // Белочка собрала в лесу N шишек c орешками. Белочка очень привередливо выбирала шишки,
    // и брала только те, в которых ровно M орешков. Также известно, что для пропитания зимой ей необходимо не менее K орешков.
    // Определите, хватит ли на зиму орешков белочке.
    public static void example_6() throws IOException {
        String nStr, mStr, kStr;
        Scanner in = new Scanner(System.in);
        nStr = in.nextLine();
        mStr = in.nextLine();
        kStr = in.nextLine();
        in.close();
        FileWriter writer = new FileWriter("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\example3_input.txt");

        String inputString = nStr + mStr + kStr;
        writer.write(inputString);
        writer.close();

        FileReader reader = new FileReader("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\example3_input.txt");
        Scanner sc = new Scanner(reader);
        String str = sc.nextLine();
        sc.close();
        List<String> bufferString = new ArrayList<>();

        char[] values = str.toCharArray();
        int n = values.length;
        switch (n) {
            case (4):
                bufferString.add(new StringBuffer().append(values[2]).append(values[3]).toString());

            case (3):
                bufferString.add(new StringBuffer().append(values[2]).toString());
        }

        int n_int = Integer.parseInt(String.valueOf(values[0]));
        int m_int = Integer.parseInt(String.valueOf(values[1]));
        int k_int = Integer.parseInt(bufferString.get(0).toString());

        FileWriter fileWriter = new FileWriter("G:\\projects\\javaExample\\javaExampleForBook\\src\\example_1000\\example_3_output.txt");

        if (k_int > n_int * m_int) {
            fileWriter.write("NO");
            fileWriter.close();
        } else {
            fileWriter.write("YES");
            fileWriter.close();
        }
    }

}

