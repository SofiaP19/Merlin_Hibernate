package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelRegulatoryEventId generated by hbm2java
 */
@Embeddable
public class ModelRegulatoryEventId implements java.io.Serializable {

	private int proteinIdprotein;
	private int promoterIdpromoter;
	private int riFunctionIdriFunction;

	public ModelRegulatoryEventId() {
	}

	public ModelRegulatoryEventId(int proteinIdprotein, int promoterIdpromoter, int riFunctionIdriFunction) {
		this.proteinIdprotein = proteinIdprotein;
		this.promoterIdpromoter = promoterIdpromoter;
		this.riFunctionIdriFunction = riFunctionIdriFunction;
	}

	@Column(name = "protein_idprotein", nullable = false)
	public int getProteinIdprotein() {
		return this.proteinIdprotein;
	}

	public void setProteinIdprotein(int proteinIdprotein) {
		this.proteinIdprotein = proteinIdprotein;
	}

	@Column(name = "promoter_idpromoter", nullable = false)
	public int getPromoterIdpromoter() {
		return this.promoterIdpromoter;
	}

	public void setPromoterIdpromoter(int promoterIdpromoter) {
		this.promoterIdpromoter = promoterIdpromoter;
	}

	@Column(name = "ri_function_idri_function", nullable = false)
	public int getRiFunctionIdriFunction() {
		return this.riFunctionIdriFunction;
	}

	public void setRiFunctionIdriFunction(int riFunctionIdriFunction) {
		this.riFunctionIdriFunction = riFunctionIdriFunction;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelRegulatoryEventId))
			return false;
		ModelRegulatoryEventId castOther = (ModelRegulatoryEventId) other;

		return (this.getProteinIdprotein() == castOther.getProteinIdprotein())
				&& (this.getPromoterIdpromoter() == castOther.getPromoterIdpromoter())
				&& (this.getRiFunctionIdriFunction() == castOther.getRiFunctionIdriFunction());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getProteinIdprotein();
		result = 37 * result + this.getPromoterIdpromoter();
		result = 37 * result + this.getRiFunctionIdriFunction();
		return result;
	}

}
