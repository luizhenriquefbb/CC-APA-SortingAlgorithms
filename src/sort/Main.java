package sort;
/**
 *
 * @author lhfba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyCollection collection1 = new MyCollection("couting.txt");
        MyCollection collection2 = new MyCollection("couting.txt");
        MyCollection collection3 = new MyCollection("couting.txt");
        MyCollection collection4 = new MyCollection("couting.txt");
        
        System.out.println("Unsorted List");
        System.out.println(collection1);
        
        System.out.println("\nSorted by selectionSort");
        collection1.selectionSort();
        System.out.println(collection1);
        
        System.out.println("\nSorted by insertionSort");
        collection2.insertionSort();
        System.out.println(collection2);
        
        System.out.println("\nSorted by mergeSort");
        collection3.mergeSort();
        System.out.println(collection3);
        
        System.out.println("\nSorted by quickSort");
        collection4.quickSort();
        System.out.println(collection4);
    }
    
}
