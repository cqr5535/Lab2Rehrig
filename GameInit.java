public class GameInit {
    /**

     * Project:space game
     * Purpose Details: to initialize the entire game and print to console
     * Course: IST 242
     * Author: Chase Rehrig
     * Date Developed: 5/25/24
     * Last Date Changed: 5/25/24
     * Revision: 5/25/24

     */
    /**
     * Pulls player data from PlayerData class.
     */
    private PlayerData playerData;
    /**
     * Pulls ship data from Ships class.
     */
    private Ships ship;
    /**
     * Pulls obstacle data from Obstacles class.
     */
    private Obstacles obstacle;
    /**
     * Pulls power data from Powers class.
     */
    private Powers powers;
    /**
     * Pulls enemy data from Enemy class.
     */
    private Enemy enemy;

    /**
     * Receives all game data from separate classes and stores it in GameInit to display later.
     *
     * @param playerData stores data in playerData field.
     * @param ship stores data in ship field.
     * @param obstacle stores data in obstacle field.
     * @param powers stores data in ship field.
     * @param enemy stores data in enemy field.
     */
    public GameInit(PlayerData playerData, Ships ship, Obstacles obstacle, Powers powers, Enemy enemy) {
        this.playerData = playerData;
        this.ship = ship;
        this.obstacle = obstacle;
        this.powers = powers;
        this.enemy = enemy;
    }

    /**
     * Retrieves player data and returns to call.
     *
     * @return player data
     */
    public PlayerData getPlayer() {
        return playerData;
    }

    /**
     * Sets player field to data received.
     *
     * @param player sets data for player field
     */
    public void setPlayer(PlayerData player) {
        this.playerData = player;
    }

    /**
     * Retrieves ship data and returns to call.
     *
     * @return ship data
     */
    public Ships getShip() {
        return ship;
    }

    /**
     * Sets ship field to data received.
     *
     * @param ship sets data for ship field
     */
    public void setShip(Ships ship) {
        this.ship = ship;
    }

    /**
     * Retrieves obstacle data and returns to call.
     *
     * @return obstacles data
     */
    public Obstacles getObstacle() {
        return obstacle;
    }

    /**
     * Sets obstacle field to data received.
     *
     * @param obstacle sets data for obstacle field
     */
    public void setObstacle(Obstacles obstacle) {
        this.obstacle = obstacle;
    }

    /**
     * Retrieves power data and returns to call.
     *
     * @return power data
     */
    public Powers getPowerUp() {
        return powers;
    }

    /**
     * Sets power field to data received.
     *
     * @param powerUp sets data for power field
     */
    public void setPowerUp(Powers powerUp) {
        this.powers = powerUp;
    }

    /**
     * Retrieves enemy data and returns to call.
     *
     * @return enemy data
     */
    public Enemy getEnemy() {
        return enemy;
    }

    /**
     * Sets enemy field to data received.
     *
     * @param enemy sets data for enemy field
     */
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    /**
     * prints all game data from data fields
     *
     * @return text for all data
     */
    @Override
    public String toString() {
        return "The general game info is: " + '\n' +
                "The player is " + playerData + '\n' +
                "driving the ship " + ship + "." + '\n' +
                "You are trying to avoid the " + obstacle + "." + '\n' +
                "You will have access to the " + powers + '\n' +
                "Your Enemy will be the " + enemy + "." + '\n' +
                "Good Luck to you, Cadet!";
    }
}
