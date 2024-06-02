public class Obstacles {
    /**

     * Project:space game
     * Purpose Details: to initialize the obstacles
     * Course: IST 242
     * Author: Chase Rehrig
     * Date Developed: 5/25/24
     * Last Date Changed: 5/25/24
     * Revision: 5/25/24

     */
    /**
     * The type of obstacle.
     */
    private String type;
    /**
     * The damage of obstacle.
     */
    private int damage;

    /**
     * Receives obstacle data and stores it in Obstacles.
     *
     * @param type stores type in type field.
     * @param damage stores damage in damage field.
     */
    public Obstacles(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    /**
     * Retrieves type data and returns to call.
     *
     * @return type data
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type field to data received.
     *
     * @param type sets data for type field
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Retrieves damage data and returns to call.
     *
     * @return damage data
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Sets damage field to data received.
     *
     * @param damage sets data for damage field
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * prints Obstacles portion of GameInit printout
     *
     * @return text for obstacle data
     */
    @Override
    public String toString() {
        return type +
                " otherwise it will deal " + damage
                + " damage to you";
    }
}
