package chapters.chapter1;

public class MathTutorial {
    private double rad;

    public MathTutorial(double rad){
        this.rad = rad;
    }


    public double trig(double rad){
        return Math.pow(Math.sin(rad), 2.0) + Math.pow(Math.cos(rad), 2.0);
    }

}
