import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
       int s  =699345;
       int sec =s % 60;
       int m = (s-sec)/60;
       int min = m %60;
       int h = (m-min)/60;
       int hours = h%24;
       int d = (h-hours)/24;
       int day = d%7;
       int n = (d-day)/7;



        System.out.println(n + "недель" + day + "дней"+hours+ "часов"+ min+ "минут"+ sec + "секунда");



       System.out.println(n + "недель" + day + "дней"+hours+ "часов"+ min+ "минут"+ sec + "секунд");

    }
}