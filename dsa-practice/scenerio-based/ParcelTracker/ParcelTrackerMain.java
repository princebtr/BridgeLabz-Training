package ParcelTracker;

// Main class
public class ParcelTrackerMain {
    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        tracker.addCheckpoint("Shipped", "Customs Check");

        tracker.trackParcel();
    }
}
