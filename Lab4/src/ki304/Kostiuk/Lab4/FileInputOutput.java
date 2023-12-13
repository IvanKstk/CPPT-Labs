package ki304.Kostiuk.Lab4;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 * Class <code>FileInputOutput</code> work with .txt and .bin files
 * 
 * @author Ivan Kostiuk
 * @version 1.0
 */
public class FileInputOutput {
	/**
     * Значення за замовчуванням для назви файлу.
     */
	private String fileName;

	/**
     * Конструктор за замовчуванням, який встановлює назву файлу "Lab5".
     */
	public FileInputOutput() {
	fileName = "Lab5";
	}

	/**
     * Конструктор, який дозволяє встановити назву файлу при створенні об'єкту.
     *
     * @param fileName Назва файлу для роботи.
     */
	public FileInputOutput(String fileName) {
	this.fileName = fileName;
	}

	 /**
     * Запис результату у текстовий файл.
     *
     * @param result Результат для запису.
     * @throws FileNotFoundException Якщо файл не знайдено.
     */
	public void writeResTxt(double result)throws FileNotFoundException {
	PrintWriter file = new PrintWriter(new File(fileName + ".txt"));
	file.print(result);
	file.close();
	}

	 /**
     * Зчитування результату з текстового файлу.
     *
     * @return Рядок, що містить результат.
     */
	public String readResTxt(){
	String fileName = this.fileName + ".txt";
	String result;
	try{
		File file = new File(fileName);
		if(file.exists()) {
			Scanner scanner = new Scanner(file);
            result = scanner.next();
            scanner.close();
		}
		else {
			throw new FileNotFoundException("File " + fileName + "not found");
		}
	}
	catch(FileNotFoundException ex){
		result = ex.getMessage();
	}
	return result;
	}

	 /**
     * Запис результату у бінарний файл.
     *
     * @param result Результат для запису.
     * @throws FileNotFoundException Якщо файл не знайдено.
     * @throws IOException Якщо сталася помилка вводу/виводу під час роботи з файлом.
     */
	public void writeResBin(double result) throws FileNotFoundException, IOException  {
	DataOutputStream file = new DataOutputStream(new FileOutputStream(fileName + ".bin"));
	file.writeDouble(result);
	file.close();
	}

	/**
     * Зчитування результату з бінарного файлу.
     *
     * @return Значення типу double, що містить результат.
     * @throws FileNotFoundException Якщо файл не знайдено.
     * @throws IOException Якщо сталася помилка вводу/виводу під час роботи з файлом.
     */
	public double readResBin() throws FileNotFoundException, IOException {
	DataInputStream file = new DataInputStream(new FileInputStream(fileName + ".bin"));
	double result; 
	result = file.readDouble();
	file.close();
	return result;
	}
}