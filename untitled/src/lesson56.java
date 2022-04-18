import java.util.Scanner;

public class lesson56 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input fearst number: ");
        int fearst = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();
        System.out.print("Input therd number: ");
        int therd = scanner.nextInt();

        for (int i=fearst; i<=second; i++){
            if (i%therd==0){
                System.out.print(i+", ");
            }
        }
    }
}
