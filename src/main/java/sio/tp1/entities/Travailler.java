package sio.tp1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "travailler")
public class Travailler {
    @EmbeddedId
    private TravaillerId id;

    @MapsId("codeEmploye")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codeEmploye", nullable = false)
    private Employe codeEmploye;

    @MapsId("codeRayon")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codeRayon", nullable = false)
    private Rayon codeRayon;

    @ColumnDefault("0")
    @Column(name = "temps", nullable = false)
    private Integer temps;

}