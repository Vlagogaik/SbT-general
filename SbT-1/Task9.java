import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("ax2 + bx + c = 0");
        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        Double c = in.nextDouble();
        double x, x1;
        in.close();
        if((Math.pow(b, 2)-4*a*c) < 0){
            System.out.println("Корней нет");
        }else if((Math.pow(b, 2)-4*a*c) == 0){
            x = -b/(2*a);
            System.out.println("x = " + x);
        }else{
            x = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            x1 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            System.out.println("x1 = " + x + " x2 = " + x1);
        }
    }
}