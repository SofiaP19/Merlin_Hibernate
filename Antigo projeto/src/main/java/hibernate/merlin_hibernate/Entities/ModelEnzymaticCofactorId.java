package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelEnzymaticCofactorId generated by hbm2java
 */
@Embeddable
public class ModelEnzymaticCofactorId implements java.io.Serializable {

	private int compoundIdcompound;
	private int proteinIdprotein;
	private Boolean prosthetic;

	public ModelEnzymaticCofactorId() {
	}

	public ModelEnzymaticCofactorId(int compoundIdcompound, int proteinIdprotein) {
		this.compoundIdcompound = compoundIdcompound;
		this.proteinIdprotein = proteinIdprotein;
	}

	public ModelEnzymaticCofactorId(int compoundIdcompound, int proteinIdprotein, Boolean prosthetic) {
		this.compoundIdcompound = compoundIdcompound;
		this.proteinIdprotein = proteinIdprotein;
		this.prosthetic = prosthetic;
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

	@Column(name = "prosthetic")
	public Boolean getProsthetic() {
		return this.prosthetic;
	}

	public void setProsthetic(Boolean prosthetic) {
		this.prosthetic = prosthetic;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelEnzymaticCofactorId))
			return false;
		ModelEnzymaticCofactorId castOther = (ModelEnzymaticCofactorId) other;

		return (this.getCompoundIdcompound() == castOther.getCompoundIdcompound())
				&& (this.getProteinIdprotein() == castOther.getProteinIdprotein())
				&& ((this.getProsthetic() == castOther.getProsthetic())
						|| (this.getProsthetic() != null && castOther.getProsthetic() != null
								&& this.getProsthetic().equals(castOther.getProsthetic())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCompoundIdcompound();
		result = 37 * result + this.getProteinIdprotein();
		result = 37 * result + (getProsthetic() == null ? 0 : this.getProsthetic().hashCode());
		return result;
	}

}