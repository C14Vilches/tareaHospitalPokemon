package generation.centropokemonoriente.models;

import jakarta.persistence.*;

//anotacion para que JPA sepa que tablas vamos a usar, objetos, etc
@Entity
@Table(name="pacientes")

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
    public Paciente (){
    }

    /*El orden sería:
    declaración de atributos
    constructor vacío
    constructor lleno
    getter id
    getters and setters para el resto de los atributos
    toString con todos los atributos*/

    public Paciente(int id, String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //sobreescribe funcionamiento del metodo

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    /*******ESPACIO PARA OTROS ATRIBUTOS*********/

    //hibernate crea fk = llaves foraneas
    //relacion 1 a 1
    @OneToOne
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;

    /********************************************/

}