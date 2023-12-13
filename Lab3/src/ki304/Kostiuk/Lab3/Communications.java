package ki304.Kostiuk.Lab3;


/**
 * Клас, що представляє комунікаційні можливості будинку.
 */
public class Communications {

    // Приватні поля класу

 
    private boolean gas;
    private WaterType water;
    private boolean electricity;

    // Оголошення перерахування WaterType

    /**
     * Перерахування, що визначає тип водопостачання в будинку.
     * - COLD: Холодна вода
     * - HOT: Гаряча вода
     * - OFF: Вода вимкнена
     */
    public enum WaterType {
        COLD, HOT, OFF
    }

    // Конструктори

    /**
     * Конструктор за замовчуванням. Ініціалізує комунікаційні можливості будинку
     * значеннями за замовчуванням.
     */
    public Communications() {
        gas = false;
        water = WaterType.OFF;
        electricity = false;
    }

    /**
     * Конструктор, що дозволяє вказати наявність газу, тип водопостачання та наявність електроенергії
     * при створенні об'єкта.
     *
     * @param gas Газ.
     * @param water Тип водопостачання (гаряча, холодна, вимкнена).
     * @param electricity Електроенергія.
     */
    public Communications(boolean gas, WaterType water, boolean electricity) {
        this.gas = gas;
        this.water = water;
        this.electricity = electricity;
    }

    // Методи доступу до полів

    /**
     * Отримати інформацію про наявність газу в будинку.
     *
     * @return true, якщо газ є, false, якщо газ вимкнений.
     */
    public boolean getGas() {
        return gas;
    }

    /**
     * Встановити наявність газу в будинку.
     *
     * @param gas Наявність газу в будинку (true, якщо є, false, якщо вимкнено).
     */
    public void setGas(boolean gas) {
        this.gas = gas;
    }

    /**
     * Отримати тип водопостачання в будинку.
     *
     * @return Тип водопостачання (гаряча, холодна, вимкнена).
     */
    public WaterType getWater() {
        return water;
    }

    /**
     * Встановити тип водопостачання в будинку.
     *
     * @param water Тип водопостачання (гаряча, холодна, вимкнена).
     */
    public void setWater(WaterType water) {
        this.water = water;
    }

    /**
     * Отримати інформацію про наявність електроенергії в будинку.
     *
     * @return true, якщо є електроенергія, false, якщо електроенергія вимкнена.
     */
    public boolean getElectricity() {
        return electricity;
    }

    /**
     * Встановити наявність електроенергії в будинку.
     *
     * @param electricity Наявність електроенергії в будинку (true, якщо є, false, якщо вимкнено).
     */
    public void setElectricity(boolean electricity) {
        this.electricity = electricity;
    }

    // Методи для управління комунікаціями

    /**
     * Включає газ в будинку.
     */
    public void turnOnGas() {
        this.gas = true;
    }

    /**
     * Вимикає газ в будинку.
     */
    public void turnOffGas() {
        this.gas = false;
    }

    /**
     * Включає гарячу воду в будинку.
     */
    public void turnOnHotWater() {
        this.water = WaterType.HOT;
    }

    /**
     * Включає холодну воду в будинку.
     */
    public void turnOnColdWater() {
        this.water = WaterType.COLD;
    }

    /**
     * Вимикає водопостачання в будинку.
     */
    public void turnOffWater() {
        this.water = WaterType.OFF;
    }

    /**
     * Включає електроенергію в будинку.
     */
    public void turnOnElectricity() {
        this.electricity = true;
    }

    /**
     * Вимикає електроенергію в будинку.
     */
    public void turnOffElectricity() {
        this.electricity = false;
    }

    /**
     * Включає всі комунікації в будинку (газ, холодну воду і електроенергію).
     */
    public void turnOnAll() {
        this.gas = true;
        this.water = WaterType.COLD;
        this.electricity = true;
    }

    /**
     * Вимикає всі комунікації в будинку (газ, воду і електроенергію).
     */
    public void turnOffAll() {
        this.gas = false;
        this.water = WaterType.OFF;
        this.electricity = false;
    }
}