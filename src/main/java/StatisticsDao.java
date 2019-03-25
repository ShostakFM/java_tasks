import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class StatisticsDao extends DatabaseHandler {

    public void insert(Statistics statistics) {
        String sql = "insert into string_statistics(id, date_and_time, input_data, output_data) \n" +
                "VALUES (default, now(), ?, ?);";
        try {
            DatabaseHandler.getConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            preparedStatement.setString(1, statistics.getInput());
            preparedStatement.setString(2, statistics.getOutput().toString());
            preparedStatement.executeUpdate();
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
