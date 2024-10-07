package generation.centropokemonoriente.services;

import generation.centropokemonoriente.models.Doctor;
import generation.centropokemonoriente.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public interface DoctorService {

    Doctor findById(Long id);

    ArrayList<Doctor> findAll();

}
