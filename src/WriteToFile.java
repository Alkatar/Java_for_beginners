import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        String s;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст. Для окончания ввода введите строку 'stop'\n");
        try (FileWriter fw = new FileWriter("D:\\File.txt"))
        {
            do  {
                System.out.println(": ");
                s = br.readLine();

                if (s.compareTo("stop")==0) break;
                s=s+"\r\n";
                fw.write(s);
            } while (s.compareTo("stop")!=0);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода вывода:"+exc);
        }
    }
}
