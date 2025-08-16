import java.io.*; 

public class TransientFieldDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "account.ser";
        Account acc = new Account("john", "secret");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(acc);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Account read = (Account) ois.readObject();
            System.out.println("Username: " + read.getUsername());
            System.out.println("Password: " + read.getPassword()); // will be null due to transient
        }
        new File(filename).delete();
    }
}

class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String username;
    private transient String password;
    public Account(String username, String password) { this.username = username; this.password = password; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}