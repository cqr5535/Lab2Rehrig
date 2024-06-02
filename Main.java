public class Main {
    public static void main(String[] args) {
        /**

         * Project:space game
         * Purpose Details: to run the project
         * Course: IST 242
         * Author: Chase Rehrig
         * Date Developed: 5/25/24
         * Last Date Changed: 5/25/24
         * Revision: 5/25/24

         */
        /**
         * Creates player data and sends it to GameInit to create new object.
         *
         * @param name sends name to GameInit.
         * @param score sends score to GameInit.
         */
        PlayerData player = new PlayerData("Astronaut", 0);
        /**
         * Creates ship data and sends it to GameInit to create new object.
         *
         * @param model sends model to GameInit.
         * @param health sends health to GameInit.
         */
        Ships ship = new Ships("Falcon", 100);
        /**
         * Creates obstacle data and sends it to GameInit to create new object.
         *
         * @param type sends type to GameInit.
         * @param damage sends damage to GameInit.
         */
        Obstacles obstacle = new Obstacles("Asteroid", 25);
        /**
         * Creates power data and sends it to GameInit to create new object.
         *
         * @param name sends name to GameInit.
         * @param effect sends effect to GameInit.
         */
        Powers powerUp = new Powers("Shield Boost", "Increase Health");
        /**
         * Creates enemy data and sends it to GameInit to create new object.
         *
         * @param species sends species to GameInit.
         * @param strength sends strength to GameInit.
         */
        Enemy enemy = new Enemy("Alien", 50);

        /**
         * Compiles all new objects and sends to GameInit to display.
         *
         * @param player sends player to GameInit.
         * @param ship sends ship to GameInit.
         * @param obstacle sends obstacle to GameInit.
         * @param powerUp sends powers to GameInit.
         * @param enemy sends enemies to GameInit.
         */
        GameInit game = new GameInit(player, ship, obstacle, powerUp, enemy);

        /**
         * Takes game data and prints it.
         *
         * @param game sends game to GameInit to print.
         */
        System.out.println(game);
        /**
         * Creates a ship in the SQL database
         *
         * @param shipId The first ship to be added.
         * @param healthPoints Health of the ship.
         */
        MySQLDatabase.createShip(1, 100);
        /**
         * Creates a ship in the MongoDB database
         *
         * @param shipId The first ship to be added.
         * @param healthPoints Health of the ship.
         */
        MongoDatabase.createShip(1, 100);
    }
}