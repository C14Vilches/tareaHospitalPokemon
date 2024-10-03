package generation.centropokemonoriente.repositories;

import generation.centropokemonoriente.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //springboot toma interfaz como componente, es injectable en otras capas (es una dependencia por capas)
                                                                //dato de PK
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    //clase Jpa Repository contiene metodos para hacer CRUD
    //repositorios son inferfaces porque solo definen metodos, no definen atributos
    Doctor findByName(String name);

}
