package ki304.kostiuk.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import ki304.kostiuk.Lab2.Communications.WaterType;
import ki304.kostiuk.Lab2.Garage.GarageType;

public class House {
	private Dimensions dimensions;
    private Communications communications;
    private Garage garage;
    private PrintWriter file;
    
    /**
     * Конструктор за замовчуванням. Створює об'єкт будинку і ініціалізує об'єкти розмірів, комунікацій та гаражу.
     * Виконує ініціалізацію файлу для журналу.
     * @throws FileNotFoundException якщо не вдається створити файл для журналу.
     */
    public House() throws FileNotFoundException {
        dimensions = new Dimensions();
        communications = new Communications();
        garage = new Garage();
        file = new PrintWriter(new File("File.txt"));
    }


    /**
     * Конструктор, який дозволяє вказати розміри будинку, стан газу, води, електрики та гаражу.
     * Виконує ініціалізацію об'єктів розмірів, комунікацій та гаражу. Також ініціалізує файл для журналу.
     * @param area площа будинку.
     * @param floors кількість поверхів в будинку.
     * @param rooms кількість кімнат в будинку.
     * @param gas стан газу в будинку (true - увімкнено, false - вимкнено).
     * @param water стан води в будинку (HOT або COLD).
     * @param electricity стан електрики в будинку (true - увімкнено, false - вимкнено).
     * @param isOpened стан гаражу (OPEN або CLOSED).
     * @param carsInTheGarage кількість припаркованих автомобілів в гаражі.
     * @param carCapacity максимальна кількість автомобілів, що можуть бути припарковані в гаражі.
     * @throws FileNotFoundException якщо не вдається створити файл для журналу.
     */
    public House(double area, int floors, int rooms, boolean gas, WaterType water, boolean electricity, 
    		GarageType isOpened, int carsInTheGarage, int carCapacity ) throws FileNotFoundException {
    	dimensions = new Dimensions(area, floors, rooms);
    	communications = new Communications(gas, water, electricity );
    	garage = new Garage (isOpened, carsInTheGarage, carCapacity  );
    	file = new PrintWriter(new File("File.txt"));
    }
    
    /**
     * Конструктор, який дозволяє вказати розміри будинку.
     * Виконує ініціалізацію об'єкта розмірів, а також ініціалізацію файлу для журналу.
     * @param area площа будинку.
     * @param floors кількість поверхів в будинку.
     * @param rooms кількість кімнат в будинку.
     * @throws FileNotFoundException якщо не вдається створити файл для журналу.
     */
    public House(double area, int floors, int rooms) throws FileNotFoundException {
    	dimensions = new Dimensions(area, floors, rooms);
    	communications = new Communications();
    	garage = new Garage();
    	file = new PrintWriter(new File("File.txt"));
    }
    
    /**
     * Конструктор, який дозволяє вказати стан газу, води та електрики в будинку.
     * Виконує ініціалізацію об'єкта комунікацій та ініціалізацію файлу для журналу.
     * @param gas стан газу в будинку (true - увімкнено, false - вимкнено).
     * @param water стан води в будинку (HOT або COLD).
     * @param electricity стан електрики в будинку (true - увімкнено, false - вимкнено).
     * @throws FileNotFoundException якщо не вдається створити файл для журналу.
     */
    public House(boolean gas, WaterType water, boolean electricity) throws FileNotFoundException {
    	dimensions = new Dimensions();
    	communications = new Communications(gas, water, electricity );
    	garage = new Garage();
    	file = new PrintWriter(new File("File.txt"));
    }
    
