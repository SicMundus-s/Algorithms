package LinkedList;

import java.util.LinkedList;

public class Link {

    public long dData; // Данные
    public Link next; // Следующий элемент в списке

    public Link previous;
    // -------------------------------------------------------------
    public Link(long d) // Конструктор
    { dData = d; }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    { System.out.print(dData + " "); }

}
