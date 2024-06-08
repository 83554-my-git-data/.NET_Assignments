import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDaoImpl implements AutoCloseable {
    private Connection connection;

    public CandidateDaoImpl() throws Exception {
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
    public List<Candidate> findAll() throws Exception {
        List<Candidate> candidates = new ArrayList<>();
        String sql = "SELECT * FROM candidates";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                candidates.add(new Candidate(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("party"), resultSet.getInt("votes")));
            }
        }
        return candidates;
    }

    @Override
    public List<Candidate> findByParty(String party) throws Exception {
        List<Candidate> candidates = new ArrayList<>();
        String sql = "SELECT * FROM candidates WHERE party = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, party);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                candidates.add(new Candidate(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("party"), resultSet.getInt("votes")));
            }
        }
        return candidates;
    }

    @Override
    public List<Candidate> findAllOrderByVotesDesc() throws Exception {
        List<Candidate> candidates = new ArrayList<>();
        String sql = "SELECT * FROM candidates ORDER BY votes DESC";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                candidates.add(new Candidate(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("party"), resultSet.getInt("votes")));
            }
        }
        return candidates;
    }

    @Override
    public int save(Candidate c) throws Exception {
        String sql = "INSERT INTO candidates (name, party, votes) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, c.getName());
            statement.setString(2, c.getParty());
            statement.setInt(3, c.getVotes());
            return statement.executeUpdate();
        }
    }

    @Override
    public int deleteById(int id) throws Exception {
        String sql = "DELETE FROM candidates WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            return statement.executeUpdate();
        }
    }

    @Override
    public int update(Candidate c) throws Exception {
        String sql = "UPDATE candidates SET name = ?, party = ?, votes = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, c.getName());
            statement.setString(2, c.getParty());
            statement.setInt(3, c.getVotes());
            statement.setInt(4, c.getId());
            return statement.executeUpdate();
        }
    }

    @Override
    public Candidate findById(int id) throws Exception {
        String sql = "SELECT * FROM candidates WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Candidate(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("party"), resultSet.getInt("votes"));
            }
        }
        return null;
    }

    @Override
    public int incrementVotes(int id) throws Exception {
        Candidate candidate = findById(id);
        if (candidate != null) {
            candidate.setVotes(candidate.getVotes() + 1);
            return update(candidate);
        }
        return 0;
    }
}
