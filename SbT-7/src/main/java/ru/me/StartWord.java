package ru.me;
public class StartWord {
    public static void main(String[] args) {
        if (args.length < 1) {
            MainWordTXT inwa = new MainWordTXT("Oleg.txt");
            inwa.GetResInPDF("Res.pdf");
            inwa.GetResInConsole();
        }else{
            MainWordTXT inwa = new MainWordTXT(args[0]);
            inwa.GetResInPDF("Res.pdf");
            inwa.GetResInConsole();
        }
        if (args.length < 1) {
            MainWordQueue inwa = new MainWordQueue("Oleg.txt");
            inwa.GetResInPDF("QueueRes.pdf");
            inwa.GetResInConsole();
        }else{
            MainWordQueue inwa = new MainWordQueue(args[0]);
            inwa.GetResInPDF("QueueRes.pdf");
            inwa.GetResInConsole();
        }
    }
}
