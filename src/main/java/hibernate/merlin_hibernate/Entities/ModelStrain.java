package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelStrain generated by hbm2java
 */
@Entity
@Table(name = "model_strain", catalog = "merlin_basic2")
public class ModelStrain implements java.io.Serializable {

	private Integer idstrain;
	private String name;

	public ModelStrain() {
	}

	public ModelStrain(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idstrain", unique = true, nullable = false)
	public Integer getIdstrain() {
		return this.idstrain;
	}

	public void setIdstrain(Integer idstrain) {
		this.idstrain = idstrain;
	}

	@Column(name = "name", length = 60)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}