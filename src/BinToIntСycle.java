import java.util.Scanner;

public class BinToIntСycle
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Введите число в бинарном формате и нажмите Enter:");
        int n=s.nextInt();

        int decimal=0,p=0;

        while(n!=0)
        {
            decimal+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }

        System.out.printf("Число в десятичном формате:\n%d",decimal);
    }
}