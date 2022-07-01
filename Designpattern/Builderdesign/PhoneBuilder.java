package Designpattern.Builderdesign;

public interface PhoneBuilder {
    public void buildOs();
    public void buildProcessor();
    public void buildRam();
    public void buildBattery();
    public void buildScreensize();
    public Phone getPhone();
}
