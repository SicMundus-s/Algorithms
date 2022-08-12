package LinkedList;

public class Stack {
    private final LinkedList theList;
    //--------------------------------------------------------------
    public Stack() // Конструктор
    {
        theList = new LinkedList();
    }
    //--------------------------------------------------------------
    public void push(long j) // Размещение элемента на вершине стека
    {
        theList.insertFirst(j);
    }
    //--------------------------------------------------------------

    public Link pop() // Извлечение элемента с вершины стека
    {
        return theList.deleteFirst();
    }
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если стек пуст
    {
        return ( theList.isEmpty() );
    }
    //--------------------------------------------------------------
    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
//--------------------------------------------------------------
}
