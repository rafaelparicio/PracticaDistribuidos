package tablonanuncios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Anuncio {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "idpersona")
 	private Persona autor;
   
	private String asunto;
	private String comentario;

	public Anuncio() {
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	
	public Persona getAutor() {
		return autor;
	}


	public void setAutor(Persona autor) {
		this.autor = autor;
	}


	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	@Override
	public String toString() {
		return "Anuncio [id=" + id + ", autor=" + autor + ", asunto=" + asunto + ", comentario=" + comentario + "]";
	}

}
