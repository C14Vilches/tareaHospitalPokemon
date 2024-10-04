package generation.centropokemonoriente.controllers;

import generation.centropokemonoriente.models.Paciente;
import generation.centropokemonoriente.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PacienteController {

    @Autowired //no necesario pero para hacer ejemplo
    private PacienteService pacienteService;

    @GetMapping("/lista")
    public List<Paciente> listarPacientes(){
        //necesitamos la logica para buscar la lista de pacientes en la DB
        return pacienteService.findAllPaciente();
    }
}
