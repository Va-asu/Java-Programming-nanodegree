import api.AdminResource;
import api.HotelResource;
import model.*;
import service.CustomerServices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class AdminMenu {

    public static void menu(){
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println("1. See all Customers");
        System.out.println("2. See all Rooms");
        System.out.println("3. See all Reservation");
        System.out.println("4. Add a Room");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------");
        System.out.println("Please select a number from the main menu");
    }
    public static void run1() {
        System.out.println("Welcome to Admin section application");

        AdminMenu.menu();
        Scanner scn=new Scanner(System.in);
        boolean flag=true;
        while(flag==true)
        {
            String str = scn.next();
            int n=-1;
            try {
                n=Integer.parseInt(str);
            }catch (Exception e)
            {
                System.out.println("Entered the non-valid number");
            }
            switch(n){
                case 1:
                    System.out.println("See all Customers");
                    Collection<Customer> list=new AdminResource().getAllCustomers();
                    if(list.size()==0)
                    {
                        System.out.println("nothing to show");
                    }
                    for(Customer c:list)
                    {
                        System.out.println(c);
                    }
                    AdminMenu.menu();
                    break;
                case 2:
                    System.out.println("See all Rooms");
                    Collection<IRoom>roomCollections=new AdminResource().getAllRooms();

                    for(IRoom Iroom:roomCollections)
                    {
                        System.out.println(Iroom);
                    }
                    AdminMenu.menu();
                    break;
                case 3:
                    System.out.println("See all Reservation");
                    new AdminResource().displayAllReservations();
                    AdminMenu.menu();
                    break;
                case 4:
                    System.out.println("Add a Room");
                    boolean test=true;
                    List<IRoom> rList=new ArrayList<>();
                    while(test==true){
                        System.out.println("Enter the room number");
                        String RNo=scn.next();
                        boolean flag1=false;
                        Collection<IRoom>roomCol=new AdminResource().getAllRooms();


                        for(IRoom roomlist:roomCol)
                        {
                            if(roomlist.getRoomNumber().equals(RNo))
                            {
                                flag1=true;
                                System.out.println("this room is already registered");
                                System.out.println("register other room");
                                System.out.println("please try again");
                            }
                        }


                        if(!flag1)
                        {
                            System.out.println("Enter price for room");
                            double price=scn.nextDouble();
                            System.out.println("Enter room type: 1 for single bed, 2 for double bed");
                            int val=scn.nextInt();
                            Room room1;
                            if(val==1)
                            {
                                room1 = new Room(RNo, price, RoomType.SINGLE);
                            }else{
                                room1 = new Room(RNo, price, RoomType.DOUBLE);
                            }
                            flag1=false;
                            for(IRoom room:rList)
                            {
                                if(room.getRoomNumber().equals(room1.getRoomNumber()))
                                {
                                    flag1=true;
                                    System.out.println("this room is already registered");
                                    System.out.println("register other room");
                                    System.out.println("please try again");
                                }
                            }
                            if(!flag1){
                                rList.add(room1);
                            }

                        }

                        System.out.println("Would you like to add another room n/y");
                        String ch=scn.next();
                        if(ch.charAt(0)=='n')
                        {
                            test=false;
                        }
                    }
                    System.out.println(rList);
                    new AdminResource().addRoom(rList);
                    AdminMenu.menu();
                    break;
                case 5:

                    System.out.println("Back to Main Menu");
                    flag=false;
                    break;
                default:
                    System.out.println("Please select a number from the main menu");
                    break;
            }
        }
    }
}
