package sio.tp1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class TravaillerId implements Serializable {
    private static final long serialVersionUID = -8106687496942457862L;
    @Column(name = "codeEmploye", nullable = false)
    private Integer codeEmploye;

    @Column(name = "codeRayon", nullable = false)
    private Integer codeRayon;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TravaillerId entity = (TravaillerId) o;
        return Objects.equals(this.date, entity.date) &&
                Objects.equals(this.codeEmploye, entity.codeEmploye) &&
                Objects.equals(this.codeRayon, entity.codeRayon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, codeEmploye, codeRayon);
    }

}