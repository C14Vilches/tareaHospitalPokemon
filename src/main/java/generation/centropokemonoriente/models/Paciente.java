package generation.centropokemonoriente.models;

import jakarta.persistence.*;
import lombok.*;

//anotacion para que JPA sepa que tablas vamos a usar, objetos, etc
@Entity
@Table(name="pacientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Paciente{
    //primary key
    @Id
    //como se va a generar esa ID
    //generar valor (estrategia = tipo de generacion.identidad)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_paciente")
    private String nombre;
    @Column(name = "apellido_paciente")
    private String apellido;

    //sobreescribe funcionamiento del metodo

    /*******ESPACIO PARA OTROS ATRIBUTOS*********/

    //hibernate crea fk = llaves foraneas
    //relacion 1 a 1
    @OneToOne
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;

    /*  -   -   -   -   -   -   -   -   -   -   -*/
}