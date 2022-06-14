package service;

import model.Customer;
import model.IRoom;
import model.Reservation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

public class ReservationService {
    private static  ReservationService rINSTANCE;
    private ReservationService() {
    }

    public static ReservationService getInstance() {
        if(rINSTANCE == null) {
            rINSTANCE = new ReservationService();
        }

        return rINSTANCE;
    }
    public static ArrayList<Reservation> resCollection=new ArrayList<>();
    public static HashMap<IRoom,ArrayList<Date[]>> roomList=new HashMap<>();
    public void addRoom(IRoom room) {
        roomList.put(room,new ArrayList<>());
    }

    public IRoom getARoom(String roomId) {

        for(IRoom room1:roomList.keySet())
        {
            if(room1.getRoomNumber().equals(roomId))
            {
               return room1;
            }
        }
       return null;
    }

     public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate)
    {
        Reservation r1=new Reservation(customer,room,checkInDate,checkOutDate);
        ArrayList<Date[]> list;
        if(roomList.containsKey(room))
        {
            list = roomList.get(room);
        }else{
            list = new ArrayList<>();
        }
        list.add(new Date[] {checkInDate,checkOutDate});
        roomList.put(room,list);

        resCollection.add(r1);
        return r1;
    }
    public Collection<IRoom> findRooms(Date checkInDate,Date checkOutDate)
    {
        ArrayList<IRoom>fRoom=new ArrayList<>();
        for(IRoom rms:roomList.keySet())
        {
            ArrayList<Date[]>arr=roomList.get(rms);
            if(arr.size()==0)
            {
                fRoom.add(rms);

            }else{
                boolean flag=false;
                flag=checkDates(arr,flag,checkInDate,checkOutDate);
                if(!flag)
                {
                    fRoom.add(rms);
                }
            }


        }
        return  fRoom;
    }
    boolean checkDates(ArrayList<Date[]>arr,boolean flag,Date checkInDate,Date checkOutDate)
    {

        for(Date[] dts:arr)
        {
            if((dts[0].compareTo(checkInDate)>=0 && dts[0].compareTo(checkOutDate)<=0)||(dts[1].compareTo(checkInDate)>=0 && dts[1].compareTo(checkOutDate)<=0)||(dts[0].compareTo(checkInDate)>=0 && dts[1].compareTo(checkOutDate)<=0)||(dts[0].compareTo(checkInDate)<=0 && dts[1].compareTo(checkOutDate)>=0))
            {
                flag=true;
                break;
            }
        }
        return flag;
    }

    public Collection<Reservation> getCustomerReservation(Customer customer)
    {
        ArrayList<Reservation>fRes=new ArrayList<>();
        for(Reservation res: resCollection)
        {
            if(res.getCustomer()==customer)
            {
                fRes.add(res);
            }
        }
        return fRes;
    }
    public void printAllReservation()
    {
         for(Reservation r:resCollection)
         {
             System.out.println(r);
         }
    }

}
