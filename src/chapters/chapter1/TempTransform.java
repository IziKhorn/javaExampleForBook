package chapters.chapter1;

public class TempTransform {
    private double tempC;
    public double tempF;
    public double tempK;
    public TempTransform(double tempC){
        this.tempC = tempC;
        this.tempF = calcTempF();
        this.tempK = calcTempK();
    }

    public double calcTempF(){
        tempF = tempC * (9.0/5.0) + 32.0;
        return tempF;
    }

    public double calcTempC(){
        tempC = (calcTempF() - 32.0) * (5.0/9.0);
        return tempC;
    }

    public double calcTempK(){
        tempK = tempC + 273.0;
        return tempK;
    }

}
