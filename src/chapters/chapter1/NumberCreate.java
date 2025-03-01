package chapters.chapter1;

import java.util.Arrays;
import java.util.List;

public class NumberCreate {

    public void harmonicNumber(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }


    public void sqrt(double c) {
        double EPSILON = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > EPSILON * t) {
            t = ((c / t) + t) / 2.0;

        }
        System.out.println(t);
    }


    public void binaryTranslate(int n) {
        int power = 1;

        while (power <= n / 2)
            power = 2 * power;

        while (power > 0) {

            if (n < power) {
                System.out.println(0);

            } else {
                System.out.println(1);
                n -= power;
            }
            power /= 2;
            System.out.println();

        }

    }


}
