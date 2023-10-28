package io.codeforall.heapsdontlie;

public class Hotel {

    public int numberOfRooms;
    Room rooms[];

    private String hotelName;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.rooms = new Room[10];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
        }
    }


    // GETTERS AND SETTERS
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


    // METHODS

    public Room checkIn(Guests guest) {
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isOccupied() && guest.getRoomNr() == null) {
                rooms[i].setOccupied(true);
                rooms[i].setRoomNumber(i);
                guest.setRoomNr(i);
                System.out.println( guest.getGuestName() + " got a successful checkin at " + getHotelName() + " at room " + guest.getRoomNr() +".\n");
                return rooms[i];
            }
            if (guest.getRoomNr() != null) {
                System.out.println(" You already have a checkin. You have to checkout before you can do a new checkin\n");
                return null;
            }
        }

        System.out.println("No rooms available at this time, sorry. \n");
        return null;
    }

    public Room checkOut(Guests guest) {
        try {
            if (guest.getRoomNr() == null) {
                throw new Exception(guest.getGuestName() + " don't have any room in this hotel, so isn't possible to checkout\n");
            }

            for (int i = 0; i < rooms.length; i++) {
                if (guest.getRoomNr() == rooms[i].getRoomNumber()) {
                    rooms[i].vacate();
                    System.out.println(" The room " + guest.getRoomNr() + " is now free \n");
                    guest.setRoomNr(null);
                    return rooms[i];
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            return null;
    }
}
