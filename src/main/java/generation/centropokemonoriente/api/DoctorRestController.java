package generation.centropokemonoriente.api;

import generation.centropokemonoriente.models.Doctor;
import generation.centropokemonoriente.services.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class DoctorRestController {

    @Autowired //injeccion solo como ejemplo
    private DoctorServiceImpl doctorServiceImpl;

    @GetMapping("/doctor")
    public Doctor findDoctorById(@RequestParam Long id) {
        //modelo //nombre de variable //servicio     //metodo
        Doctor doctorSelecionado = doctorServiceImpl.findById(id);
        System.out.println(doctorSelecionado);
        return doctorServiceImpl.findById(id);
    }
}
