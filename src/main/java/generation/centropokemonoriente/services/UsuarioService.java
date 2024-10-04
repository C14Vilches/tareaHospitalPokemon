package generation.centropokemonoriente.services;

import generation.centropokemonoriente.models.Usuario;
import generation.centropokemonoriente.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findById(Long id){
        return usuarioRepository.findById(id).get();
    }

    public Usuario saveusuario(Usuario usuarioNuevo) {
        return usuarioRepository.save(usuarioNuevo);
    }
}
