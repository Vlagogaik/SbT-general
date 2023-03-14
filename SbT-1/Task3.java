import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
        in.close();
        int b = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
        if(a == b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}