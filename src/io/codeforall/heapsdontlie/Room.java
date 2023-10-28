package io.codeforall.heapsdontlie;

public class Room {

    private int roomNumber;
    private boolean isOccupied;

    // Getters and Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean state) {
        this.isOccupied = state;
    }

    // Method to make the room vacant
    public void vacate() {
        this.isOccupied = false;
    }
}
