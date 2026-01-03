// Superclass
class Device {
    protected String deviceId;
    protected String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH101", "ON", 24);
        thermostat.displayStatus();
    }
}

// Subclass
class Thermostat extends Device {
    private int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

