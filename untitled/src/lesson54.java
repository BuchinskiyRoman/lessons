import java.util.Scanner;

public class lesson54 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input fearst number: ");
        int fearst = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();
        System.out.print("Input therd number: ");
        int therd = scanner.nextInt();
        System.out.println(res(fearst,second,therd));


    }
    public static boolean res (int a, int b, int c){
        return (a%10==b%10 || a%10==c%10 || b%10==c%10);
    }
}
