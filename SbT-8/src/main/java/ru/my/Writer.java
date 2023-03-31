package ru.my;
//Класс для вывода того что там анализатор на анализировал
public class Writer implements OutPut{
    InPut ip;
    Analyzer an;

//    Shell sh = new Shell();

    @Override
    public void report(String s) {
        Shell sh = new Shell();
        System.out.println(s);
        System.out.print(sh.newDir.getAbsolutePath() + " > ");
    }
}
