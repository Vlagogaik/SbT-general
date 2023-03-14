import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char Res = 'Z';
        Scanner in = new Scanner(System.in);
        String n = in.next();
        char a = n.charAt(n.length()-1);
        do {
            if (a == Res) {
                System.out.println("Right");
                break;
            } else if (a < Res) {
                System.out.println("You’re too low");
                n = in.next();
                a = n.charAt(n.length()-1);
            } else if (a > Res) {
                System.out.println("You’re too high");
                n = in.next();
                a = n.charAt(n.length()-1);
            }
        }while(true);
    }
}