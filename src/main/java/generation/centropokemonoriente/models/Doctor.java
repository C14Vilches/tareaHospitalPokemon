package generation.centropokemonoriente.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.util.List;

@Entity
@Table(name = "doctores")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String especialidad;

    private Boolean atencionOnline;

    @CreationTimestamp
    private Timestamp creationDate;

    @UpdateTimestamp
    private Timestamp updateDate;

    /*******ESPACIO PARA OTROS ATRIBUTOS*********/

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Horario> horarios;

    @ManyToMany
    @JoinTable(
            name="especialidades_doctores",
            joinColumns = @JoinColumn(name="doctor_id"),
            inverseJoinColumns = @JoinColumn(name="especialidad_id"))
    private List<Especialidad> especialidades;

    /********************************************/

    public Doctor() {

    }

    public Doctor(String especialidad, Boolean atencionOnline) {
        this.especialidad = especialidad;
        this.atencionOnline = atencionOnline;
    }


}
