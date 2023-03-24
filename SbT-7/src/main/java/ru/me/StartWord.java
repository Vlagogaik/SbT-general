package ru.me;
public class StartWord {
    public static void main(String[] args) {
        try {
            MainBookTXT txt= new MainBookTXT(args[0]);
            txt.Writer(args[1]);
//            MainBookQueue que = new MainBookQueue(args[0]);
//            que.Writer("console");
//            System.out.println(args[0] + " " + args[1]);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
