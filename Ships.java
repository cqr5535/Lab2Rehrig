public class Ships {
    /**

     * Project:space game
     * Purpose Details: to initialize the ship
     * Course: IST 242
     * Author: Chase Rehrig
     * Date Developed: 5/25/24
     * Last Date Changed: 5/25/24
     * Revision: 5/25/24

     */
    /**
     * The model of the ship.
     */
    private String model;
    /**
     * The health of the ship.
     */
    private int health;

    /**
     * Receives ship data and stores it in Ships.
     *
     * @param model stores model in model field.
     * @param health stores health in health field.
     */
    public Ships(String model, int health) {
        this.model = model;
        this.health = health;
    }

    /**
     * Retrieves model data and returns to call.
     *
     * @return model data
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets model field to data received.
     *
     * @param model sets data for model field
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Retrieves health data and returns to call.
     *
     * @return health data
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets health field to data received.
     *
     * @param health sets data for health field
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * prints Ships portion of GameInit printout
     *
     * @return text for ship data
     */
    @Override
    public String toString() {
        return model +
                " with a health pool of " + health;
    }
}
