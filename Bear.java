package com.company;

import java.util.Scanner;

public class Bear
{
    String name;
    double weight;
    double high;
    int number;
    public Bear () { };
    public void Set (String _name, double _weight, double _high)
    {
        Bear bear = new Bear();
        bear.name = _name;
        bear.weight = _weight;
        bear.high = _high;
        bear.number = 8;
    }
    public void Get ()
    {
        String _name;
        double _weight;
        double _high;
        Scanner in = new Scanner(System.in);
        System.out.println("Имя медведя: ");
        _name = in.nextLine();
        do
        {
            System.out.println("Вес медведя в кг: ");
            _weight = in.nextDouble();
        } while (_weight < 1);
        do
        {
            System.out.println("Рост медведя в см: ");
            _high = in.nextDouble();
        } while (_high < 10);
        name = _name;
        weight = _weight;
        high = _high;
        number = 8;
    }
    public void Print ()
    {
        System.out.printf("Имя медведя: %s. Вес медведя: %l. Рост медведя: %l. Номер вольера: %d\n", name, weight, high, number);
    }
}
