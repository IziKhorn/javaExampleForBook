import chapters.chapter1.*;
import effectiveJava_Example.chapter1_object.*;

import java.util.Scanner;

import static effectiveJava_Example.chapter1_object.NyPizza.Size.SMALL;
import static effectiveJava_Example.chapter1_object.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();


    }


}