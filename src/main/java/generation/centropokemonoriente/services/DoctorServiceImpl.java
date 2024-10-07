package generation.centropokemonoriente.services;

import generation.centropokemonoriente.models.Doctor;
import generation.centropokemonoriente.repositories.DoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional

public class DoctorServiceImpl implements DoctorService {

    //annotation
    @Autowired
    //dependencia injectada
    private DoctorRepository doctorRepository;

    @Override
    //
    public Doctor findById(Long id) {
        return doctorRepository.findById(id).get(); //TODO: ispresent() check
    }

    @Override
    public ArrayList<Doctor> findAll() {
        return (ArrayList) doctorRepository.findAll();
    }

    @Transactional
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    //La anotación @Transactional se utiliza para marcar un métod0 o una clase como transaccional, lo que significa que cualquier operación de base de datos realizada dentro del métod0 o clase marcado se ejecutará dentro de una transacción. Si la transacción tiene éxito, los cambios se confirmarán en la base de datos. Si se produce un error y la transacción se revierte, los cambios no se guardarán en la base de datos.
}

