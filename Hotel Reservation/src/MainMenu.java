

import api.AdminResource;
import api.HotelResource;
import model.Customer;
import model.IRoom;
import model.Reservation;



import java.text.*;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class MainMenu {
    public static void menu(){
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println("1. Find and Reserve a room");
        System.out.println("2. see my reservation");
        System.out.println("3. Create an account");
        System.out.println("4. Admin");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------");
        System.out.println("Please select a number from the main menu");
    }
    public static void showAvailableRooms(Collection<IRoom>availRooms) {
        System.out.println("here is the list of rooms available");
        for (IRoom i : availRooms) {
            System.out.println("Room no:" + i.getRoomNumber() + " is available , Price is: " + i.getRoomPrice() + " with " + i.getRoomType() + " occupancy");
        }
    }
    public static Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }


    public static void run() {
        System.out.println("Welcome to hotel reservation application");
        MainMenu.menu();
        Scanner scn=new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
            String str = scn.next();
            int n=-1;
            try {
                n=Integer.parseInt(str);
            }catch (Exception e)
            {
                System.out.println("Entered the non-valid number");
            }

            switch (n) {
                case 1 -> {
                    System.out.println("Find and reserve a room");



                    Date d1 = null;


                    Date d2 = null;
                    while(d1==null||d2==null){
                        if(d1==null)
                        {
                            System.out.println("Enter checkin Date mm/dd/yyyy example 02/23/2022 ");
                            String checkinDate = scn.next();
                            d1=getDate(d1,true,checkinDate);
                        }
                        if (d2==null){
                            System.out.println("Enter checkout Date mm/dd/yyyy example 02/28/2022 ");
                            String checkOutDate = scn.next();
                            d2 = getDate(d2, true, checkOutDate);
                        }

                        if(((d1!=null&&d2!=null)&&d1.compareTo(d2)>0))
                        {
                            System.out.println("Please enter the checkin and checkout date,\"checkin date should not be greater than checkout date\" ");
                            d1=null;
                            d2=null;
                        }
                        Date d=new Date();
                        if((d1!=null&&d2!=null)&&(d1.compareTo(d)<0||d2.compareTo(d)<0))
                        {
                            System.out.println("Dates should be today or todays onwards");
                            d1=null;
                            d2=null;
                        }
                    }


                    Collection<IRoom> availRooms = new HotelResource().findARoom(d1, d2);
                    Customer new_customer = null;
                    System.out.println("Do you have account wih us ");
                    String test = scn.next();
                    String emailtobook="";
                    if (test.charAt(0) == 'y') {
                        boolean b=true;
                        while(b||new_customer==null){
                            try{
                                System.out.println("Please enter you email :email@domain.com ");
                                emailtobook = scn.next();
                                new_customer= new AdminResource().getCustomer(emailtobook);
                                if(new_customer==null)
                                {
                                    System.out.println("customer with this email doesn't exist ,please enter right email: email@domain.com");
                                }

                                b=false;
                            }catch (Exception e)
                            {
                                System.out.println("here is the problem "+e);
                            }


                        }

                    }else{
                        boolean b=true;
                        while(b){
                            try{
                                System.out.println("Create an account");
                                System.out.println("Enter email format: email@domain.com");
                                emailtobook = scn.next();
                                System.out.println("Enter firstname:");
                                String fName = scn.next();
                                System.out.println("Enter lastName");
                                String sName = scn.next();
                                new HotelResource().createACustomer(emailtobook, fName, sName);
                                new_customer= new AdminResource().getCustomer(emailtobook);
                                b=false;
                            }catch (Exception e)
                            {
                                System.out.println(e);
                            }


                        }
                    }
                    if(availRooms.size()==0) {
                        System.out.println("Rooms are not available for now");
                        System.out.println("Here are suggestions for next week reservation");
                        d1=addDays(d1,7);
                        d2=addDays(d2,7);
                        availRooms = new HotelResource().findARoom(d1, d2);
                        if(availRooms.size()==0)
                        {
                            System.out.println("Sorry we don't have any vacant room right now");
                            break;
                        }
                        showAvailableRooms(availRooms);

                    }else {

                        showAvailableRooms(availRooms);


                    }

                    System.out.println("enter the room you want to book");
                    String roomNo = scn.next();

                    IRoom IRoomNo = new HotelResource().getRoom(roomNo);
                    if(availRooms.contains(IRoomNo)){
                        new HotelResource().bookARoom(emailtobook, IRoomNo, d1, d2);
                        System.out.println("Reservation");
                        
                        System.out.println("Name"+new_customer.getFirstname()+" "+new_customer.getLastname());
                        System.out.println("Room no: " + roomNo + " - " + IRoomNo.getRoomType());
                        System.out.println("Price: " + IRoomNo.getRoomPrice() + "$ per night");
                        System.out.println("Check in Date" + d1);
                        System.out.println("Check out Date" + d2);
                    }else{
                        System.out.println("sorry room you want to book is not available,please try again");
                    }

                    MainMenu.menu();
                }
                case 2 -> {
                    System.out.println("See my Reservation");
                    System.out.println("Enter your email: email@domain.com");
                    String emailtobook = scn.next();
                    Collection<Reservation>collection=new HotelResource().getCustomersReservation(emailtobook);
                    for(Reservation res:collection)
                    {
                        System.out.println(res);
                    }
                    
                    MainMenu.menu();
                }

                case 3 -> {
                    boolean b=true;
                    while(b){
                        try{
                            System.out.println("Create an account");
                            System.out.println("Enter email format: email@domain.com");
                            String customer_email = scn.next();
                            System.out.println("Enter firstname:");
                            String fName = scn.next();
                            System.out.println("Enter lastName:");
                            String sName = scn.next();
                            new HotelResource().createACustomer(customer_email, fName, sName);
                            b=false;
                        }catch (Exception e)
                        {
                            System.out.println(e);
                        }


                    }

                    MainMenu.menu();
                }
                case 4 -> {
                    System.out.println("Admin");
                    AdminMenu adInitials = new AdminMenu();
                    adInitials.run1();
                    MainMenu.menu();
                }
                case 5 -> {
                    System.out.println("Exit");
                    flag = false;
                }
                default -> System.out.println("Please select a number from the main menu");
            }


        }
    }

    private static Date getDate(Date d, boolean b, String checkinDate) {
        while(b){
            try {
                SimpleDateFormat sdformat = new SimpleDateFormat("MM/dd/yyyy");
                d = sdformat.parse(checkinDate);
                b=false;
            } catch (ParseException e) {
                System.out.println("Enter the date in \"MM/dd/yyyy\" format");
                d=null;
                break;
            }
        }
        return d;
    }
}
