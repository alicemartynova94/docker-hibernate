package domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity
@Table(schema = "world", name = "country_language")
@Data
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(name = "language", nullable = false)
    private String language;

    @Column(name = "is_official", columnDefinition = "BIT", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isOfficial;

    @Column(name = "percentage", nullable = false)
    private BigDecimal percentage;
}
