package Designpattern.Builderdesign;

public class ConstructPhone {
    private PhoneBuilder pb;
    public ConstructPhone(PhoneBuilder pb)
    {
        this.pb=pb;
    }

    public Phone getPhone()
    {
        return this.pb.getPhone();
    }

    public void ConstructPhone()
    {
        this.pb.buildOs();
        this.pb.buildBattery();
        this.pb.buildProcessor();
        this.pb.buildRam();
        this.pb.buildScreensize();
    }
}
