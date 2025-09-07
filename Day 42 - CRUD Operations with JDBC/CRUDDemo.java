import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDDemo {
    private static final String URL = "jdbc:h2:mem:testdb";
    private static final String USER = "sa";
    private static final String PASSWORD = "";
    
    public static void main(String[] args) {
        try {
            // Create table
            createTable();
            
            // Create (Insert)
            insertStudent("John Doe", 20, "Computer Science");
            insertStudent("Jane Smith", 22, "Mathematics");
            insertStudent("Bob Johnson", 21, "Physics");
            
            // Read (Select)
            System.out.println("All students:");
            List<Student> students = getAllStudents();
            for (Student student : students) {
                System.out.println(student);
            }
            
            // Update
            updateStudent(1, "John Updated", 21, "Computer Science");
            System.out.println("\nAfter update:");
            students = getAllStudents();
            for (Student student : students) {
                System.out.println(student);
            }
            
            // Delete
            deleteStudent(2);
            System.out.println("\nAfter delete:");
            students = getAllStudents();
            for (Student student : students) {
                System.out.println(student);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static void createTable() throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS students (
                id INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(100) NOT NULL,
                age INT,
                major VARCHAR(100)
            )
            """;
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created successfully");
        }
    }
    
    private static void insertStudent(String name, int age, String major) throws SQLException {
        String sql = "INSERT INTO students (name, age, major) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, major);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Inserted " + rowsAffected + " student(s)");
        }
    }
    
    private static List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Student student = new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("major")
                );
                students.add(student);
            }
        }
        
        return students;
    }
    
    private static void updateStudent(int id, String name, int age, String major) throws SQLException {
        String sql = "UPDATE students SET name = ?, age = ?, major = ? WHERE id = ?";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, major);
            pstmt.setInt(4, id);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Updated " + rowsAffected + " student(s)");
        }
    }
    
    private static void deleteStudent(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Deleted " + rowsAffected + " student(s)");
        }
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private String major;
    
    public Student(int id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', age=%d, major='%s'}", 
                           id, name, age, major);
    }
} 