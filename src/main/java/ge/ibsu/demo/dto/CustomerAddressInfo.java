package ge.ibsu.demo.dto;

public class CustomerAddressInfo {
    private String firstName;
    private String lastName;
    private String street;
<<<<<<< HEAD

    private String city;
    private String country;

    public CustomerAddressInfo(){}
=======
    private String city;
    private String country;

    public CustomerAddressInfo() {
    }
>>>>>>> 545224674a9835e550928842bd00c572d2be29cd

    public CustomerAddressInfo(String firstName, String lastName, String street, String city, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
