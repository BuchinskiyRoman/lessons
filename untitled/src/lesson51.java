import java.util.Scanner;

public class lesson51 {
    public static void main(String[] args) {

        /* программа преобразует числов виде строки в целочисленное число

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (строку): ");
        String nam = scanner.next();
        int number = Integer.parseInt(nam);
        double numderD = Double.parseDouble(nam);
        System.out.print("\nЦелочисленное значение: "+number);
        System.out.println("\n\nДробное число: "+ numderD);
    }
}
