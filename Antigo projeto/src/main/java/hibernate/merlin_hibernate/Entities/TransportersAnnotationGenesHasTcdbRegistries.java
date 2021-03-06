package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TransportersAnnotationGenesHasTcdbRegistries generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_genes_has_tcdb_registries", catalog = "merlin_basic2")
public class TransportersAnnotationGenesHasTcdbRegistries implements java.io.Serializable {

	private TransportersAnnotationGenesHasTcdbRegistriesId id;
	private float similarity;

	public TransportersAnnotationGenesHasTcdbRegistries() {
	}

	public TransportersAnnotationGenesHasTcdbRegistries(TransportersAnnotationGenesHasTcdbRegistriesId id,
			float similarity) {
		this.id = id;
		this.similarity = similarity;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "geneId", column = @Column(name = "gene_id", nullable = false)),
			@AttributeOverride(name = "uniprotId", column = @Column(name = "uniprot_id", nullable = false, length = 45)),
			@AttributeOverride(name = "version", column = @Column(name = "version", nullable = false)) })
	public TransportersAnnotationGenesHasTcdbRegistriesId getId() {
		return this.id;
	}

	public void setId(TransportersAnnotationGenesHasTcdbRegistriesId id) {
		this.id = id;
	}

	@Column(name = "similarity", nullable = false, precision = 12, scale = 0)
	public float getSimilarity() {
		return this.similarity;
	}

	public void setSimilarity(float similarity) {
		this.similarity = similarity;
	}

}
