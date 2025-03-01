package effectiveJava_Example.chapter1_object;

import java.util.regex.Pattern;

public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile("^ (?=.)M* (C[MD] | D?C{0,3})"
            + " (X[CL] | L?X{0,3}) (I[XV] |V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }


    private static Long sum() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        sum();
        System.out.println(sum());
    }

}