    /**
     * Конструктор, який дозволяє вказати стан гаражу та максимальну кількість автомобілів, які можуть бути припарковані.
     * Виконує ініціалізацію об'єкта гаражу та ініціалізацію файлу для журналу.
     * @param isOpened стан гаражу (OPEN або CLOSED).
     * @param carsInTheGarage кількість припаркованих автомобілів в гаражу.
     * @param carCapacity максимальна кількість автомобілів, що можуть бути припарковані в гаражі.
     * @throws FileNotFoundException якщо не вдається створити файл для журналу.
     */
    public House(GarageType isOpened, int carsInTheGarage, int carCapacity) throws FileNotFoundException {
    	dimensions = new Dimensions();
    	garage = new Garage (isOpened, carsInTheGarage, carCapacity  );
    	communications = new Communications();
    	file = new PrintWriter(new File("File.txt"));
    }
    
/**
 * Виводить інформацію про розміри будинку (площу, кількість поверхів та кімнат)
 * у вигляді текстових рядків у вказаний вихідний потік.
 */
public void getDimensionsData() {
	file.println("Площа будинку: " + dimensions.getArea() + " кв. м");
	file.println("Кількість поверхів: " + dimensions.getFloors());
	file.println("Кількість кімнат: " + dimensions.getRooms());
	file.println();
	file.flush();
}

/**
 * Обчислює та виводить загальну площу усіх кімнат у будинку у вихідний потік.
 * Результат обчислення виводиться як рядок у вигляді "Загальна площа усіх кімнат у будинку : [результат] кв. м".
 */
public void calculateTotalArea() {
	dimensions.calculateTotalArea();
	file.println("Загальна площа усіх кімнат у будинку : " + dimensions.calculateTotalArea());
	file.println();
	file.flush();
}

/**
 * Метод для додавання кімнат у будинку. Перевіряє, чи не досягнуто максимальної
 * кількості кімнат для даної кількості поверхів, і виводить відповідне повідомлення у файл.
 * Якщо максимальна кількість кімнат не досягнута, то метод додає одну кімнату та
 * виводить нову кількість кімнат у файл.
 */
public void addRooms(){
	if(dimensions.getRooms()/dimensions.getFloors() > 5 ) {
		file.println("Досягнуто максимальної к-сті кімнат (" + dimensions.getRooms() + ") для даної к-сті поверхів (" + 
				dimensions.getFloors()+")" );
	}
	else {
		dimensions.addRooms();
		file.println("Додано кімнату. Нова к-сть кімнат : " + dimensions.getRooms());
	}
	file.println();
	file.flush();
}

/**
 * Метод для зменшення кількості кімнат у будівлі. Перевіряє, чи не досягнуто мінімальної
 * кількості кімнат для даної кількості поверхів, і виводить відповідне повідомлення у файл.
 * Якщо мінімальна кількість кімнат не досягнута, то метод зменшує кількість кімнат на одну.
 * Після виконання операції, записує результат у файл.
 */
public void subRooms() {
	if(dimensions.getRooms() / dimensions.getFloors() <= 1) {
		file.println("Досягнуто мінімальної к-сті кімнат (" + dimensions.getRooms() + ") для даної к-сті поверхів (" + 
				dimensions.getFloors()+")" );
	}
	else {
		dimensions.subRooms();
		file.println("Віднято кімнату. Нова к-сть кімнат : " + dimensions.getRooms());
	}
	file.println();
	file.flush();
}

/**
 * Увімкнути газ у будинку.
 * Цей метод включає газ у комунікаціях будинку.
 */
public void turnOnGas() {
	communications.turnOnGas();
	file.println("Газ увімкнено.");
	file.println();
	file.flush();
}

/**
 * Вимкнути газ у будинку.
 * Цей метод вимикає газ у комунікаціях будинку .
 */
public void turnOffGas() {
	communications.turnOffGas();;
	file.println("Газ вимкнено.");
	file.println();
	file.flush();
}

/**
 * Увімкнути холодну воду у будинку.
 * Цей метод включає холодну воду у комунікаціях будинку.
 */
public void turnOnColdWater() {
	communications.turnOnColdWater();
	file.println("Холодну воду увімкнено.");
	file.println();
	file.flush();
}

/**
 * Увімкнути теплу воду у будинку.
 * Цей метод включає теплу воду у комунікаціях будинку.
 */
public void turnOnHotWater() {
	communications.turnOnHotWater();
	file.println("Теплу воду увімкнено.");
	file.println();
	file.flush();
}

/**
 * Вимкнути воду у будинку.
 * Цей метод виключає воду у комунікаціях будинку.
 */
public void turnOffWater() {
	communications.turnOffWater();
	file.println("Теплу воду увімкнено.");
	file.println();
	file.flush();
}

/**
 * Увімкнути електрику у будинку.
 * Цей метод включає електрику у комунікаціях будинку.
 */
public void turnOnElectricity() {
	communications.turnOnElectricity();
	file.println("Електрику увімкнено.");
	file.println();
	file.flush();
}

/**
 * Вимкнути електрику у будинку.
 * Цей метод виключає електрику у комунікаціях будинку.
 */
public void turnOffElectricity() {
	communications.turnOffElectricity();
	file.println("Електрику вимкнено.");
	file.println();
	file.flush();
}

/**
 * Увімкнути всі комунікації в будинку (газ, воду, електрику).
 */
public void turnOnAll() {
    communications.turnOnAll();
    file.println("Увімкнено газ - " + communications.getGas());
    file.println("Увімкнено воду - " + communications.getWater());
    file.println("Увімкнено електрику - " + communications.getElectricity());
    file.println();
    file.flush();
}

/**
 * Вимкнути всі комунікації в будинку (газ, воду, електрику).
 */
public void turnOffAll() {
    communications.turnOffAll();
    file.println("Вимкнено газ - " + communications.getGas());
    file.println("Вимкнено воду - " + communications.getWater());
    file.println("Вимкнено електрику - " + communications.getElectricity());
    file.println();
    file.flush();
}

/**
 * Отримати інформацію про стан всіх комунікацій в будинку (газ, вода, електрика).
 */
public void getCommunicationsData() {
    file.println("Стан газу - " + communications.getGas());
    file.println("Стан води - " + communications.getWater());
    file.println("Стан електрики - " + communications.getElectricity());
    file.println();
    file.flush();
}

/**
 * Відкрити гараж дистанційно.
 */
public void openGarageRemote() {
    garage.openGarageRemote();
    file.println("Гараж відкрито дистанційно : " + garage.getIsOpened());
    file.println();
    file.flush();
}

/**
 * Відкрити гараж за допомогою ключа.
 */
public void openGarageByKey() {
    garage.openGarageByKey();
    file.println("Гараж відкрито ключем : " + garage.getIsOpened());
    file.println();
    file.flush();
}

/**
 * Закрити гараж.
 */
public void closeGarage() {
    garage.closeGarage();
    file.println("Гараж закрито : " + garage.getIsOpened());
    file.println();
    file.flush();
}

/**
 * Отримати інформацію про стан гаражу та кількість автомобілів, що знаходяться в гаражі.
 */
public void getGarageData() {
    file.println("Стан гаражу : " + garage.getIsOpened());
    file.println("Кількість припаркованих авто : " + garage.getCarsInTheGarage());
    file.println("Максимальна кількість вмістимих авто : " + garage.getCarCapacity());
    file.println();
    file.flush();
}

/**
 * Припаркувати автомобіль у гаражу.
 */
public void parkCar() {
    if (!garage.isGarageOpened()) {
        file.println("Гараж закритий. Неможливо припаркувати авто.");
    } else if (garage.getCarsInTheGarage() + 1 > garage.getCarCapacity()) {
        file.println("У гаражі немає місця. Припарковано " + garage.getCarsInTheGarage() + " авто з можливих " +
                garage.getCarCapacity());
    } else {
        garage.parkCar();
        file.println("Авто припарковано. Нова кількість припаркованих авто " + garage.getCarsInTheGarage() +
                " авто з можливих " + garage.getCarCapacity());
    }
    file.println();
    file.flush();
}

/**
 * Взяти автомобіль з гаражу.
 */
public void takeCar() {
    if (!garage.isGarageOpened()) {
        file.println("Гараж закритий. Неможливо взяти авто.");
    } else if (garage.getCarsInTheGarage() <= 0) {
        file.println("У гаражі немає машин.");
    } else {
        garage.takeCar();
        file.println("Авто взято з гаражу. Нова кількість автомобілів: " + garage.getCarsInTheGarage() +
        " авто з можливих " + garage.getCarCapacity());
    }
    file.println();
    file.flush();
}

/**
 * Збільшити максимальну кількість автомобілів, які можуть бути припарковані у гаражі.
 */
public void addCarCapacity() {
    garage.addCarCapacity();
    file.println("Нова кількість авто вмістимості гаражу : " + garage.getCarCapacity());
    file.println();
    file.flush();
}

}
