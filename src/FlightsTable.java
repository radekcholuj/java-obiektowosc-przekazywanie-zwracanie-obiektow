public class FlightsTable {
    Flight[] flightArray;
    int iterator = 0;

    public FlightsTable(int size) {
        flightArray = new Flight[size];
    }

    void addFlight(Flight flight) {
        boolean duplicatOfPlane = false;
        boolean duplicatOfArrival = false;
        for (Flight fl : flightArray) {
            if (fl != null) {
                if (fl.plane.equals(flight.plane) && fl.timeOfArrival == fl.timeOfArrival) {
                    System.out.println("Taki lot jest niedostępny");
                    flight.displayDetail();
                    duplicatOfPlane = true;
                }
            }
        }

        if (iterator < flightArray.length && duplicatOfPlane == false && duplicatOfArrival == false) {
            flightArray[iterator] = flight;
            iterator++;
        }
    }

    void displayAllFlights() {
        System.out.println("--- Wszystkie loty informacje ---");
        for (int i = 0; i < flightArray.length && flightArray[i] != null; i++) {
            flightArray[i].displayDetail();
            System.out.println("--------------");
        }
    }

    Flight findFlightByPlaneId(int id) {
        Flight flight = new Flight();
        for (int i = 0; i < flightArray.length && flightArray[i] != null; i++) {
            if(flightArray[i].plane.id == id){
                flight = flightArray[i];
            }
        }
        return flight;
    }
}