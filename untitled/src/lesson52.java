import java.util.Scanner;

public class lesson52 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input fearst number: ");
        int fearst = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();
        System.out.print("Input therd number: ");
        int therd = scanner.nextInt();

        int q = fearst+second;
        System.out.println(q==therd);
    }
}
