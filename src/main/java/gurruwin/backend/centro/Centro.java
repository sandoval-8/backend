package gurruwin.backend.centro;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import gurruwin.backend.persona.Persona;

@Entity
@Table(name = "centros")
public class Centro {
	
	@Id
	@Column(name = "id_centro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre_centro")
	private String nombre;

	@JoinTable(
	        name = "centros_personal",
	        joinColumns = @JoinColumn(name = "centro_id"),
	        inverseJoinColumns = @JoinColumn(name="personal_id")
	    )
	@OneToMany(cascade = CascadeType.ALL)
	private List<Persona> personal;
	
//--------------------------------------------------------------------
	
	public Centro(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Persona> personal) {
		this.personal = personal;
	}

}
