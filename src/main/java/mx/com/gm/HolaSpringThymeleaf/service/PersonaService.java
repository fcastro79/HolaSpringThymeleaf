package mx.com.gm.HolaSpringThymeleaf.service;

import mx.com.gm.HolaSpringThymeleaf.domain.Persona;

import java.util.List;

public interface PersonaService {
    public List<Persona> listarPersonas();

    public void guardar (Persona persona);

    public void eliminar (Persona persona);

    public Persona encontrar(Persona persona);
}
