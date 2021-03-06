package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelPathwayHasEnzyme generated by hbm2java
 */
@Entity
@Table(name = "model_pathway_has_enzyme", catalog = "merlin_basic2")
public class ModelPathwayHasEnzyme implements java.io.Serializable {

	private ModelPathwayHasEnzymeId id;

	public ModelPathwayHasEnzyme() {
	}

	public ModelPathwayHasEnzyme(ModelPathwayHasEnzymeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "pathwayIdpathway", column = @Column(name = "pathway_idpathway", nullable = false)),
			@AttributeOverride(name = "enzymeEcnumber", column = @Column(name = "enzyme_ecnumber", nullable = false, length = 15)),
			@AttributeOverride(name = "enzymeProteinIdprotein", column = @Column(name = "enzyme_protein_idprotein", nullable = false)) })
	public ModelPathwayHasEnzymeId getId() {
		return this.id;
	}

	public void setId(ModelPathwayHasEnzymeId id) {
		this.id = id;
	}

}
