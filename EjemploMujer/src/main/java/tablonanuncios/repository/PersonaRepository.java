package tablonanuncios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tablonanuncios.model.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Long> {



	Persona findByUsuario(String usuario);
	
	//Obtiene la lista de personas ordenada por orden ascendente del atributo usuario
	List<Persona> findAllByOrderByUsuarioAsc();
}
