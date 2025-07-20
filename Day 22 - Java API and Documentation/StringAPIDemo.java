public class StringAPIDemo {
    public static void main(String[] args) {
        String s = "  Hello Java!  ";
        System.out.println("Original: '" + s + "'");
        System.out.println("Trimmed: '" + s.trim() + "'");
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Contains 'Java': " + s.contains("Java"));
        System.out.println("Replace: " + s.replace("Java", "World"));
        System.out.println("Substring: " + s.substring(2, 7));
    }
} 