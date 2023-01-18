import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double rubl = 0;
        int human = 0;
        String tovar = null;
        double stoim = 0;
        String spisokTovar = "Список товаров:\n";
        double stoimSumma = 10;
        Calc calc = new Calc();

        double endHum;
        endHum = vodHuman(human);
        System.out.println("Далее введите наименование и стоимость товара.");
        while (true) {
            System.out.println("Введите наименование товара:");
            tovar = scanner.nextLine();

            if (tovar.equalsIgnoreCase("Завершить")) {
                break;
            } else {

                while (true) {

                    spisokTovar += tovar + "\n";
                    break;
                }
                while (true) {
                    System.out.println("Введите стоимость товара:");

                    if (scanner.hasNextDouble()) {
                        stoim = scanner.nextDouble();
                        if (stoim > 0) {
                            stoimSumma += stoim;
                            System.out.println("Товар успешно добавлен.");
                            break;
                        } else {
                            System.out.println("Ошибка, необходимо вводить правильную цену.");
                            break;
                        }

                    } else {
                        System.out.println("Ошибка, необходимо вводить правильную цену");
                        break;
                    }
                }
                System.out.println("Введите следующий товар или \"Завершить\" для подсчета стоимости товаров.");
                scanner.nextLine();
            }

        }

        String endsum = String.format("%.2f", stoimSumma);

        System.out.println(spisokTovar + "Сумма товаров:\n" + endsum);

        rubl = Math.floor(stoimSumma / endHum);
        calc.getRubl(rubl);


    }

    public static double vodHuman(double human) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("На сколько человек разделить счёт:");
            if (scanner.hasNextInt()) {
                human = scanner.nextInt();
                if (human <= 1) {

                    System.out.println("Значение не корректно, введите количество человек 2 или больше");

                    scanner.nextLine();
                } else {
                    break;
                }
            } else {
                System.out.println("Введите число");
                scanner.nextLine();

            }


        }

        return human;
    }


}
