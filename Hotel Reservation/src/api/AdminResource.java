package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import service.CustomerServices;
import service.ReservationService;

import java.util.Collection;
import java.util.List;

public class AdminResource {

    CustomerServices Instance=CustomerServices.getInstance();
    ReservationService rInstance=ReservationService.getInstance();
    public Customer getCustomer(String email)
    {
        return Instance.getCustomer(email);
    }

    public void addRoom(List<IRoom> rooms)
    {
        for(IRoom room:rooms) {
            rInstance.addRoom(room);
        }
    }

    public Collection<IRoom> getAllRooms()
    {
        return rInstance.roomList.keySet();
    }

    public Collection<Customer> getAllCustomers()
    {
        return Instance.getAllCustomers();
    }


    public void displayAllReservations(){
        rInstance.printAllReservation();
    }
}
