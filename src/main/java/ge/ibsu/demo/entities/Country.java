package ge.ibsu.demo.entities;

<<<<<<< HEAD
import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @SequenceGenerator(name = "country_country_id_seq", sequenceName = "country_country_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_country_id_seq")
    @Column(name = "country_id")
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "last_update")
    private String lastUpdate;

=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @Column(name = "COUNTRY_ID")
    private Long id;

    @Column(name = "COUNTRY")
    private String country;

>>>>>>> 545224674a9835e550928842bd00c572d2be29cd
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
<<<<<<< HEAD

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
=======
>>>>>>> 545224674a9835e550928842bd00c572d2be29cd
}
