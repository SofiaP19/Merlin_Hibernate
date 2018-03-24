package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelSigmaPromoter generated by hbm2java
 */
@Entity
@Table(name = "model_sigma_promoter", catalog = "merlin_basic2")
public class ModelSigmaPromoter implements java.io.Serializable {

	private ModelSigmaPromoterId id;

	public ModelSigmaPromoter() {
	}

	public ModelSigmaPromoter(ModelSigmaPromoterId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "proteinIdprotein", column = @Column(name = "protein_idprotein", nullable = false)),
			@AttributeOverride(name = "promoterIdpromoter", column = @Column(name = "promoter_idpromoter", nullable = false)) })
	public ModelSigmaPromoterId getId() {
		return this.id;
	}

	public void setId(ModelSigmaPromoterId id) {
		this.id = id;
	}

}
