package ki304.Kostiuk.Lab6;
/**
 * Interface <code>ClericalObject</code> implements object and extends Comparable
 */
public interface ClericalObject extends Comparable<ClericalObject> {
    double getLength();
    void printData();
}