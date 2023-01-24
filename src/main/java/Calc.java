public class Calc {

    public static void getRubl(double rubl) {

        int endRub = (int) Math.floor(rubl);
        String endPlat = String.format("%.2f", rubl);


        if ((endRub % 100 / 10) == 1) {
            System.out.println("Каждый человек должен заплатить по " + endPlat + " рублей");
            return;
        }

        switch (endRub % 10) {
            case 1:
                System.out.println("Каждый человек должен заплатить по " + endPlat + " рублю");
                return;
            case 2:
            case 3:
            case 4:
                System.out.println("Каждый человек должен заплатить по " + endPlat + " рубля");
                return;
            default:
                System.out.println("Каждый человек должен заплатить по " + endPlat + " рублей");
                return;
        }


    }


}


