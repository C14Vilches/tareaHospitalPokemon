package generation.centropokemonoriente.controllers;

import generation.centropokemonoriente.models.TipoUsuario;
import generation.centropokemonoriente.models.Usuario;
import generation.centropokemonoriente.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/menu")
    public String mostarMenu() {
        return "index.html";
    }

    @GetMapping("/crear")                        //nombre del modelo
    public String mostrarFormularioRegistro(Model model) { //model es interfaz UI de JAVA (no es visual)
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("tipoUsuario", TipoUsuario.values());
        return "registrousuario";
    }

    @PostMapping("/crear")
    public String guardarUsuarioCreado(@ModelAttribute Usuario usuarioNuevo, Model model) {
        usuarioService.saveusuario(usuarioNuevo);
        return "redirect:/usuario/menu";
    }

    //redirigir al usuario adecuado
//    if (usuarioNuevo.getTipoUsuario() == TipoUsuario.DOCTOR){
//        return "redirect:/doctor/crear?usuarioid=" + usuarioNuevo
//    }
}
