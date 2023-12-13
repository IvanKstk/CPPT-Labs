package ki304.Kostiuk.Lab6;
/**
 * Class <code>Ruler</code> implements ClericalObject
 */
public class Ruler implements ClericalObject {
	private String material;
	private double length;
	
	/**
     * Constructor
     * 
     * @param material  Material
     * @param length Length
     */
	public Ruler(String material, double length) {
		this.material = material;
		this.length = length;
	}
	
	/**
     * Method set material of object
     * 
     * @param material Material
     */
	public void setMeterial(String material) {
		this.material = material;
	}
	
	/**
     * @return String with material
     */
	public String getMeterial() {
		return material;
	}

	/**
     * Method set length of object
     * 
     * @param length Length
     */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
     * @return double object length
     */
	public double getLength() {
		return length;
	}
	
	/**
     * Method compare objects
     * 
     * @param obj ClericalObject
     */
	public int compareTo (ClericalObject obj) {
		Double l = getLength();
		return l.compareTo(obj.getLength());
	}
	/**
     * Method print object data
     */
	public void printData() {
	    System.out.print("Object: Ruler, Material: " + getMeterial() + ", Length: " + getLength() + ";\n");
	}
}