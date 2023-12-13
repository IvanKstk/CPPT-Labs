package ki304.Kostiuk.Lab4;

/**
* Class <code>CalcException</code> more precises ArithmeticException
* @author Ivan Kostiuk
* @version 1.0
*/
public class CalcException extends ArithmeticException {
    public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}