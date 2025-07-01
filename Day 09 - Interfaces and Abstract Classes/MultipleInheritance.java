public class MultipleInheritance {
    public static void main(String[] args) {
        // Create object implementing multiple interfaces
        SmartPhone phone = new SmartPhone("iPhone", "iOS", 128);
        
        // Call methods from different interfaces
        phone.makeCall("123-456-7890");
        phone.sendMessage("Hello World!");
        phone.takePhoto();
        phone.playMusic("Song.mp3");
        phone.connectToWifi("HomeNetwork");
        
        // Use interfaces as types
        Phone phoneInterface = phone;
        Camera cameraInterface = phone;
        MusicPlayer musicInterface = phone;
        
        phoneInterface.makeCall("987-654-3210");
        cameraInterface.takePhoto();
        musicInterface.playMusic("Another Song.mp3");
    }
}

// First interface
interface Phone {
    void makeCall(String number);
    void sendMessage(String message);
}

// Second interface
interface Camera {
    void takePhoto();
    void recordVideo();
}

// Third interface
interface MusicPlayer {
    void playMusic(String song);
    void pauseMusic();
}

// Fourth interface
interface WifiConnectable {
    void connectToWifi(String networkName);
    void disconnectFromWifi();
}

// Class implementing multiple interfaces
class SmartPhone implements Phone, Camera, MusicPlayer, WifiConnectable {
    private String brand;
    private String os;
    private int storage;
    
    public SmartPhone(String brand, String os, int storage) {
        this.brand = brand;
        this.os = os;
        this.storage = storage;
    }
    
    // Phone interface methods
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " from " + brand + " phone");
    }
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
    
    // Camera interface methods
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with " + brand + " camera");
    }
    
    @Override
    public void recordVideo() {
        System.out.println("Recording video with " + brand + " camera");
    }
    
    // MusicPlayer interface methods
    @Override
    public void playMusic(String song) {
        System.out.println("Playing " + song + " on " + brand + " phone");
    }
    
    @Override
    public void pauseMusic() {
        System.out.println("Music paused");
    }
    
    // WifiConnectable interface methods
    @Override
    public void connectToWifi(String networkName) {
        System.out.println("Connecting to WiFi network: " + networkName);
    }
    
    @Override
    public void disconnectFromWifi() {
        System.out.println("Disconnected from WiFi");
    }
    
    // Additional methods specific to SmartPhone
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", OS: " + os + ", Storage: " + storage + "GB");
    }
} 