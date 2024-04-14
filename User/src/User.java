public class User {

    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean isGuest;

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isGuest = false;
    }

    public User(String email) {
        this.email = email;
        this.isGuest = true;
    }

    public void upgradeToAccount(String name, String lastName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.isGuest = false;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isGuest() {
        return isGuest;
    }
    public static void main(String[] args) {
        User guest1 = new User("guest1@email.com");
        User guest2 = new User("guest2@email.com");
        User user1 = new User("John", "Doe", "user1@email.com", "password123");

        guest1.upgradeToAccount("Jane", "Smith", "newpassword");

        System.out.println("Guest 1: " + guest1.getEmail() + " (isGuest: " + guest1.isGuest() + ")");
        System.out.println("Guest 2: " + guest2.getEmail() + " (isGuest: " + guest2.isGuest() + ")");
        System.out.println("User 1: " + user1.getName() + " " + user1.getLastName() + " (" + user1.getEmail() + ")");
    }
}
