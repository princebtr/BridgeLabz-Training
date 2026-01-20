package ParcelTracker;

// Singly Linked List for parcel tracking
class ParcelTracker {
    private StageNode head;

    // Add initial stage
    public void addStage(String stage) {
        StageNode newNode = new StageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add checkpoint after a specific stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Parcel may be lost.");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print parcel movement
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel missing. No tracking available.");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Status: ");

        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
