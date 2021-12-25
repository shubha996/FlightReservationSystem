package FlightReservationSystem;

public class Flight {
    String flightNumber;
    String airlineName;
    int flightCapacity;
    int numberOfSeatsAvailable;
    int numberOfSeatsBooked;
    String sourceCity;
    String destinationCity;

    public Flight(String flightNumber, String airlineName, int flightCapacity, String sourceCity, String destinationCity) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.sourceCity = sourceCity;
        this.destinationCity = destinationCity;
        this.flightCapacity = flightCapacity;
    }


    public int seatAvailable(){
        numberOfSeatsAvailable = flightCapacity - numberOfSeatsBooked;
        return numberOfSeatsAvailable;
    }
}
