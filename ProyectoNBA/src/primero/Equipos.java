package primero;
// Generated 3 nov 2022 9:24:43 by Hibernate Tools 5.4.33.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Equipos generated by hbm2java
 */
public class Equipos implements java.io.Serializable {

	private String nombre;
	private String ciudad;
	private String conferencia;
	private String division;
	private Set jugadoreses = new HashSet(0);
	private Set partidosesForEquipoVisitante = new HashSet(0);
	private Set partidosesForEquipoLocal = new HashSet(0);

	public Equipos() {
	}

	public Equipos(String nombre) {
		this.nombre = nombre;
	}

	public Equipos(String nombre, String ciudad, String conferencia, String division, Set jugadoreses,
			Set partidosesForEquipoVisitante, Set partidosesForEquipoLocal) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.conferencia = conferencia;
		this.division = division;
		this.jugadoreses = jugadoreses;
		this.partidosesForEquipoVisitante = partidosesForEquipoVisitante;
		this.partidosesForEquipoLocal = partidosesForEquipoLocal;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getConferencia() {
		return this.conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Set getJugadoreses() {
		return this.jugadoreses;
	}

	public void setJugadoreses(Set jugadoreses) {
		this.jugadoreses = jugadoreses;
	}

	public Set getPartidosesForEquipoVisitante() {
		return this.partidosesForEquipoVisitante;
	}

	public void setPartidosesForEquipoVisitante(Set partidosesForEquipoVisitante) {
		this.partidosesForEquipoVisitante = partidosesForEquipoVisitante;
	}

	public Set getPartidosesForEquipoLocal() {
		return this.partidosesForEquipoLocal;
	}

	public void setPartidosesForEquipoLocal(Set partidosesForEquipoLocal) {
		this.partidosesForEquipoLocal = partidosesForEquipoLocal;
	}
	

}
