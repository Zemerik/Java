public class EnumMethodsDemo {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        System.out.println("Current: " + light);
        System.out.println("Next: " + light.next());
        System.out.println("All values: ");
        for (TrafficLight t : TrafficLight.values()) {
            System.out.println(t + " ordinal: " + t.ordinal());
        }
    }
}

enum TrafficLight {
    RED, YELLOW, GREEN;
    public TrafficLight next() {
        switch (this) {
            case RED: return YELLOW;
            case YELLOW: return GREEN;
            case GREEN: return RED;
            default: return RED;
        }
    }
} 