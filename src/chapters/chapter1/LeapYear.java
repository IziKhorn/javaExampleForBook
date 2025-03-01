package chapters.chapter1;

public class LeapYear {
    private int year;
    private boolean leapYear;
    public LeapYear(int year, boolean leapYear){
        this.year = year;
        this.leapYear = leapYear;
    }

    public void isLeapYear(int year){
        leapYear = (year %4 ==0);
        leapYear = leapYear && (year % 100 != 0);
        leapYear = leapYear || (year % 400 == 0);
        System.out.println("Год Высокосный: " + leapYear);
    }


}
