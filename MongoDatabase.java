/** Project: SQl and MongoDB
 * Purpose Details: Mongo Database,Space Game
 * Course: IST 242
 * Author: Chase Rehrig
 * Date Developed: 6/1/2024
 * Last Date Changed: 6/1/2024
 * Rev: 1.0
 */

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class MongoDatabase {

    /**
     * Connects to the MongoDB database
     *
     * @return the database retrieved
     */
    private MongoDatabase connect() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        return mongoClient.getDatabase("space");
    }

    /**
     * Creates a ship in the MongoDB database
     *
     * @param shipId The first ship to be added.
     * @param healthPoints Health of the ship.
     */
    public void createShip(int shipId, int healthPoints) {
        MongoDatabase database = this.connect();
        MongoCollection<Document> collection = database.getCollection("ships");
        Document doc = new Document("id", shipId)
                .append("health_points", healthPoints);
        collection.insertOne(doc);
        System.out.println("Insert Success");
    }

    /**
     * Reads a ship in the database
     *
     * @param shipId finds the ship to be read.
     */
    public void readShip(int shipId) {
        MongoDatabase database = this.connect();
        MongoCollection<Document> collection = database.getCollection("ships");
        Document doc = collection.find(eq("id", shipId)).first();
        if (doc != null) {
            System.out.println("Ship Health Points: " + doc.getInteger("health_points"));
        } else {
            System.out.println("No Ship found");
        }
    }

    /**
     * Updates a ship at the ID in the database
     *
     * @param shipId The first ship to be added.
     * @param healthPoints Health of the ship.
     */
    public void updateShip(int shipId, int healthPoints) {
        MongoDatabase database = this.connect();
        MongoCollection<Document> collection = database.getCollection("ships");
        collection.updateOne(eq("id", shipId), new Document("$set", new Document("health_points", healthPoints)));
        System.out.println("Update Success");
    }

    /**
     * Removes ship data from set data space
     *
     * @param shipId The first ship to be added.
     */
    public void deleteShip(int shipId) {
        MongoDatabase database = this.connect();
        MongoCollection<Document> collection = database.getCollection("ships");
        collection.deleteOne(eq("id", shipId));
        System.out.println("Delete Success");
    }
}
