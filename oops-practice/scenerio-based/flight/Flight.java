package flight;

public class Flight {
	private int id;
	private String airLine;
	private String source;
	private String destination;
	private int seatAvailable = 85;
	private double cost;
	private static int idCount = 0;
	public Flight(String airLine, String source, String destination, double cost) {
		this.id = idCount++;
		this.source = source;
		this.destination = destination;
		this.airLine = airLine;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public int getSeat() {
		return seatAvailable;
	}
	public String getAirLine() {
		return airLine;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public double getCost() {
		return cost;
	}
	public void updatePassenger() {
        seatAvailable--;
    }
	public double amount(int p) {
		return cost*p;
	}
}
