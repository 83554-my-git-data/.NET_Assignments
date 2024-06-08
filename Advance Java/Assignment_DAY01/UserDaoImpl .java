import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements AutoCloseable {
    private Connection connection;

    public UserDaoImpl() throws Exception {
        // Initialize database connection
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "username", "password");
    }

    @Override
    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findByEmail(String email) throws Exception {
        String sql = "SELECT * FROM users WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new User(resultSet.getInt("id"), resultSet.getString("email"), resultSet.getBoolean("voted"));
            }
        }
        return null;
    }

    @Override
    public User findById(int id) throws Exception {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new User(resultSet.getInt("id"), resultSet.getString("email"), resultSet.getBoolean("voted"));
            }
        }
        return null;
    }

    @Override
    public int save(User user) throws Exception {
        String sql = "INSERT INTO users (email, voted) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getEmail());
            statement.setBoolean(2, user.isVoted());
            return statement.executeUpdate();
        }
    }

    @Override
    public int updateStatus(int userId, boolean voted) throws Exception {
        String sql = "UPDATE users SET voted = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setBoolean(1, voted);
            statement.setInt(2, userId);
            return statement.executeUpdate();
        }
    }

    @Override
    public int updatePassword(int userId, String newPassword) throws Exception {
        String sql = "UPDATE users SET password = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newPassword);
            statement.setInt(2, userId);
            return statement.executeUpdate();
        }
    }

    @Override
    public int deleteById(int id) throws Exception {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            return statement.executeUpdate();
        }
    }

    @Override
    public int update(User user) throws Exception {
        String sql = "UPDATE users SET email = ?, voted = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getEmail());
            statement.setBoolean(2, user.isVoted());
            statement.setInt(3, user.getId());
            return statement.executeUpdate();
        }
    }
}
