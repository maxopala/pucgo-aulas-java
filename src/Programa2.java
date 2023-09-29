import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
                Data a = new Data(29, 2, 2024);
        Data b = new Data(29, 2, 2025);
        Data c = new Data(18, 13, 2000);
        Data d = new Data(31, 7, 1945);

        print(a);
        print(b);
        print(c);
        print(d);

    }

    static void  print(Data a) {
        System.out.println("Dia: " + a.getDia());
        System.out.println("Mes: " + a.getMes());
        System.out.println("Ano: " + a.getAno());
        System.out.println("Data: " + a.getDataFormatada());
        System.out.println("----------------------------------");
    }
}
