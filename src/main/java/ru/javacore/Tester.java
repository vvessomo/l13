package ru.javacore;

public class Tester
{
    String name;
    String surname;
    int expirianceInYears;
    int englishlvl;
    double salary;

    public Tester()
    {
        name = "Алиса";
        surname = "Тихомиров";
        expirianceInYears = 2;
        englishlvl = 2;
        salary = 300;
    }

    public Tester(String name)
    {
        this.name = name;
    }

    public Tester(String name, String surname, int expirianceInYears, double salary)
    {
        this(name);
        this.surname = surname;
        this.expirianceInYears = expirianceInYears;
        this.salary = salary;
    }


    public Tester(String name, String surname, int expirianceInYears, int englishlvl, double salary)
    {
        this(name, surname, expirianceInYears, salary);
        this.englishlvl = englishlvl;
    }

    public void workTihon(String name)
    {
        System.out.println("Имя рабочего: " + name);
    }

    public void workTihon()
    {
        System.out.println(name + " " + surname + " с опытом работы: " + expirianceInYears + " получает: " + salary + " руб.");
    }

    public void workTihon(double yearsalary)
    {
        yearsalary = salary * 12;
        System.out.println(name + " " + surname + " с опытом " + expirianceInYears + " и уровнем английского " + englishlvl
                + " получает в месяц: " + salary + " руб., а в год: " + yearsalary + " руб.");
    }
    public static void earn(String name, double salary)
    {
        System.out.println(name + " зарабатывает в месяц: " + salary + " руб.");
    }
}
