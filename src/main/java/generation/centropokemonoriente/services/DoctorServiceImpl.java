package generation.centropokemonoriente.services;

import generation.centropokemonoriente.models.Doctor;
import generation.centropokemonoriente.repositories.DoctorRepository;
import jakarta.transaction.Transactional;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class DoctorServiceImpl implements DoctorService {

    //dependencia injectada
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor findBy(Long id) {
        return null;
    }
}

