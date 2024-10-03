package generation.centropokemonoriente.controllers;

import generation.centropokemonoriente.repositories.DoctorRepository;
import generation.centropokemonoriente.services.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class DoctorController {
    @Autowired
    private DoctorServiceImpl doctorServiceImpl;
}
