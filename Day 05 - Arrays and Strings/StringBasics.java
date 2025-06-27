public class StringBasics {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0,5): " + str.substring(0, 5));
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
        System.out.println("Char at 1: " + str.charAt(1));
    }
} 