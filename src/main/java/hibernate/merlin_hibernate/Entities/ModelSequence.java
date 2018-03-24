package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelSequence generated by hbm2java
 */
@Entity
@Table(name = "model_sequence", catalog = "merlin_basic2")
public class ModelSequence implements java.io.Serializable {

	private Integer idsequence;
	private int geneIdgene;
	private String sequenceType;
	private String sequence;
	private Integer sequenceLength;

	public ModelSequence() {
	}

	public ModelSequence(int geneIdgene) {
		this.geneIdgene = geneIdgene;
	}

	public ModelSequence(int geneIdgene, String sequenceType, String sequence, Integer sequenceLength) {
		this.geneIdgene = geneIdgene;
		this.sequenceType = sequenceType;
		this.sequence = sequence;
		this.sequenceLength = sequenceLength;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idsequence", unique = true, nullable = false)
	public Integer getIdsequence() {
		return this.idsequence;
	}

	public void setIdsequence(Integer idsequence) {
		this.idsequence = idsequence;
	}

	@Column(name = "gene_idgene", nullable = false)
	public int getGeneIdgene() {
		return this.geneIdgene;
	}

	public void setGeneIdgene(int geneIdgene) {
		this.geneIdgene = geneIdgene;
	}

	@Column(name = "sequence_type", length = 20)
	public String getSequenceType() {
		return this.sequenceType;
	}

	public void setSequenceType(String sequenceType) {
		this.sequenceType = sequenceType;
	}

	@Column(name = "sequence", length = 65535)
	public String getSequence() {
		return this.sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	@Column(name = "sequence_length")
	public Integer getSequenceLength() {
		return this.sequenceLength;
	}

	public void setSequenceLength(Integer sequenceLength) {
		this.sequenceLength = sequenceLength;
	}

}