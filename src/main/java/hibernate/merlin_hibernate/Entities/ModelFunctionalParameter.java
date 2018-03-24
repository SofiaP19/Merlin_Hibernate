package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelFunctionalParameter generated by hbm2java
 */
@Entity
@Table(name = "model_functional_parameter", catalog = "merlin_basic2")
public class ModelFunctionalParameter implements java.io.Serializable {

	private ModelFunctionalParameterId id;
	private Float parameterValue;

	public ModelFunctionalParameter() {
	}

	public ModelFunctionalParameter(ModelFunctionalParameterId id) {
		this.id = id;
	}

	public ModelFunctionalParameter(ModelFunctionalParameterId id, Float parameterValue) {
		this.id = id;
		this.parameterValue = parameterValue;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "compoundIdcompound", column = @Column(name = "compound_idcompound", nullable = false)),
			@AttributeOverride(name = "proteinIdprotein", column = @Column(name = "protein_idprotein", nullable = false)),
			@AttributeOverride(name = "parameterType", column = @Column(name = "parameter_type", nullable = false, length = 50)) })
	public ModelFunctionalParameterId getId() {
		return this.id;
	}

	public void setId(ModelFunctionalParameterId id) {
		this.id = id;
	}

	@Column(name = "parameter_value", precision = 12, scale = 0)
	public Float getParameterValue() {
		return this.parameterValue;
	}

	public void setParameterValue(Float parameterValue) {
		this.parameterValue = parameterValue;
	}

}