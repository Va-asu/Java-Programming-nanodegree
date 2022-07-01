package Designpattern.Builderdesign;

public class Phone implements PhonePlan {
    private String os;
    private int ram;
    private String processor;
    private String screensize;
    private String battery;

    @Override
    public void setOs(String os) {
        this.os=os;
    }

    @Override
    public void setRam(int ram) {
         this.ram=ram;
    }

    @Override
    public void setProcessor(String processor) {
         this.processor=processor;
    }

    @Override
    public void Screensize(String screensize) {
        this.screensize=screensize;
    }

    @Override
    public void setBattery(String battery) {
        this.battery=battery;
    }

    public String toString()
    {
        return "Mobile details: os "+os+" battery "+battery+" screensize "+screensize+" processor "+processor+" ram "+ram;
    }
}
