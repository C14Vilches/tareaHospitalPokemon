package generation.centropokemonoriente.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name= "especialidades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @ManyToMany(mappedBy = "especialidades")
    private List<Doctor> listaDeDoctores;
}
