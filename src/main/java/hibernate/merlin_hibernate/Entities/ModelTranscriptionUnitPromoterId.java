package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelTranscriptionUnitPromoterId generated by hbm2java
 */
@Embeddable
public class ModelTranscriptionUnitPromoterId implements java.io.Serializable {

	private int promoterIdpromoter;
	private int transcriptionUnitIdtranscriptionUnit;

	public ModelTranscriptionUnitPromoterId() {
	}

	public ModelTranscriptionUnitPromoterId(int promoterIdpromoter, int transcriptionUnitIdtranscriptionUnit) {
		this.promoterIdpromoter = promoterIdpromoter;
		this.transcriptionUnitIdtranscriptionUnit = transcriptionUnitIdtranscriptionUnit;
	}

	@Column(name = "promoter_idpromoter", nullable = false)
	public int getPromoterIdpromoter() {
		return this.promoterIdpromoter;
	}

	public void setPromoterIdpromoter(int promoterIdpromoter) {
		this.promoterIdpromoter = promoterIdpromoter;
	}

	@Column(name = "transcription_unit_idtranscription_unit", nullable = false)
	public int getTranscriptionUnitIdtranscriptionUnit() {
		return this.transcriptionUnitIdtranscriptionUnit;
	}

	public void setTranscriptionUnitIdtranscriptionUnit(int transcriptionUnitIdtranscriptionUnit) {
		this.transcriptionUnitIdtranscriptionUnit = transcriptionUnitIdtranscriptionUnit;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelTranscriptionUnitPromoterId))
			return false;
		ModelTranscriptionUnitPromoterId castOther = (ModelTranscriptionUnitPromoterId) other;

		return (this.getPromoterIdpromoter() == castOther.getPromoterIdpromoter()) && (this
				.getTranscriptionUnitIdtranscriptionUnit() == castOther.getTranscriptionUnitIdtranscriptionUnit());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPromoterIdpromoter();
		result = 37 * result + this.getTranscriptionUnitIdtranscriptionUnit();
		return result;
	}

}
