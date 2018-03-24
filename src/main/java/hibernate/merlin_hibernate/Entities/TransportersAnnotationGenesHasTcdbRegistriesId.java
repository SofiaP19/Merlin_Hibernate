package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TransportersAnnotationGenesHasTcdbRegistriesId generated by hbm2java
 */
@Embeddable
public class TransportersAnnotationGenesHasTcdbRegistriesId implements java.io.Serializable {

	private int geneId;
	private String uniprotId;
	private int version;

	public TransportersAnnotationGenesHasTcdbRegistriesId() {
	}

	public TransportersAnnotationGenesHasTcdbRegistriesId(int geneId, String uniprotId, int version) {
		this.geneId = geneId;
		this.uniprotId = uniprotId;
		this.version = version;
	}

	@Column(name = "gene_id", nullable = false)
	public int getGeneId() {
		return this.geneId;
	}

	public void setGeneId(int geneId) {
		this.geneId = geneId;
	}

	@Column(name = "uniprot_id", nullable = false, length = 45)
	public String getUniprotId() {
		return this.uniprotId;
	}

	public void setUniprotId(String uniprotId) {
		this.uniprotId = uniprotId;
	}

	@Column(name = "version", nullable = false)
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TransportersAnnotationGenesHasTcdbRegistriesId))
			return false;
		TransportersAnnotationGenesHasTcdbRegistriesId castOther = (TransportersAnnotationGenesHasTcdbRegistriesId) other;

		return (this.getGeneId() == castOther.getGeneId())
				&& ((this.getUniprotId() == castOther.getUniprotId()) || (this.getUniprotId() != null
						&& castOther.getUniprotId() != null && this.getUniprotId().equals(castOther.getUniprotId())))
				&& (this.getVersion() == castOther.getVersion());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGeneId();
		result = 37 * result + (getUniprotId() == null ? 0 : this.getUniprotId().hashCode());
		result = 37 * result + this.getVersion();
		return result;
	}

}
