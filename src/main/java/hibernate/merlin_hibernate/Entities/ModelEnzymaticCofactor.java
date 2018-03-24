package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelEnzymaticCofactor generated by hbm2java
 */
@Entity
@Table(name = "model_enzymatic_cofactor", catalog = "merlin_basic2")
public class ModelEnzymaticCofactor implements java.io.Serializable {

	private ModelEnzymaticCofactorId id;

	public ModelEnzymaticCofactor() {
	}

	public ModelEnzymaticCofactor(ModelEnzymaticCofactorId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "compoundIdcompound", column = @Column(name = "compound_idcompound", nullable = false)),
			@AttributeOverride(name = "proteinIdprotein", column = @Column(name = "protein_idprotein", nullable = false)),
			@AttributeOverride(name = "prosthetic", column = @Column(name = "prosthetic")) })
	public ModelEnzymaticCofactorId getId() {
		return this.id;
	}

	public void setId(ModelEnzymaticCofactorId id) {
		this.id = id;
	}

}