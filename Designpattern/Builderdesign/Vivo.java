package Designpattern.Builderdesign;

public class Vivo implements PhoneBuilder{

    private Phone phone;

    public Vivo()
    {
        this.phone=new Phone();
    }
    @Override
    public void buildOs() {
        phone.setOs("XYZVivo");
    }

    @Override
    public void buildProcessor() {
        phone.setProcessor("abcVivo");
    }

    @Override
    public void buildRam() {
        phone.setRam(4);
    }

    @Override
    public void buildBattery() {
        phone.setBattery("lithium-abc");
    }

    @Override
    public void buildScreensize() {
        phone.Screensize("12 inch display");
    }

    @Override
    public Phone getPhone() {
        return this.phone;
    }
}
