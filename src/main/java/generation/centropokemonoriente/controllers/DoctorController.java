package generation.centropokemonoriente.controllers;

import generation.centropokemonoriente.models.Doctor;
import generation.centropokemonoriente.models.Usuario;
import generation.centropokemonoriente.services.DoctorServiceImpl;
import generation.centropokemonoriente.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller

//ruta base de controller
@RequestMapping("/doctor")

public class DoctorController {

    //llamo a service
    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

    @Autowired
    private UsuarioService usuarioService;

    //metodo get para mostrar vista llamada indexdoctores para ingresar a la ruta html
    // http://localhost:8081/doctor
    @GetMapping("/index")
    public String indexDoctores() {
        ArrayList <Doctor> lista = doctorServiceImpl.findAll();
        return "indexdoctores.html";
    }

    @GetMapping("/crear") // el @RequestParam sirve para traer un valor dinámico desde la ruta anterior
    public String mostrarFormularioDoctor(Model model, @RequestParam Long usuarioId) {
        Usuario usuario = usuarioService.findById(usuarioId);
        Doctor doctor = new Doctor();
        doctor.setUsuario(usuario);
        model.addAttribute("doctor", doctor);
        return "creardoctor.html";
    }

    @PostMapping("/crear")
    public String guardarDoctor(@ModelAttribute("doctor") Doctor doctorNuevo , Model model) {
        doctorServiceImpl.saveDoctor(doctorNuevo);
        return "indexdoctores.html";
    }
}
