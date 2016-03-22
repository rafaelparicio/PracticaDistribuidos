package tablonanuncios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tablonanuncios.model.Anuncio;


public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {

	List<Anuncio> findByAsunto(String asunto);

}
