public class lesson55 {
    public static void main(String[] args) {

        int w = 86399;
        int H = w/3600;
        int M = (w%3600)/60;
        int S = (w%3600)%60;

        System.out.println(H+":"+M+":"+S);


    }
}
