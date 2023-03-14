import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
        in.close();
        int b = (a/100)*100;
        int c = (a/10)*10 - b;
        int d = a - b - c;
        System.out.println(a + " = " + b + " + " + c + " + " + d);
    }
}