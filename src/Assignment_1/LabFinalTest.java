package Assignment_1;

public class LabFinalTest {
    public static void main(String[] args) {
        // تجربة المصفوفات (Q1, Q3)
        System.out.println("--- Arrays Test ---");
        int[] arr = {10, 20, 30};
        int[] cloned = ArrayOperations.cloneArray(arr);
        System.out.println("Cloned: " + java.util.Arrays.toString(cloned));

        // تجربة القائمة الأحادية (Q5, Q7, Q9)
        System.out.println("\n--- Singly List Test ---");
        SinglyList sList = new SinglyList();
        sList.add(1); sList.add(2);
        System.out.println("Search for 2: Position " + sList.search(2));

        // تجربة القائمة المزدوجة (Q11)
        System.out.println("\n--- Doubly List (Reverse) ---");
        DoublyList dList = new DoublyList();
        dList.add(100); dList.add(200);
        dList.printReverse();

        // تجربة القائمة الدائرية (Q13, Q15)
        System.out.println("\n--- Circular List Test ---");
        CircularList cList = new CircularList();
        cList.insertAt(50, 0);
        System.out.println("Found 50? " + cList.search(50));
    }
}