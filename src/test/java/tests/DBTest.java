package tests;

import database.DBConnection;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest {
    DBConnection dbConnection =  new DBConnection();


    @Test
    public void dbConnect() throws SQLException {
        dbConnection.connect();
        ResultSet resultSet = dbConnection.selectFrom("students");
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("City ID: " + resultSet.getInt("cityid"));
        }
        dbConnection.close();
    }
}
