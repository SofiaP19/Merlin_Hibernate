package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelPathway generated by hbm2java
 */
@Entity
@Table(name = "model_pathway", catalog = "merlin_basic2")
public class ModelPathway implements java.io.Serializable {

	private Integer idpathway;
	private String code;
	private String name;
	private String pathSbmlFile;
	private byte[] image;

	public ModelPathway() {
	}

	public ModelPathway(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public ModelPathway(String code, String name, String pathSbmlFile, byte[] image) {
		this.code = code;
		this.name = name;
		this.pathSbmlFile = pathSbmlFile;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idpathway", unique = true, nullable = false)
	public Integer getIdpathway() {
		return this.idpathway;
	}

	public void setIdpathway(Integer idpathway) {
		this.idpathway = idpathway;
	}

	@Column(name = "code", nullable = false, length = 5)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", nullable = false, length = 120)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "path_sbml_file", length = 200)
	public String getPathSbmlFile() {
		return this.pathSbmlFile;
	}

	public void setPathSbmlFile(String pathSbmlFile) {
		this.pathSbmlFile = pathSbmlFile;
	}

	@Column(name = "image")
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
