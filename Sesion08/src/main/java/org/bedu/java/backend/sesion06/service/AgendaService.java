package org.bedu.java.backend.sesion06.service;

import org.bedu.java.backend.sesion06.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class AgendaService {

    private final ValidadorTelefono validadorTelefono;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public AgendaService(ValidadorTelefono validadorTelefono) {
        this.validadorTelefono = validadorTelefono;
    }

    @Transactional
    public Persona guardaPersona(Persona persona) {
        if (!validadorTelefono.isValido(persona.getTelefono())) {
            return null;
        }
        String telefono = validadorTelefono.limpiaNumero(persona.getTelefono());
        persona.setTelefono(telefono);
        entityManager.persist(persona);
        return persona;
    }

    public List<Persona> getPersonas() {
        return entityManager.createQuery("SELECT p FROM Persona p", Persona.class)
                .getResultList();
    }
}
