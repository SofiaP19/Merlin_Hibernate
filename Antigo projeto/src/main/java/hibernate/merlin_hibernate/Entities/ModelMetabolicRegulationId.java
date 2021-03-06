package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelMetabolicRegulationId generated by hbm2java
 */
@Embeddable
public class ModelMetabolicRegulationId implements java.io.Serializable {

	private int compoundIdcompound;
	private int proteinIdprotein;

	public ModelMetabolicRegulationId() {
	}

	public ModelMetabolicRegulationId(int compoundIdcompound, int proteinIdprotein) {
		this.compoundIdcompound = compoundIdcompound;
		this.proteinIdprotein = proteinIdprotein;
	}

	@Column(name = "compound_idcompound", nullable = false)
	public int getCompoundIdcompound() {
		return this.compoundIdcompound;
	}

	public void setCompoundIdcompound(int compoundIdcompound) {
		this.compoundIdcompound = compoundIdcompound;
	}

	@Column(name = "protein_idprotein", nullable = false)
	public int getProteinIdprotein() {
		return this.proteinIdprotein;
	}

	public void setProteinIdprotein(int proteinIdprotein) {
		this.proteinIdprotein = proteinIdprotein;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelMetabolicRegulationId))
			return false;
		ModelMetabolicRegulationId castOther = (ModelMetabolicRegulationId) other;

		return (this.getCompoundIdcompound() == castOther.getCompoundIdcompound())
				&& (this.getProteinIdprotein() == castOther.getProteinIdprotein());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCompoundIdcompound();
		result = 37 * result + this.getProteinIdprotein();
		return result;
	}

}
