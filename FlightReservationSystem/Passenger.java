package FlightReservationSystem;

public abstract class Passenger<Static> extends RegularTicket{
    String name1, seatNumber1;
    int age1;

    public void getFlightDetails(){

    }

    public Passenger(String name1, String seatNumber1, int age1) {
        this.name1 = name1;
        this.seatNumber1 = seatNumber1;
        this.age1 = age1;
    }

}
