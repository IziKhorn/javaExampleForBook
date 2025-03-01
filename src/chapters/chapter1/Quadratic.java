package chapters.chapter1;

public class Quadratic {
    private double b;
    private double c;

    public Quadratic(double b, double c){
        this.b = b;
        this.c = c;
    }

    public double disciminant(double b, double c){
        double discr = b*b - 4.0*c;
        return discr;
    }

    public void search(double discr){
        discr = disciminant(b, c);
        if(discr > 0.0){
            double d = Math.sqrt(discr);
            double x = (-b + d)/ 2.0;
            double y = (-b - d)/ 2.0;
            System.out.println("Первый корень: " + x + " Второй корень: " + y);
        }else if (discr == 0.0){
            double x = -b / 2.0;
            System.out.println("Корень: " + x);
        }else {
            System.out.println("Корней нет");
        }

    }
}
