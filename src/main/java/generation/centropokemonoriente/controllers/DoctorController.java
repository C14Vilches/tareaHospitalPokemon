package generation.centropokemonoriente.controllers;

import generation.centropokemonoriente.repositories.DoctorRepository;
import generation.centropokemonoriente.services.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doctor")

public class DoctorController {
    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

    //metodo get para mostrar vista llamada indexdoctores para ingresar a la ruta html
    // http://localhost:8081/doctor
    @GetMapping("/index")
    public String indexDoctores() {
        return "indexdoctores.html";
    }
}
