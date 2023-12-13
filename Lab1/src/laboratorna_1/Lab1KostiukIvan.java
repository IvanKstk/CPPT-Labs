package laboratorna_1;

import java.io.*;
import java.util.*;

/**
 * Клас Lab1KostiukIvan реалізує приклад програми до лабораторної роботи 1.
 * В цьому класі реалізовано створення квадратної матриці та її заповнення
 * заданим символом-заповнювачем.
 *
 * @author Kostiuk Ivan
 * @version 1.0
 * @since 2023-09-28
 */
public class Lab1KostiukIvan {
    /**
     * Статичний метод main є точкою входу в програму.
     *
     * @param args Масив аргументів командного рядка.
     * @throws FileNotFoundException Виключення, якщо файл не знайдено.
     */
    public static void main(String[] args) throws FileNotFoundException {
    	// Розмір квадратної матриці
    	int nRows;   
    	// Квадратна матриця
        char[][] arr;     
     // Символ-заповнювач
        String filler;       
        Scanner in = new Scanner(System.in);
        File dataFile = new File("Lab1.txt");

        // Введення розміру матриці
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][];

        // Введення символу-заповнювача
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        in.close();
        PrintWriter fout = new PrintWriter(dataFile);

        // Заповнення матриці та виведення на екран та запис в файл
        for (int i = 0; i < nRows; i++) {
        	// Створення рядка в зубчастому масиві
        	arr[i] = new char[nRows]; 
            for (int j = 0; j < nRows; j++) {
                if (filler.length() == 1) {
                    if (i + j >= nRows - 1) {
                        arr[i][j] = (char) filler.codePointAt(0);
                    } else {
                        arr[i][j] = ' ';
                    }
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    fout.close();
                    System.exit(1);
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    fout.close();
                    System.exit(1);
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}