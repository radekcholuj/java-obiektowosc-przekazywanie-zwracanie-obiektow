public class Flight {
    int timeOfArrival;
    int departureTime;
    Plane plane;

    public Flight(){}

    public Flight(int timeOfArrival, int departureTime, Plane plane) {
        this.timeOfArrival = timeOfArrival;
        this.departureTime = departureTime;
        this.plane = plane;
    }

    void displayDetail(){
        System.out.println("arrival: " + timeOfArrival);
        System.out.println("departure: " + departureTime);
        plane.displayPlaneInfo();
    }
}