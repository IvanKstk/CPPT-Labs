package ki304.Kostiuk.Lab6;
/**
 * Class <code>Ruler</code> implements ClericalObject
 */
public class Pen implements ClericalObject {

private String color;
private double length;

/**
 * Constructor
 * 
 * @param color  Color
 * @param length Length
 */
public Pen(String color, double length) {
	this.color = color;
	this.length = length;
}

/**
 * Method set color of object
 * 
 * @param color Color
 */
public void setColor(String color) {
	this.color = color;
}

/**
 * @return String with color
 */
public String getColor() {
	return color;
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
    System.out.print("Object: Pen, Color: " + getColor() + ", Length: " + getLength() + ";\n");
}

}