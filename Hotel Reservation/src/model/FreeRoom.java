package model;

public class FreeRoom extends Room{
    public FreeRoom(String roomNumber,Double price,RoomType enm)
    {
        super(roomNumber, (double) 0,enm);
    }

    @Override
    public String toString() {
        return "room "+roomNumber+" of "+enm+ " occupancy is free of cost";
    }
}
