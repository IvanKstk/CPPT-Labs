package ki304.Kostiuk.Lab4;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * 
 * @author Ivan Kostiuk
 * @version 1.0
 */
public class EquationsApp {
	/**
     * @param args
     * @throws Exception
     */
   public static void main(String[] args) throws Exception {
   FileInputOutput fio = new FileInputOutput();
    try {
       Equations eq = new Equations();
       out.print("Enter X :");
       Scanner in = new Scanner(System.in);
       int x = in.nextInt();
       in.close();
       double result = eq.calculate(x);
       out.println("Y : " + result); // result in console  
       fio.writeResTxt(result);
       fio.writeResBin(result);
       System.out.println("Вивід результату з файлу .txt : " + fio.readResTxt());
       System.out.println("Вивід результату з файлу .bin : " + fio.readResBin());
        }
    catch(CalcException ex)
    	{
    		// Блок перехоплює помилки обчислень виразу
    		out.print(ex.getMessage());
    	}
    }
}