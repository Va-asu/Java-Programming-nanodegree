package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import service.CustomerServices;
import service.ReservationService;

import java.util.Collection;
import java.util.Date;

public class HotelResource {
    CustomerServices Instance=CustomerServices.getInstance();
    ReservationService rInstance=ReservationService.getInstance();
    public Customer getCustomer(String email){
        return Instance.getCustomer(email);
    }
    public  void createACustomer(String email,String firstname,String lastname) {
        Instance.addCustomer(firstname,lastname,email);
    }
    public IRoom getRoom(String roomNumber) {
        return rInstance.getARoom(roomNumber);
    }
    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate,Date checkOutDate) {
        Customer new_customer=Instance.getCustomer(customerEmail);
        return rInstance.reserveARoom(new_customer,room,checkInDate,checkOutDate);
    }
    public Collection<Reservation> getCustomersReservation(String customerEmail) {
        Customer new_customer=Instance.getCustomer(customerEmail);
        return rInstance.getCustomerReservation(new_customer);
    }
    public Collection<IRoom> findARoom(Date checkIn,Date checkOut) {
        return rInstance.findRooms(checkIn,checkOut);
    }
}
