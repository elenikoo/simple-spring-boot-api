package ge.ibsu.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CITY")
public class City {

    @Id
    @Column(name = "CITY_ID")
    private Long id;

    @Column(name = "CITY")
    private String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
