import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        float avg;
        Scanner l = new Scanner(System.in);

        System.out.println("Введите числа x, y и z через пробел и нажмите Enter:");
        float x = l.nextInt();
        float y = l.nextInt();
        float z = l.nextInt();

        avg = (x+y+z)/3;
        System.out.printf("Average=%.3f\n", avg);

        float avg2 = (x+y+z)/6;

        if (avg2>3)
            System.out.println("Программа выполнена корректно");
    }
}