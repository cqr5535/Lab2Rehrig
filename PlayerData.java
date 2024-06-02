public class PlayerData {
    /**

     * Project:space game
     * Purpose Details: to initialize the player data
     * Course: IST 242
     * Author: Chase Rehrig
     * Date Developed: 5/25/24
     * Last Date Changed: 5/25/24
     * Revision: 5/25/24

     */
    /**
     * The name of the player.
     */
    private String name;
    /**
     * The score of the player.
     */
    private int score;

    /**
     * Receives player data and stores it in PlayerData.
     *
     * @param name stores name in name field.
     * @param score stores score in score field.
     */
    public PlayerData(String name, int score) {
        this.name = name;
        this.score = score;
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
     * Retrieves score data and returns to call.
     *
     * @return score data
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets score field to data received.
     *
     * @param score sets data for score field
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * prints PlayerData portion of GameInit printout
     *
     * @return text for player data
     */
    @Override
    public String toString() {
        return "named " + name +
                " with a score of " + score;
    }
}