import java.util.Scanner;

public class lesson49 {
    public static void main(String[] args) {

        /* необходимо ввести число и программа определяет чётное оно или нет, если четное то выдаёт 1 если не чётное то 0.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input namber: ");
        int namber = scanner.nextInt();

        if (namber%2!=0){
            System.out.println("0");
        }else {
            System.out.println("1");
        }
    }
}
