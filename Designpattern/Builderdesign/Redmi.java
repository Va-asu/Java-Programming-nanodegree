package Designpattern.Builderdesign;

public class Redmi implements PhoneBuilder{

    private Phone phone;

    public Redmi()
    {
        this.phone=new Phone();
    }
    @Override
    public void buildOs() {
         phone.setOs("XYZ");
    }

    @Override
    public void buildProcessor() {
          phone.setProcessor("abc");
    }

    @Override
    public void buildRam() {
        phone.setRam(2);
    }

    @Override
    public void buildBattery() {
        phone.setBattery("lithium");
    }

    @Override
    public void buildScreensize() {
        phone.Screensize("16 inch display");
    }

    @Override
    public Phone getPhone() {
        return this.phone;
    }
}
