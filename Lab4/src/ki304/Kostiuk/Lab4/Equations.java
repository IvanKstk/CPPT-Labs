package ki304.Kostiuk.Lab4;
/**
* Class <code>Equations</code> implements method for y=tg(x)/ctg(x) expression
* calculation
* @author Ivan Kostiuk
* @version 1.0
*/

public class Equations {
	/**
     * Method calculates the y=tg(x)/ctg(x) expression
     * 
     * @param x Angle in degrees
     * @throws CalcException
     */
	public double calculate(int x) throws CalcException {
		double y = 0.0, rad;
		rad = x * Math.PI /180;
		try 
		{
			y = Math.tan(rad)/(1.0/Math.tan(rad));
			if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x == 0
                    || x == 90 || x==-90 || x == 180)
                throw new ArithmeticException();
		}
		catch (ArithmeticException ex)
		{
			if(rad == Math.PI/2 || rad == -Math.PI/2 || rad == 0 || rad == Math.PI) {
				throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
			}
			else {
				throw new CalcException("Unknown reason of the exception during exception calculation");
			}
		}
		return y;
	}
}