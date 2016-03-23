package tablon.model;

import java.util.Collection;
import java.util.Iterator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.hibernate.mapping.List;

@Entity
public class Especie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String tipo;
	private String nombreComun;
	private String nombreCientifico;
	private List areas;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCientifico() {
		return this.nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public List getAreas() {
		return this.areas;
	}

	public void setAreas(org.hibernate.mapping.List areas2) {
		this.areas = areas2;
	}
	
	
	public void addArea(Area area){
		((Collection<Area>) this.areas).add(area);
	}
	
	public void addArea(Collection<Area> areas){
		((Collection<Area>) this.areas).addAll(areas);
	}
	
	@Override
	public String toString() {
		String mainString;
		mainString = "Especie [Id: " + id + ", Tipo: " + tipo + ", NombreComun: " + this.nombreComun + ", Nombre Cientifico: " + this.nombreCientifico + "Areas: ";
		
		boolean firstPassed = false; //Para dejarlo bonito
		Iterator<Area> it = ((Collection<Area>) this.areas).iterator();
		while(it.hasNext()){
			if(!firstPassed){
				mainString += it.next().toString();
				firstPassed = true;
			}
			else
				mainString += ", " + it.next().toString();
		}
		mainString += "]";
		return mainString;
	}

}