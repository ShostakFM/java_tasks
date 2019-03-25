import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseHandler {
    static Connection dbConnection;

     public static void getConnection() {
         Properties properties = new Properties();
         FileInputStream st;
         try {
             st = new FileInputStream("src/main/resources/db.properties");
             properties.load(st);
             String user = properties.getProperty("db.username");
             String password = properties.getProperty("db.password");
             String url = properties.getProperty("db.url");
             String driver = properties.getProperty("db.driverClassName");
             Class.forName(driver);
             dbConnection = DriverManager.getConnection(url, user, password);
         } catch (IOException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }

}
