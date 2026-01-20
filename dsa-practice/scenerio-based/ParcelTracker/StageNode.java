package ParcelTracker;

// Node representing a delivery stage
class StageNode {
    String stage;
    StageNode next;

    StageNode(String stage) {
        this.stage = stage;
        this.next = null;
    }
}