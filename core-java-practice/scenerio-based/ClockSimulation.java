//Problem Statement: * Digital Watch Simulation ⏱️
//Simulate a 24-hour watch:
//● Print hours and minutes in a nested for-loop.
//● Use a break to stop at 13:00 manually (simulate power cut).

public class ClockSimulation {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.printf("%02d:%02d\n", hour, minute);
                if (hour == 13 && minute == 0) {
                    System.out.println("⚡ Power Cut! Watch Stopped.");
                    return;
                }
            }
        }
    }
}

