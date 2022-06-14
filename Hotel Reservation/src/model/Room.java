package model;

public class Room implements IRoom{
    protected  String roomNumber;
    protected  Double price;
    protected RoomType enm;

    public Room(String roomNumber,Double price,RoomType enm)
    {
        this.roomNumber=roomNumber;
        this.enm=enm;
        this.price=price;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {
        return enm;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "room "+roomNumber+" has price of "+price+" in "+enm+" occupancy";
    }
}
