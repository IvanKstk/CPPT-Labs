package ki304.kostiuk.Lab2;
/**
 * Клас Driver реалізує приклад програми до лабораторної роботи 2.
 *
 * @author Kostiuk Ivan
 * @version 1.0
 * @since 2023-10-11
 */
public class Driver {
	public static void main(String[] args) throws Exception {
		House myHouse = new House(150.0, 4, 10);
		myHouse.getDimensionsData();
		myHouse.calculateTotalArea();
		myHouse.addRooms();
		myHouse.getDimensionsData();
		myHouse.subRooms();
		myHouse.getDimensionsData();
		
		myHouse.getCommunicationsData();
		myHouse.turnOnColdWater();
		myHouse.getCommunicationsData();
		myHouse.turnOnAll();
		myHouse.turnOnHotWater();
		myHouse.getCommunicationsData();
		myHouse.turnOffAll();
		
		myHouse.openGarageByKey();
		myHouse.parkCar();
		myHouse.closeGarage();
		myHouse.parkCar();
		myHouse.openGarageRemote();
		myHouse.parkCar();
		myHouse.parkCar();
		myHouse.parkCar();
		myHouse.addCarCapacity();
		myHouse.parkCar();
		myHouse.takeCar();
		myHouse.getGarageData();
	}
}
