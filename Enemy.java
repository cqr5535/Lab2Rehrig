public class Enemy {
    /**

     * Project:space game
     * Purpose Details: to initialize the enemy
     * Course: IST 242
     * Author: Chase Rehrig
     * Date Developed: 5/25/24
     * Last Date Changed: 5/25/24
     * Revision: 5/25/24

     */
    /**
     * The name of the species.
     */
    private String species;
    /**
     * The strength of the species.
     */
    private int strength;

    /**
     * Receives enemy data and stores it in Enemy.
     *
     * @param species stores data in species field.
     * @param strength stores data in strength field.
     */
    public Enemy(String species, int strength) {
        this.species = species;
        this.strength = strength;
    }

    /**
     * Retrieves Species data and returns to call.
     *
     * @return species data
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets species field to data received.
     *
     * @param species sets data for species field
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Retrieves Strength data and returns to call.
     *
     * @return strength data
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets strength field to data received.
     *
     * @param strength sets data for strength field
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * prints Enemy portion of GameInit printout
     *
     * @return text for enemy data
     */
    @Override
    public String toString() {
        return species +
                " with a strength rating of " + strength;
    }
}