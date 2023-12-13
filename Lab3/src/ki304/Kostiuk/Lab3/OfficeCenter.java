 package ki304.Kostiuk.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import ki304.Kostiuk.Lab3.Communications.WaterType;
import ki304.Kostiuk.Lab3.Garage.GarageType;

public class OfficeCenter extends House implements OfficeCenterOperations{
	private int numberOfOffices;
    private String name;
    private PrintWriter file;
	
    /**
     * Конструктор за замовчуванням для класу OfficeCenter. Ініціалізує об'єкти розмірів, комунікацій та гаражу.
     * Інші параметри (кількість офісів та назва) залишаються непроініціалізованими.
     *
     * @throws FileNotFoundException Якщо не вдається створити файл для журналу.
     */
    public OfficeCenter() throws FileNotFoundException {
        super(); // Виклик конструктора базового класу House без параметрів
        numberOfOffices = 0;
        name = "AAA"; 
        file = new PrintWriter(new File("File.txt"));
    }
    
    /**
     * Конструктор, який дозволяє вказати розміри будинку, стан газу, води, електрики та гаражу.
     * Ініціалізує об'єкт розмірів, комунікацій та гаражу. Також ініціалізує файл для журналу.
     *
     * @param area площа будинку.
     * @param floors кількість поверхів в будинку.
     * @param rooms кількість кімнат в будинку.
     * @param gas стан газу в будинку (true - увімкнено, false - вимкнено).
     * @param water стан води в будинку (HOT або COLD).
     * @param electricity стан електрики в будинку (true - увімкнено, false - вимкнено).
     * @param isOpened стан гаражу (OPEN або CLOSED).
     * @param carsInTheGarage кількість припаркованих автомобілів в гаражі.
     * @param carCapacity максимальна кількість автомобілів, що можуть бути припарковані в гаражі.
     * @param numberOfOffices кількість офісів в офісному центрі.
     * @param name назва офісного центру.
     * @throws FileNotFoundException якщо не вдається створити файл для журналу.
     */
    public OfficeCenter(double area, int floors, int rooms, boolean gas, WaterType water, boolean electricity, GarageType isOpened, int carsInTheGarage, int carCapacity, int numberOfOffices, String name) throws FileNotFoundException {
        super(area, floors, rooms, gas, water, electricity, isOpened, carsInTheGarage, carCapacity);
        this.numberOfOffices = numberOfOffices;
        this.name = name;
        file = new PrintWriter(new File("File.txt"));
    }
    
    /**
     * Конструктор, який дозволяє вказати розміри будинку, кількість офісів та назву офісного центру.
     * Ініціалізує об'єкт розмірів та створює файл для журналу.
     *
     * @param area площа будинку.
     * @param floors кількість поверхів в будинку.
     * @param rooms кількість кімнат в будинку.
     * @param numberOfOffices кількість офісів в офісному центрі.
     * @param name назва офісного центру.
     * @throws FileNotFoundException якщо не вдається створити файл для журналу.
     */
	public OfficeCenter(double area, int floors, int rooms, int numberOfOffices, String name) throws FileNotFoundException {
	    super(area, floors, rooms); // Виклик конструктора базового класу House з параметрами розмірів будинку
	    this.numberOfOffices = numberOfOffices;
	    this.name = name;
	    file = new PrintWriter(new File("File.txt"));
	}
	
	/**
	 * Конструктор, який дозволяє вказати стан газу, води, електрики, кількість офісів та назву офісного центру.
	 * Ініціалізує об'єкт комунікацій та створює файл для журналу.
	 *
	 * @param gas стан газу в будинку (true - увімкнено, false - вимкнено).
	 * @param water стан води в будинку (HOT або COLD).
	 * @param electricity стан електрики в будинку (true - увімкнено, false - вимкнено).
	 * @param numberOfOffices кількість офісів в офісному центрі.
	 * @param name назва офісного центру.
	 * @throws FileNotFoundException якщо не вдається створити файл для журналу.
	 */
	public OfficeCenter(boolean gas, WaterType water, boolean electricity, int numberOfOffices, String name) throws FileNotFoundException {
	    super(gas, water, electricity); // Виклик конструктора базового класу House з параметрами комунікацій
	    this.numberOfOffices = numberOfOffices;
	    this.name = name;
	    file = new PrintWriter(new File("File.txt"));
	}
	
	/**
	 * Конструктор, який дозволяє вказати стан гаражу, кількість офісів та назву офісного центру.
	 * Ініціалізує об'єкт гаражу та створює файл для журналу.
	 *
	 * @param isOpened стан гаражу (OPEN або CLOSED).
	 * @param carsInTheGarage кількість припаркованих автомобілів в гаражі.
	 * @param carCapacity максимальна кількість автомобілів, що можуть бути припарковані в гаражі.
	 * @param numberOfOffices кількість офісів в офісному центрі.
	 * @param name назва офісного центру.
	 * @throws FileNotFoundException якщо не вдається створити файл для журналу.
	 */
	public OfficeCenter(GarageType isOpened, int carsInTheGarage, int carCapacity, int numberOfOffices, String name) throws FileNotFoundException {
	    super(isOpened, carsInTheGarage, carCapacity); // Виклик конструктора базового класу House з параметрами гаражу
	    this.numberOfOffices = numberOfOffices;
	    this.name = name;
	    file = new PrintWriter(new File("File.txt"));
	}
	
	/**
	 * Встановлює нове значення кількості офісів у офісному центрі.
	 *
	 * @param numberOfOffices нове значення кількості офісів.
	 */
	public void setNumberOfOffices(int numberOfOffices) {
		this.numberOfOffices = numberOfOffices;
	}
	
	/**
	 * Отримує поточне значення кількості офісів в офісному центрі.
	 *
	 * @return Кількість офісів в офісному центрі.
	 */
	public int getNumberOfOffices() {
		return numberOfOffices;
	}
	
	/**
	 * Встановлює нову назву офісного центру.
	 *
	 * @param name Нова назва офісного центру.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Отримує поточну назву офісного центру.
	 *
	 * @return Назва офісного центру.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Розраховує та виводить загальну площу офісного центру в файл журналу.
	 */
	public void calculateTotalOfficeArea() {
	    // Розрахунок загальної площі офісного центру
		file.println("Загальна площа офісного центру : " + getDimensions().getArea() * getNumberOfOffices());
		file.println();
		file.flush();
	}

	/**
	 * Додає новий офіс до офісного центру та оновлює кількість офісів.
	 */
	public void addOffice() {
	    setNumberOfOffices(getNumberOfOffices() + 1);
	    file.println("Додано новий офіс. Нова к-сть офісів : " + getNumberOfOffices());
	    file.println();
	    file.flush();
	}

	/**
	 * Видаляє один офіс з офісного центру та оновлює кількість офісів.
	 */
	public void removeOffice() {
        if (getNumberOfOffices() > 0) {
            setNumberOfOffices(getNumberOfOffices() - 1);
        }
        file.println("Віднято один офіс. Нова к-сть офісів : " + getNumberOfOffices());
		file.println();
		file.flush();
    }	
	
	/**
	 * Змінює назву офіс центру
	 * @param name назва офіс центру
	 */
	public void changeName(String name) {
		this.name = name;
		file.println("Нова назва офіс центру : " + name);
		file.println();
		file.flush();
	}
	
	/**
	 * Отримати інформацію про офіс центр
	 */
	public void getOfficeCenterData() {
		file.println("Назва офіс центру : " + name);
		file.println("К-сть офісів : " + getNumberOfOffices());
		file.println();
		file.flush();
	}
}