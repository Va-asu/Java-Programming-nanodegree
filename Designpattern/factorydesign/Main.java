package Designpattern.factorydesign;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String typeOfRing=" ";

        ClassFactory cf=new ClassFactory();
        Ring obj=cf.handleRing(typeOfRing);
        obj.showRing();
    }
}
