package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tester t1 = new Tester();
        Tester t2 = new Tester("Алиса", "Жукова", 8,2654.60);
        Tester t3 = new Tester("Ви", "Крук",6,5,1455.40);
        t1.workTihon("Алиса");
        t2.workTihon();
        t3.workTihon(23);
        t1.earn("Алиса",2654.60);
    }
}
