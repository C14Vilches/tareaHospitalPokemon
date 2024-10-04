package generation.centropokemonoriente.services;

import generation.centropokemonoriente.models.Paciente;
import generation.centropokemonoriente.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository; //instancia de clase

    public Paciente findbyId(Long id) {
        return pacienteRepository.findById(id).get();
    }

    public Paciente savePaciente(Paciente nuevopaciente) {
        return pacienteRepository.save(nuevopaciente);
    }

    public List<Paciente> findAllPaciente () {
        return pacienteRepository.findAll();
    }
}
