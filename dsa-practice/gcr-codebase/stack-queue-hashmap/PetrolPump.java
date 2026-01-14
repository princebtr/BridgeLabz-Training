public class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

class CircularTour {

    public static int findStart(PetrolPump[] pumps) {
        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;

            // If surplus is negative, reset start
            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }

        // Check if total petrol is enough
        return (surplus + deficit >= 0) ? start : -1;
    }

    // Driver code
    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int startIndex = findStart(pumps);

        if (startIndex != -1) {
            System.out.println("Start tour at petrol pump index: " + startIndex);
        } else {
            System.out.println("No possible tour");
        }
    }
}
