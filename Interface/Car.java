public class Car implements Vehicle,Production{
    String type;
    String speed;
    String color;
    String location;
    public Car(String type,String speed,String color,String location)
    {
        this.type=type;
        this.speed=speed;
        this.color=color;
        this.location=location;
    }
    public String getType(){
        return type;
    }
    public String getSpeed(){
        return speed;
    }
    public String getColor(){
        return color;
    }
    public String getLocation(){
        return location;
    }
}
