package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnzymesAnnotationFastasequenceId generated by hbm2java
 */
@Embeddable
public class EnzymesAnnotationFastasequenceId implements java.io.Serializable {

	private int SKey;
	private int geneHomologySKey;

	public EnzymesAnnotationFastasequenceId() {
	}

	public EnzymesAnnotationFastasequenceId(int SKey, int geneHomologySKey) {
		this.SKey = SKey;
		this.geneHomologySKey = geneHomologySKey;
	}

	@Column(name = "s_key", nullable = false)
	public int getSKey() {
		return this.SKey;
	}

	public void setSKey(int SKey) {
		this.SKey = SKey;
	}

	@Column(name = "geneHomology_s_key", nullable = false)
	public int getGeneHomologySKey() {
		return this.geneHomologySKey;
	}

	public void setGeneHomologySKey(int geneHomologySKey) {
		this.geneHomologySKey = geneHomologySKey;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EnzymesAnnotationFastasequenceId))
			return false;
		EnzymesAnnotationFastasequenceId castOther = (EnzymesAnnotationFastasequenceId) other;

		return (this.getSKey() == castOther.getSKey())
				&& (this.getGeneHomologySKey() == castOther.getGeneHomologySKey());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSKey();
		result = 37 * result + this.getGeneHomologySKey();
		return result;
	}

}
