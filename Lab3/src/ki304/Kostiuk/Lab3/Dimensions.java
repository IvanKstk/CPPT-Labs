package ki304.Kostiuk.Lab3;

/**
 * Клас, що представляє характеристики будинку.
 */
public class Dimensions {

    // Приватні поля класу

    /** Площа будинку у квадратних метрах. */
    private double area;

    /** Кількість поверхів у будинку. */
    private int floors;

    /** Кількість кімнат у будинку. */
    private int rooms;

    // Конструктори

    /**
     * Конструктор за замовчуванням. Ініціалізує площу, кількість поверхів та кількість кімнат
     * значеннями за замовчуванням.
     */
    public Dimensions() {
        area = 100.00;
        floors = 2;
        rooms = 4;
    }

    /**
     * Конструктор, що дозволяє вказати значення площі, кількості поверхів та кількості кімнат
     * при створенні об'єкта.
     *
     * @param area Площа будинку у квадратних метрах.
     * @param floors Кількість поверхів у будинку.
     * @param rooms Кількість кімнат у будинку.
     */
    public Dimensions(double area, int floors, int rooms) {
        this.area = area;
        this.floors = floors;
        this.rooms = rooms;
    }

    // Методи доступу до полів

    /**
     * Отримати площу будинку.
     *
     * @return Площа будинку у квадратних метрах.
     */
    public double getArea() {
        return area;
    }

    /**
     * Встановити площу будинку.
     *
     * @param area Нова площа будинку у квадратних метрах.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Отримати кількість поверхів у будинку.
     *
     * @return Кількість поверхів у будинку.
     */
    public int getFloors() {
        return floors;
    }

    /**
     * Встановити кількість поверхів у будинку.
     *
     * @param floors Нова кількість поверхів у будинку.
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }

    /**
     * Отримати кількість кімнат у будинку.
     *
     * @return Кількість кімнат у будинку.
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Встановити кількість кімнат у будинку.
     *
     * @param rooms Нова кількість кімнат у будинку.
     */
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    // Методи обчислення

    /**
     * Обчислює загальну площу усіх кімнат у будинку.
     *
     * @return Загальна площа усіх кімнат у квадратних метрах.
     */
    public double calculateTotalArea() {
        return area * floors;
    }

    /**
     * Додає одну кімнату до кількості кімнат у будинку.
     */
    public void addRooms() {
        rooms++;
    }

    /**
     * Віднімає одну кімнату від кількості кімнат у будинку.
     */
    public void subRooms() {
        rooms--;
    }
}