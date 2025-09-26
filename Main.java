package Com.Kavita.SingleLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
//        DLL list = new DLL();
//
//        list.insertFirst(110);
//        list.insertFirst(60);
//        list.insertFirst(50);
//        list.insertFirst(12);
//
//        list.insertLast(30);
//        list.insertAtIndex(25, 2);
//        list.display();

            Circular list = new Circular();

            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);

            list.display();  // 10 -> 20 -> 30 -> 40 -> HEAD

            list.delete(20);
            list.display();  // 10 -> 30 -> 40 -> HEAD

            list.delete(10);
            list.display();  // 30 -> 40 -> HEAD
        }
        // 20 -> 10 -> 25 -> 30 -> END

//        System.out.println("Removed: " + list.removeFirst()); // removes 20
//        list.display();  // 10 -> 25 -> 30 -> END
//
//        System.out.println("Removed: " + list.removeLast()); // removes 30
//        list.display();  // 10 -> 25 -> END
//
//        System.out.println("Removed: " + list.removeAtIndex(1)); // removes 25
//        list.display();  // 10 -> END
}
