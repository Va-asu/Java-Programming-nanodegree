package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerServices {
    private static  CustomerServices INSTANCE;
    private CustomerServices() {
    }

    public static CustomerServices getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CustomerServices();
        }

        return INSTANCE;
    }

    static ArrayList<Customer> customerList=new ArrayList<>();
   public void addCustomer(String firstname,String lastname,String email)
   {
        customerList.add(new Customer(firstname,lastname,email));
   }

   public Customer getCustomer(String customerEmail)
   {
       for(Customer c:customerList)
       {
          // System.out.println(c);
          if(c.getEmail().equals(customerEmail))
          {

             return c;
          }
       }
       return null;
   }

   public Collection<Customer> getAllCustomers()
   {
       return customerList;
   }

}
