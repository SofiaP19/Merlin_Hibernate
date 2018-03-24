package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelExperimentDescription generated by hbm2java
 */
@Entity
@Table(name = "model_experiment_description", catalog = "merlin_basic2")
public class ModelExperimentDescription implements java.io.Serializable {

	private ModelExperimentDescriptionId id;
	private String value;

	public ModelExperimentDescription() {
	}

	public ModelExperimentDescription(ModelExperimentDescriptionId id, String value) {
		this.id = id;
		this.value = value;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idexperiment", column = @Column(name = "idexperiment", nullable = false)),
			@AttributeOverride(name = "experimentDescriptionalFactorIdexperimentalFactor", column = @Column(name = "experiment_descriptional_factor_idexperimental_factor", nullable = false)) })
	public ModelExperimentDescriptionId getId() {
		return this.id;
	}

	public void setId(ModelExperimentDescriptionId id) {
		this.id = id;
	}

	@Column(name = "value", nullable = false)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
