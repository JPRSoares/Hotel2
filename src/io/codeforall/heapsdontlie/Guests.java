package io.codeforall.heapsdontlie;

public class Guests {

    private String guestName;
    private  Hotel hotel;
    private Integer roomNr;

    public Guests (String guestName){

        this.guestName = guestName;

    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Integer getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(Integer roomNr) {
        this.roomNr = roomNr;
    }

    public void askCheckIn (Hotel hotel){
        System.out.println("Guest " + guestName + " ask check in Hotel:" + hotel.getHotelName());
        hotel.checkIn(this);
       // System.out.println(" Got the room number " + roomNr);

    }

    public  void askCheckOut ( Hotel hotel){
        System.out.println(" Guest " + guestName + " ask checkout...");
        hotel.checkOut(this);
    }
}
