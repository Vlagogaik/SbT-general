import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 2 < n < 100: ");
        int n = in.nextInt();
        int[] a = new int[n];
        in.close();
        a[0] = 0;
        a[1] = 1;
        for(int i = 2; i < n; i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

    }
}