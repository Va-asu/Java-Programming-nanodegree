package Designpattern.Builderdesign2;

public class PhoneBuilder implements Phone{

    private String os;
    private int Battery;
    private int size;
    private String processor;
    private int ram;
    @Override
    public Phone setOs(String os) {
        this.os=os;
        return this;
    }

    @Override
    public Phone setBattery(int val) {
        Battery=val;
        return this;
    }

    @Override
    public Phone SetScreensize(int size) {
        this.size=size;
        return this;
    }

    @Override
    public Phone setProcessor(String processor) {
        this.processor=processor;
        return this;
    }

    @Override
    public Phone setRam(int ram) {
        this.ram=ram;
        return this;
    }

    public Phone getPhone()
    {
        return this;
    }

    public String toString(){
        return "Mobile details [ os: "+os+", battery: "+Battery+", screensize: "+size+", processor: "+processor+", ram: "+ram+" ]";
    }
}
