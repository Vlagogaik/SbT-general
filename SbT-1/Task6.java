import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
        in.close();
        if(a < 2){
            System.out.println("False");
            System.exit(1);
        }
        double s = Math. sqrt(a);
        for (int i = 2; i <= s; i++){
            if(a%i == 0){
                System.out.println("False");
                break;
            }
        }
        System.out.println("True");
    }
}