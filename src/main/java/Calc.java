import java.util.Scanner;

public class Calc {

    public static void getRubl(double rubl) {

        if (rubl == 1 || rubl == 21 || rubl == 31 || rubl == 41 || rubl == 51 || rubl == 61) {
            System.out.println("Каждый человек должен заплатить по " + rubl + " рублю.");
        } else if (rubl >= 2 && rubl <= 4 || rubl >= 22 && rubl <= 24 || rubl >= 32 && rubl <= 34) {
            System.out.println("Каждый человек должен заплатить по " + rubl + " рубля.");
        } else {
            System.out.println("Каждый человек должен заплатить по " + rubl + " рублей.");
        }


    }


}