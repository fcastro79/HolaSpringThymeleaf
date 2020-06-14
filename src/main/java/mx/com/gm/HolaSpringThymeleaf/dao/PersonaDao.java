package mx.com.gm.HolaSpringThymeleaf.dao;

import mx.com.gm.HolaSpringThymeleaf.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona,Long> {

}
