import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);


        System.out.println("Введите количество рублей: ");
        double r = a.nextDouble();
        System.out.println("Введите курс обмена (стоимость 1 доллара США в рублях): ");
        double c = a.nextDouble();
        double result = convertRubToUsd(r, c);
        System.out.println(r+" рублей = " + (double)Math.round(result * 100d) / 100d + " долларов США");

    }

    public static double convertRubToUsd(double rub, double course) {
        return rub/course;
    }
}
