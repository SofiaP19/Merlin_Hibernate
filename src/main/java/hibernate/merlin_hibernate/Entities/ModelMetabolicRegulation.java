package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelMetabolicRegulation generated by hbm2java
 */
@Entity
@Table(name = "model_metabolic_regulation", catalog = "merlin_basic2")
public class ModelMetabolicRegulation implements java.io.Serializable {

	private ModelMetabolicRegulationId id;
	private Character mode;
	private String mechanism;

	public ModelMetabolicRegulation() {
	}

	public ModelMetabolicRegulation(ModelMetabolicRegulationId id) {
		this.id = id;
	}

	public ModelMetabolicRegulation(ModelMetabolicRegulationId id, Character mode, String mechanism) {
		this.id = id;
		this.mode = mode;
		this.mechanism = mechanism;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "compoundIdcompound", column = @Column(name = "compound_idcompound", nullable = false)),
			@AttributeOverride(name = "proteinIdprotein", column = @Column(name = "protein_idprotein", nullable = false)) })
	public ModelMetabolicRegulationId getId() {
		return this.id;
	}

	public void setId(ModelMetabolicRegulationId id) {
		this.id = id;
	}

	@Column(name = "mode", length = 1)
	public Character getMode() {
		return this.mode;
	}

	public void setMode(Character mode) {
		this.mode = mode;
	}

	@Column(name = "mechanism", length = 25)
	public String getMechanism() {
		return this.mechanism;
	}

	public void setMechanism(String mechanism) {
		this.mechanism = mechanism;
	}

}
