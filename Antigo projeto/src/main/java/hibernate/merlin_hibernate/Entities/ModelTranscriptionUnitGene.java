package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelTranscriptionUnitGene generated by hbm2java
 */
@Entity
@Table(name = "model_transcription_unit_gene", catalog = "merlin_basic2")
public class ModelTranscriptionUnitGene implements java.io.Serializable {

	private ModelTranscriptionUnitGeneId id;

	public ModelTranscriptionUnitGene() {
	}

	public ModelTranscriptionUnitGene(ModelTranscriptionUnitGeneId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "transcriptionUnitIdtranscriptionUnit", column = @Column(name = "transcription_unit_idtranscription_unit", nullable = false)),
			@AttributeOverride(name = "geneIdgene", column = @Column(name = "gene_idgene", nullable = false)) })
	public ModelTranscriptionUnitGeneId getId() {
		return this.id;
	}

	public void setId(ModelTranscriptionUnitGeneId id) {
		this.id = id;
	}

}