import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double rubl = 0;
        String tovar = null;
        double stoim = 0;
        String spisokTovar = "Список товаров:\n";
        double stoimSumma = 0;
        int endHum = vodHuman();

        System.out.println("Далее введите наименование и стоимость товара.");
        while (true) {
            System.out.println("Введите наименование товара:");
            tovar = scanner.nextLine();

            if (tovar.equalsIgnoreCase("Завершить")) {
                break;
            } else {
                while (true) {
                    System.out.println("Введите стоимость товара:");
                    if (scanner.hasNextDouble()) {
                        stoim = scanner.nextDouble();
                        if (stoim > 0) {
                            spisokTovar += tovar + "\n";
                            stoimSumma += stoim;
                            System.out.println("Товар успешно добавлен.");
                            break;
                        } else {
                            System.out.println("Ошибка, необходимо вводить правильную цену.");
                        }

                    } else {
                        System.out.println("Ошибка, необходимо вводить правильную цену");

                    }
                    scanner.nextLine();
                }
                System.out.println("Введите следующий товар или \"Завершить\" для подсчета стоимости товаров.");
                scanner.nextLine();
            }

        }

        String endsum = String.format("%.2f", stoimSumma);

        System.out.println(spisokTovar + "Сумма товаров:\n" + endsum);

        rubl = Math.floor(stoimSumma / endHum);
        Calc.getRubl(rubl);


    }

    public static int vodHuman() {
        int human = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
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
