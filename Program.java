public class Program
{
    public static void main(String[] args)
    {
        DoublyLinkedList lst1 = new DoublyLinkedList();
        lst1.addFirst(new Node(6));
        lst1.addFirst(new Node(3));
        lst1.addFirst(new Node(2));
        lst1.addFirst(new Node(9));
        lst1.addFirst(new Node(1));
        lst1.addFirst(new Node(7));
        lst1.addFirst(new Node(5));
        lst1.addFirst(new Node(10));
        lst1.addFirst(new Node(4));
        lst1.addFirst(new Node(8));
        System.out.print("\nИзначальный двусвязный список: ");
        lst1.print_DLL();
        System.out.print("\nПовёрнутый двусвязный список: ");
        lst1.reverse();
        lst1.print_DLL();
        System.out.print("\nОтсортированный двусвязный список: ");
        lst1.bubbleSort();
        lst1.print_DLL();
    }
}