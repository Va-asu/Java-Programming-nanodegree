package Designpattern.Builderdesign;

public class Client {
    public static void main(String[] args) {

        PhoneBuilder mi6=new Vivo();
        ConstructPhone cp=new ConstructPhone(mi6);

        cp.ConstructPhone();
        Phone phone=cp.getPhone();
        System.out.println(phone);

    }
}
