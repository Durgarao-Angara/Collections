package ArrayList;

import java.util.ArrayList;

public class ArraylistSearchExample {
  public static void main(String args[]) {
    // Creating an ArrayList of generic type
    ArrayList<String> arrList = new ArrayList<String>();
    /*
     * Arraylist is a growable array, so initialize size would be 0 and it
     * will get increases with addition of items in it
     */
    System.out.println("Size of the empty arraylist is :" + arrList.size());
    /*
     * Adding/Apending an element to the end of this list
     */
    arrList.add("First Item");
    /*
     * Inserting the specified element at the specified position in this
     * list.
     */
    arrList.add(1, "Second Item");
    /*
     * Searching for an element in ArrayList Contains method only return
     * true/false so it inform if given object is present in list or not it
     * doesn't provide the exact location of element in list.
     */
    System.out.println("Given object is present in list(true/false) :"
        + arrList.contains("First Item"));
    System.out.println("Given object is present in list(true/false) :"
        + arrList.contains("Third Item"));
    /*
     * Check if given list of object is present in list or not
     */
    ArrayList<String> arrListToSearch = new ArrayList<String>();
    arrListToSearch.add("First Item");
    arrListToSearch.add("Second Item");
    /*
     * Check if given list of Object is present in list or not Returns true
     * if this collection contains all of the elements in the specified
     * collection.
     */
    System.out
        .println("Given collection of object is present in list(true/false) :"
            + arrList.containsAll(arrListToSearch));
    /*
     * Add one more object in list and check if it still give true or not
     */
    arrListToSearch.add("Third Item");
    System.out
        .println("Given collection of object is present in list(true/false) :"
            + arrList.containsAll(arrListToSearch));
  }
}