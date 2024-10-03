package generation.centropokemonoriente.models;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table (name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

            //restriscciones para la columna
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING) //se tomara atributo de una enum
    @Column(nullable = false)
    private TipoUsuario tipoUsuario;

    //atributos de auditoria: fecha de creacion y ultima edicion
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    /*******ESPACIO PARA OTROS ATRIBUTOS*********/

    //hibernate crea fk = llaves foraneas
    //relacion 1 a 1
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Doctor doctor;
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Paciente paciente;

    /********************************************/

    public Usuario() {

    }

    public Usuario(String email, String password, TipoUsuario USUARIO) {
        this.email = email;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }
}
