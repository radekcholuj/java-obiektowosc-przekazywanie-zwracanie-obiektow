public class ProgramFlight {
    public static void main(String[] args) {

        int n = 10;
        FlightsTable flightsTable = new FlightsTable(n);

        Planes p1 = new Planes(137);
        Planes p2 = new Planes(303);

        Flight f1 = new Flight(15, 17,p1);
        Flight f2 = new Flight(15, 17,p2);
        Flight f3 = new Flight(15, 17,p2);


        flightsTable.addFlight(f1);
        flightsTable.addFlight(f2);
        flightsTable.addFlight(f3);

        flightsTable.displayAllFlights();

    }
}