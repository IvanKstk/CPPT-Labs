package ki304.Kostiuk.Lab3;


/**
 * Клас Driver реалізує приклад програми до лабораторної роботи 3.
 *
 * @author Kostiuk Ivan
 * @version 1.0
 * @since 2023-10-24
 */
public class Driver {
	
	public static void main(String[] args) throws Exception {
		OfficeCenter myOfficeCenter = new OfficeCenter();
		
		myOfficeCenter.getOfficeCenterData();
		myOfficeCenter.setName("ABC");
		myOfficeCenter.getOfficeCenterData();
		
		myOfficeCenter.setNumberOfOffices(5);
		myOfficeCenter.getOfficeCenterData();
		myOfficeCenter.addOffice();
		myOfficeCenter.getOfficeCenterData();
		myOfficeCenter.removeOffice();
		myOfficeCenter.getOfficeCenterData();
		
		myOfficeCenter.closeFile();
	}
}
