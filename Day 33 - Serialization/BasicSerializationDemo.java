import java.io.*; 

public class BasicSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "user.ser";
        User user = new User("alice", 30);
        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(user);
        }
        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            User read = (User) ois.readObject();
            System.out.println("Deserialized: " + read);
        }
        new File(filename).delete();
    }
}

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String username;
    private final int age;
    public User(String username, int age) { this.username = username; this.age = age; }
    public String toString() { return username + " (" + age + ")"; }
}