package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TransportersAnnotationTcdbRegistriesId generated by hbm2java
 */
@Embeddable
public class TransportersAnnotationTcdbRegistriesId implements java.io.Serializable {

	private String uniprotId;
	private int version;

	public TransportersAnnotationTcdbRegistriesId() {
	}

	public TransportersAnnotationTcdbRegistriesId(String uniprotId, int version) {
		this.uniprotId = uniprotId;
		this.version = version;
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
		if (!(other instanceof TransportersAnnotationTcdbRegistriesId))
			return false;
		TransportersAnnotationTcdbRegistriesId castOther = (TransportersAnnotationTcdbRegistriesId) other;

		return ((this.getUniprotId() == castOther.getUniprotId()) || (this.getUniprotId() != null
				&& castOther.getUniprotId() != null && this.getUniprotId().equals(castOther.getUniprotId())))
				&& (this.getVersion() == castOther.getVersion());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUniprotId() == null ? 0 : this.getUniprotId().hashCode());
		result = 37 * result + this.getVersion();
		return result;
	}

}
