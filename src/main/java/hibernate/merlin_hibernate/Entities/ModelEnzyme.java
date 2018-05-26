package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelEnzyme generated by hbm2java
 */
@Entity
@Table(name = "model_enzyme", catalog = "merlin_basic2")
public class ModelEnzyme implements java.io.Serializable {

	private ModelEnzymeId id;
	private Float optimalPh;
	private String posttranslationalModification;
	private Boolean inModel;
	private String source;

	public ModelEnzyme() {
	}

	public ModelEnzyme(ModelEnzymeId id) {
		this.id = id;
	}

	public ModelEnzyme(ModelEnzymeId id, Float optimalPh, String posttranslationalModification, Boolean inModel,
			String source) {
		this.id = id;
		this.optimalPh = optimalPh;
		this.posttranslationalModification = posttranslationalModification;
		this.inModel = inModel;
		this.source = source;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "ecnumber", column = @Column(name = "ecnumber", nullable = false, length = 15)),
			@AttributeOverride(name = "proteinIdprotein", column = @Column(name = "protein_idprotein", nullable = false)) })
	public ModelEnzymeId getId() {
		return this.id;
	}

	public void setId(ModelEnzymeId id) {
		this.id = id;
	}

	@Column(name = "optimal_ph", precision = 12, scale = 0)
	public Float getOptimalPh() {
		return this.optimalPh;
	}

	public void setOptimalPh(Float optimalPh) {
		this.optimalPh = optimalPh;
	}

	@Column(name = "posttranslational_modification", length = 100)
	public String getPosttranslationalModification() {
		return this.posttranslationalModification;
	}

	public void setPosttranslationalModification(String posttranslationalModification) {
		this.posttranslationalModification = posttranslationalModification;
	}

	@Column(name = "inModel")
	public Boolean getInModel() {
		return this.inModel;
	}

	public void setInModel(Boolean inModel) {
		this.inModel = inModel;
	}

	@Column(name = "source", length = 45)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
