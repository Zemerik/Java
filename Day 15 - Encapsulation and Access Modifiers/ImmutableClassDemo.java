public class ImmutableClassDemo {
    public static void main(String[] args) {
        ImmutablePoint p = new ImmutablePoint(3, 4);
        System.out.println("Point: (" + p.getX() + ", " + p.getY() + ")");
        // p.x = 10; // Not allowed
        // p.setX(10); // Not allowed
    }
}

final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
} 