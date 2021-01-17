public class Flight {
    int timeOfArrival;
    int departureTime;
    Planes planeId;

    public Flight(int timeOfArrival, int departureTime, Planes planeId) {
        this.timeOfArrival = timeOfArrival;
        this.departureTime = departureTime;
        this.planeId = planeId;
    }

    void displayDetail(){
        System.out.println("arrival: " + timeOfArrival);
        System.out.println("departure: " + departureTime);
        planeId.displayPlaneInfo();
    }
}