package model;

import java.util.Objects;
import java.util.regex.Pattern;

public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private final String emailregex="^(.+)@(.+).com$";
    private final Pattern pattern=Pattern.compile(emailregex);

    public String getFirstname()
    {
        return firstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public String getEmail()
    {
        return email;
    }
    public Customer(String firstname,String lastname,String email)
    {
        if(!pattern.matcher(email).matches())
        {
            throw new IllegalArgumentException(
                    "Please enter email in proper format"
            );
        }
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Customer other = (Customer) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }

        return true;
    }
    @Override
    public String toString() {
        return "name: "+firstname+" "+lastname+" email: "+email;
    }
}
