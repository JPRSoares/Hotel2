package io.codeforall.heapsdontlie;

public class Main {

    public static void main(String[] args) {

        Hotel trip = new Hotel("Trip");
        Guests johny = new Guests("Johny");
        Guests peter = new Guests("Peter");

        johny.askCheckIn(trip);

        johny.askCheckIn(trip);

        johny.askCheckOut(trip);

        peter.askCheckOut(trip);
    }
}
