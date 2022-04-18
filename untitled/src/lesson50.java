public class lesson50 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        System.out.println("\nЧисла которые делятся на 3: ");
        for (int i = 1; i<=100; i++) {
            if (i % a == 0) {
                System.out.print(i+", ");

            }
        }
        System.out.println("\n\nЧисла которые делятся на 5: ");
        for (int i = 1; i<=100; i++){
            if (i%b==0){
                System.out.print(i+", ");
            }
        }
        System.out.println("\n\nЧисла которые делятся на 3 и на 5: ");
        for (int i = 1; i<=100; i++){
            if (i%b==0 && i % a == 0){
                System.out.print(i+", ");
            }
        }
    }
}