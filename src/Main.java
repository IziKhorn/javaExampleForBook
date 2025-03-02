import effectiveJava_Example.chapter1_object.*;
import example_1000.Example;

import java.io.IOException;

import static effectiveJava_Example.chapter1_object.NyPizza.Size.SMALL;
import static effectiveJava_Example.chapter1_object.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) throws IOException {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        Example example = new Example();
        example.example_6();
//        char[] arr = "1234567891".toCharArray();
//        for (char c : arr) {
//            System.out.println(Character.getNumericValue(c));
//        }


    }


}