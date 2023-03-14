import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
        in.close();
        char a1 = 'I';
        char a2 = 'V';
        char a3 = 'X';
        char a4 = 'L';
        char a5 = 'C';
        String Res = new String();
        if(a > 100){
            System.out.println("not a > 100");
        }else{
            if(a == 100){
                System.out.println(a5);
            }else if(a > 9) {
                int b = (a / 10);
                int c = a - b*10;
                if (b == 9){
                    Res = Res + a3 + a5;
                }else if (b == 8){
                    Res = Res + a4 + a3 + a3 + a3;
                }else if (b == 7){
                    Res = Res + a4 + a3 + a3;
                }else if (b == 6){
                    Res = Res + a4 + a3;
                }else if (b == 5){
                    Res = Res + a4;
                }else if(b == 4){
                    Res = Res + a3 +a4;
                }else if(b < 4){
                    for(int i = 0; i < b; i++){
                        Res = Res + a3;
                    }
                }
                if(c == 9){
                    Res = Res + a1 + a3;
                }else if ((c < 9) && (c > 4)){
                    Res = Res + a2;
                    for(int i = 0; i < c-5; i++){
                        Res = Res + a1;
                    }
                }else if(c == 5){
                    Res = Res + a2;
                }else if(c == 4){
                    Res = Res + a1 + a2;
                }else if(c < 4){
                    for(int i = 0; i < c; i++){
                        Res = Res + a1;
                    }
                }
            }else{
                int c = a;
                if(c == 9){
                    Res = Res + a1 + a3;
                }else if ((c < 9) && (c > 4)){
                    Res = Res + a2;
                    for(int i = 0; i < c-5; i++){
                        Res = Res + a1;
                    }
                }else if(c == 5){
                    Res = Res + a2;
                }else if(c == 4){
                    Res = Res + a1 + a2;
                }else if(c < 4){
                    for(int i = 0; i < c; i++){
                        Res = Res + a1;
                    }
                }
            }
        }
        System.out.println(Res);
    }
}