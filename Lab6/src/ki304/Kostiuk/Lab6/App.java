package ki304.Kostiuk.Lab6;

/**
 * Class <code>App</code> realize example program for Lab 6
 * 
 * @author Ivan Kosiuk
 * @version 1.1
 * @since version 1.0
 */
public class App {
	/**
     * @param args
     * @throws Exception
     */
	public static void main(String[] args) throws Exception {
		PencilCase <? super ClericalObject> myPencilCase = new PencilCase <ClericalObject>();
		myPencilCase.PutObjectInto(new Pen("Blue", 10.0));
		myPencilCase.PutObjectInto(new Pen("Black", 11.5));
		myPencilCase.PutObjectInto(new Ruler("Wood", 20.0));
		
		myPencilCase.findMin();
		
		myPencilCase.displayAllObjects();
		myPencilCase.pushOutObject(0);
		myPencilCase.displayAllObjects();
	}
}