package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CompartmentsAnnotationCompartments generated by hbm2java
 */
@Entity
@Table(name = "compartments_annotation_compartments", catalog = "merlin_basic2")
public class CompartmentsAnnotationCompartments implements java.io.Serializable {

	private Integer id;
	private String name;
	private String abbreviation;

	public CompartmentsAnnotationCompartments() {
	}

	public CompartmentsAnnotationCompartments(String name, String abbreviation) {
		this.name = name;
		this.abbreviation = abbreviation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "abbreviation", length = 10)
	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

}