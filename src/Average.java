import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        float avg;
        Scanner l = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        System.out.println("Введите x, y, z:");
        int x = l.nextInt();
        int y = m.nextInt();
        int z = n.nextInt();

        avg = (x+y+z)/3;
        System.out.printf("Average=%.3f\n", avg);

        int avg2 = (x+y+z)/6;

        if (avg2>3)
            System.out.println("Программа выполнена корректно");
    }
}