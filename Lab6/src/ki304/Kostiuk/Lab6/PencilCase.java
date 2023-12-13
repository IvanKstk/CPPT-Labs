package ki304.Kostiuk.Lab6;
import java.util.ArrayList;

/**
 * Parameterized class <code>Shelf</code> implements shelf
 * @param <T>
 */
public class PencilCase <T extends ClericalObject> {
	private ArrayList<T> arr;
	
	/**
     * Constructor
     */
	public PencilCase() {
		arr = new ArrayList<T>();
	}
	
	/**
     * Method find object with the smallest volume
     */
	public void findMin() {
	    if (!arr.isEmpty()) {
	        T min = arr.get(0);
	        for (int i = 1; i < arr.size(); i++) {
	            if (arr.get(i).compareTo(min) < 0)
	                min = arr.get(i);
	        }
	        System.out.print("The smallest object is: ");
	        min.printData();
	    }
	    System.out.println();
	}
	
	/**
     * Method put new object into pencil case
     * 
     * @param object value
     */
	public void PutObjectInto(T object) {
		arr.add(object);
		System.out.print("You put : ");
		object.printData();
		System.out.println();
	}
	
	/**
     * Method push out object from shelf
     * 
     * @param index The index of element
     */
	public void pushOutObject(int index) {
	    if (index >= 0 && index < arr.size()) {
	        T pushOutObject = arr.get(index);
	        System.out.print("You pushed out object: ");
	        pushOutObject.printData();
	        arr.remove(index);
	    } else {
	        System.out.println("Invalid index. Cannot push out object.");
	    }
	    System.out.println();
	}
	
	/**
     * Method displays information about all objects in the PencilCase.
     */
	public void displayAllObjects() {
        System.out.println("All objects in the pencil case:");
        for (T object : arr) {
            object.printData();
        }
        System.out.println();
    }
}