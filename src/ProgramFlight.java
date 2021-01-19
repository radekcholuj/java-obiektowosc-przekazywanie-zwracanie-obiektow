
public class ProgramFlight {
    public static void main(String[] args) {

        int n = 10;
        FlightsTable flightsTable = new FlightsTable(n);

        Plane p1 = new Plane(137);
        Plane p2 = new Plane(303);

        Flight f1 = new Flight(15, 17,p1);
        Flight f2 = new Flight(15, 17,p2);
        Flight f3 = new Flight(15, 17,p2);


        flightsTable.addFlight(f1);
        flightsTable.addFlight(f2);
        flightsTable.addFlight(f3);

        flightsTable.displayAllFlights();

        Flight flight = flightsTable.findFlightByPlaneId(555);
        System.out.println("Id -> 555");
        if(flight.plane != null) {
            flight.displayDetail();
        } else {
            System.out.println("Not found.");
        }

    }
}