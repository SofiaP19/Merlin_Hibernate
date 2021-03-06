package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelPromoter generated by hbm2java
 */
@Entity
@Table(name = "model_promoter", catalog = "merlin_basic2")
public class ModelPromoter implements java.io.Serializable {

	private Integer idpromoter;
	private String name;
	private Double absolutePosition;

	public ModelPromoter() {
	}

	public ModelPromoter(String name, Double absolutePosition) {
		this.name = name;
		this.absolutePosition = absolutePosition;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idpromoter", unique = true, nullable = false)
	public Integer getIdpromoter() {
		return this.idpromoter;
	}

	public void setIdpromoter(Integer idpromoter) {
		this.idpromoter = idpromoter;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "absolute_position", precision = 22, scale = 0)
	public Double getAbsolutePosition() {
		return this.absolutePosition;
	}

	public void setAbsolutePosition(Double absolutePosition) {
		this.absolutePosition = absolutePosition;
	}

}
