package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EnzymesAnnotationGenehomologyHasHomologues generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_genehomology_has_homologues", catalog = "merlin_basic2")
public class EnzymesAnnotationGenehomologyHasHomologues implements java.io.Serializable {

	private EnzymesAnnotationGenehomologyHasHomologuesId id;
	private String referenceId;
	private String gene;
	private Float evalue;
	private Float bits;

	public EnzymesAnnotationGenehomologyHasHomologues() {
	}

	public EnzymesAnnotationGenehomologyHasHomologues(EnzymesAnnotationGenehomologyHasHomologuesId id) {
		this.id = id;
	}

	public EnzymesAnnotationGenehomologyHasHomologues(EnzymesAnnotationGenehomologyHasHomologuesId id,
			String referenceId, String gene, Float evalue, Float bits) {
		this.id = id;
		this.referenceId = referenceId;
		this.gene = gene;
		this.evalue = evalue;
		this.bits = bits;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "geneHomologySKey", column = @Column(name = "geneHomology_s_key", nullable = false)),
			@AttributeOverride(name = "homologuesSKey", column = @Column(name = "homologues_s_key", nullable = false)) })
	public EnzymesAnnotationGenehomologyHasHomologuesId getId() {
		return this.id;
	}

	public void setId(EnzymesAnnotationGenehomologyHasHomologuesId id) {
		this.id = id;
	}

	@Column(name = "referenceID", length = 100)
	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	@Column(name = "gene", length = 100)
	public String getGene() {
		return this.gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	@Column(name = "eValue", precision = 12, scale = 0)
	public Float getEvalue() {
		return this.evalue;
	}

	public void setEvalue(Float evalue) {
		this.evalue = evalue;
	}

	@Column(name = "bits", precision = 12, scale = 0)
	public Float getBits() {
		return this.bits;
	}

	public void setBits(Float bits) {
		this.bits = bits;
	}

}
