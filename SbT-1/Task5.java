import java.util.Scanner;
public class Main {
    static double f = 9.8 * 0.17;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
        in.close();
        double m, Pm;
        Pm = (a / 9.8)*f;
        System.out.println(Pm);
    }
}