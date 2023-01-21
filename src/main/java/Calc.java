
public class Calc {

    public static void getRubl(double rubl) {

        int endRub = (int) rubl;


        if ((endRub % 100 / 10) == 1) {
            System.out.println("Каждый человек должен заплатить по " + rubl + " рублей");
            return;
        }

        switch (endRub % 10) {
            case 1:
                System.out.println("Каждый человек должен заплатить по " + rubl + " рублю");
                return;
            case 2:
            case 3:
            case 4:
                System.out.println("Каждый человек должен заплатить по " + rubl + " рубля");
                return;
            default:
                System.out.println("Каждый человек должен заплатить по " + rubl + " рублей");
                return;
        }


    }


}


