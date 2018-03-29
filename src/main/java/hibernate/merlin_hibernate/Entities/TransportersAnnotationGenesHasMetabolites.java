package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TransportersAnnotationGenesHasMetabolites generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_genes_has_metabolites", catalog = "merlin_basic2")
public class TransportersAnnotationGenesHasMetabolites implements java.io.Serializable {

	private TransportersAnnotationGenesHasMetabolitesId id;
	private float similarityScoreSum;
	private float taxonomyScoreSum;
	private int frequency;

	public TransportersAnnotationGenesHasMetabolites() {
	}

	public TransportersAnnotationGenesHasMetabolites(TransportersAnnotationGenesHasMetabolitesId id,
			float similarityScoreSum, float taxonomyScoreSum, int frequency) {
		this.id = id;
		this.similarityScoreSum = similarityScoreSum;
		this.taxonomyScoreSum = taxonomyScoreSum;
		this.frequency = frequency;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "geneId", column = @Column(name = "gene_id", nullable = false)),
			@AttributeOverride(name = "metaboliteId", column = @Column(name = "metabolite_id", nullable = false)) })
	public TransportersAnnotationGenesHasMetabolitesId getId() {
		return this.id;
	}

	public void setId(TransportersAnnotationGenesHasMetabolitesId id) {
		this.id = id;
	}

	@Column(name = "similarity_score_sum", nullable = false, precision = 12, scale = 0)
	public float getSimilarityScoreSum() {
		return this.similarityScoreSum;
	}

	public void setSimilarityScoreSum(float similarityScoreSum) {
		this.similarityScoreSum = similarityScoreSum;
	}

	@Column(name = "taxonomy_score_sum", nullable = false, precision = 12, scale = 0)
	public float getTaxonomyScoreSum() {
		return this.taxonomyScoreSum;
	}

	public void setTaxonomyScoreSum(float taxonomyScoreSum) {
		this.taxonomyScoreSum = taxonomyScoreSum;
	}

	@Column(name = "frequency", nullable = false)
	public int getFrequency() {
		return this.frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
