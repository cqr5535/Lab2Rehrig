public class Powers {
    /**

     * Project:space game
     * Purpose Details: to initialize the powers
     * Course: IST 242
     * Author: Chase Rehrig
     * Date Developed: 5/25/24
     * Last Date Changed: 5/25/24
     * Revision: 5/25/24

     */
    /**
     * The name of the power.
     */
    private String name;
    /**
     * The effect of the power.
     */
    private String effect;

    /**
     * Receives power data and stores it in Powers.
     *
     * @param name stores data in powers field.
     * @param effect stores data in effect field.
     */
    public Powers(String name, String effect) {
        this.name = name;
        this.effect = effect;
    }

    /**
     * Retrieves name data and returns to call.
     *
     * @return name data
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name field to data received.
     *
     * @param name sets data for name field
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves effect data and returns to call.
     *
     * @return effect data
     */
    public String getEffect() {
        return effect;
    }

    /**
     * Sets effect field to data received.
     *
     * @param effect sets data for effect field
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * prints Powers portion of GameInit printout
     *
     * @return text for power data
     */
    @Override
    public String toString() {
        return name + " power and it will " +
                effect + ".";
    }
}