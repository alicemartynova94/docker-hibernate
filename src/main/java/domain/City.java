package domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(schema = "world", name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "population", nullable = false)
    private Integer population;

}
