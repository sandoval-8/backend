package gurruwin.backend.persona;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import gurruwin.backend.centro.Centro;

@Entity
@Table(name = "personas")
public class Persona implements Serializable{

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	@Column
	private String apellidos;

/*	@OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
	private List<Centro> centro = new ArrayList<Centro>(); */
	
	@OneToOne
	private Centro centro;

//--------------------------------------------------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

/*	public List<Centro> getCentro() {
		return centro;
	}

	public void setCentro(List<Centro> centro) {
		this.centro = centro;
	} */

}
