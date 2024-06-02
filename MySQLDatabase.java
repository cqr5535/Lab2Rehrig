/** Project: SQl and MongoDB
 * Purpose Details: MySQL Database,Space Game
 * Course: IST 242
 * Author: Chase Rehrig
 * Date Developed: 6/1/2024
 * Last Date Changed: 6/1/2024
 * Rev: 1.0
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLDatabase {

    /**
     * Connects to the MySQL database
     *
     * @return the database retrieved
     */
    private Connection connect() {
        // Replace with your MySQL credentials and database name
        String url = "jdbc:mysql://localhost:3306/space";
        String user = "chase";
        String password = "password";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * Creates a ship in the MySQL database
     *
     * @param shipId The first ship to be added.
     * @param healthPoints Health of the ship.
     */
    public void createShip(int shipId, int healthPoints) {
        String sql = "INSERT INTO ships(id, health_points) VALUES(?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, shipId);
            pstmt.setInt(2, healthPoints);
            pstmt.executeUpdate();
            System.out.println("Insert Success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Reads a ship in the database
     *
     * @param shipId finds the ship to be read.
     */
    public void readShip(int shipId) {
        String sql = "SELECT health_points FROM ships WHERE id = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt  = conn.prepareStatement(sql)) {
            pstmt.setInt(1, shipId);
            ResultSet rs  = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Ship Health Points: " + rs.getInt("health_points"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Updates a ship at the ID in the database
     *
     * @param shipId The first ship to be added.
     * @param healthPoints Health of the ship.
     */
    public void updateShip(int shipId, int healthPoints) {
        String sql = "UPDATE ships SET health_points = ? WHERE id = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, healthPoints);
            pstmt.setInt(2, shipId);
            pstmt.executeUpdate();
            System.out.println("Update Success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Removes ship data from set data space
     *
     * @param shipId The first ship to be added.
     */
    public void deleteShip(int shipId) {
        String sql = "DELETE FROM ships WHERE id = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, shipId);
            pstmt.executeUpdate();
            System.out.println("Delete Success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
