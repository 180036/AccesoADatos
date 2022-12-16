package primero;
// Generated 3 nov 2022 9:34:53 by Hibernate Tools 5.4.33.Final

/**
 * Socio generated by hbm2java
 */
public class Socio implements java.io.Serializable {

	private int socioId;
	private String nombre;
	private Integer estatura;
	private Integer edad;
	private String localidad;

	public Socio() {
	}

	public Socio(int socioId) {
		this.socioId = socioId;
	}

	public Socio(int socioId, String nombre, Integer estatura, Integer edad, String localidad) {
		this.socioId = socioId;
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
		this.localidad = localidad;
	}

	public int getSocioId() {
		return this.socioId;
	}

	public void setSocioId(int socioId) {
		this.socioId = socioId;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEstatura() {
		return this.estatura;
	}

	public void setEstatura(Integer estatura) {
		this.estatura = estatura;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
