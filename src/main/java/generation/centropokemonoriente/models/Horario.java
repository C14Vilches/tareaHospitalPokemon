package generation.centropokemonoriente.models;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table (name= "horarios")
public class Horario {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalTime horaInicio;

    private LocalTime horaFin;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    public Horario() {

    }

    public Horario(LocalTime horaInicio, LocalTime horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public long getId() {
        return id;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}
