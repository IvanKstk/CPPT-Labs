package ki304.kostiuk.Lab2;

/**
 * Клас, що представляє інформацію про гараж.
 */
public class Garage {

    // Приватні поля класу

    /** Стан гаражу (відкритий віддалено, відкритий ключем, закритий). */
    private GarageType isOpened;

    /** Кількість автомобілів у гаражі. */
    private int carsInTheGarage;

    /** Вмістимість гаражу (максимальна кількість автомобілів, яку він може вмістити). */
    private int carCapacity;

    // Оголошення перерахування GarageType

    /**
     * Перерахування, що визначає стан гаражу.
     */
    public enum GarageType {
        REMOTE, KEY, CLOSED
    }

    // Конструктори

    /**
     * Конструктор за замовчуванням. Ініціалізує стан гаражу, кількість автомобілів та вмістимість
     * значеннями за замовчуванням.
     */
    public Garage() {
        isOpened = GarageType.CLOSED;
        carsInTheGarage = 0;
        carCapacity = 3;
    }

    /**
     * Конструктор, що дозволяє вказати стан гаражу, кількість автомобілів та вмістимість гаражу
     * при створенні об'єкта.
     *
     * @param isOpened Стан гаражу (відкритий віддалено, відкритий ключем, закритий).
     * @param carsInTheGarage Кількість автомобілів у гаражі.
     * @param carCapacity Вмістимість гаражу (максимальна кількість автомобілів, яку він може вмістити).
     */
    public Garage(GarageType isOpened, int carsInTheGarage, int carCapacity) {
        this.isOpened = isOpened;
        this.carsInTheGarage = carsInTheGarage;
        this.carCapacity = carCapacity;
    }

    // Методи доступу до полів

    /**
     * Встановити стан гаражу.
     *
     * @param isOpened Новий стан гаражу (відкритий віддалено, відкритий ключем, закритий).
     */
    public void setIsOpened(GarageType isOpened) {
        this.isOpened = isOpened;
    }

    /**
     * Отримати стан гаражу.
     *
     * @return Стан гаражу (відкритий віддалено, відкритий ключем, закритий).
     */
    public GarageType getIsOpened() {
        return isOpened;
    }

    /**
     * Встановити кількість автомобілів у гаражі.
     *
     * @param carsInTheGarage Нова кількість автомобілів у гаражі.
     */
    public void setCarsInTheGarage(int carsInTheGarage) {
        this.carsInTheGarage = carsInTheGarage;
    }

    /**
     * Отримати кількість автомобілів у гаражі.
     *
     * @return Кількість автомобілів у гаражі.
     */
    public int getCarsInTheGarage() {
        return carsInTheGarage;
    }

    /**
     * Встановити вмістимість гаражу (максимальну кількість автомобілів, яку він може вмістити).
     *
     * @param carCapacity Нова вмістимість гаражу.
     */
    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    /**
     * Отримати вмістимість гаражу (максимальну кількість автомобілів, яку він може вмістити).
     *
     * @return Вмістимість гаражу.
     */
    public int getCarCapacity() {
        return carCapacity;
    }

    // Методи для управління гаражем

    /**
     * Перевіряє, чи відкритий гараж (віддалено або за допомогою ключа).
     *
     * @return true, якщо гараж відкритий, false, якщо гараж закритий.
     */
    public boolean isGarageOpened() {
        return isOpened == GarageType.REMOTE || isOpened == GarageType.KEY;
    }

    /**
     * Відкриває гараж віддалено.
     */
    public void openGarageRemote() {
        this.isOpened = GarageType.REMOTE;
    }

    /**
     * Відкриває гараж за допомогою ключа.
     */
    public void openGarageByKey() {
        this.isOpened = GarageType.KEY;
    }

    /**
     * Закриває гараж.
     */
    public void closeGarage() {
        this.isOpened = GarageType.CLOSED;
    }

    /**
     * Паркує автомобіль в гаражі (збільшує кількість автомобілів).
     */
    public void parkCar() {
        carsInTheGarage++;
    }

    /**
     * Виїжджає автомобіль з гаражу (зменшує кількість автомобілів).
     */
    public void takeCar() {
        carsInTheGarage--;
    }

    /**
     * Додає місця для паркування автомобілів у гаражі (збільшує вмістимість гаражу).
     */
    public void addCarCapacity() {
        carCapacity++;
    }
}