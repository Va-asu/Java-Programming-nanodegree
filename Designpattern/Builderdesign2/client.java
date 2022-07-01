package Designpattern.Builderdesign2;

public class client {
    public static void main(String[] args) {
        Phone p1=new PhoneBuilder().setBattery(3000).setOs("Android").setRam(4).getPhone();
        System.out.println(p1);
        Phone p2=new PhoneBuilder().SetScreensize(12).setBattery(3000).setOs("ios").setRam(8).getPhone();
        System.out.println(p2);
    }
}
