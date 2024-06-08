public class User {
    private int id;
    private String email;
    private boolean voted;

    // Constructor
    public User(int id, String email, boolean voted) {
        this.id = id;
        this.email = email;
        this.voted = voted;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    // toString method
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", voted=" + voted +
                '}';
    }
}
