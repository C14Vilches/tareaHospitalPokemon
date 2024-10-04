package generation.centropokemonoriente.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table (name= "horarios")
public class Horario {

    @Getter
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @Getter
    private LocalTime horaInicio;

    @Setter
    @Getter
    private LocalTime horaFin;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    public Horario() {

    }

    public Horario(LocalTime horaInicio, LocalTime horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

}
