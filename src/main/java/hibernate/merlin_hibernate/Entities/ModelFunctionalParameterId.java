package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelFunctionalParameterId generated by hbm2java
 */
@Embeddable
public class ModelFunctionalParameterId implements java.io.Serializable {

	private int compoundIdcompound;
	private int proteinIdprotein;
	private String parameterType;

	public ModelFunctionalParameterId() {
	}

	public ModelFunctionalParameterId(int compoundIdcompound, int proteinIdprotein, String parameterType) {
		this.compoundIdcompound = compoundIdcompound;
		this.proteinIdprotein = proteinIdprotein;
		this.parameterType = parameterType;
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

	@Column(name = "parameter_type", nullable = false, length = 50)
	public String getParameterType() {
		return this.parameterType;
	}

	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelFunctionalParameterId))
			return false;
		ModelFunctionalParameterId castOther = (ModelFunctionalParameterId) other;

		return (this.getCompoundIdcompound() == castOther.getCompoundIdcompound())
				&& (this.getProteinIdprotein() == castOther.getProteinIdprotein())
				&& ((this.getParameterType() == castOther.getParameterType())
						|| (this.getParameterType() != null && castOther.getParameterType() != null
								&& this.getParameterType().equals(castOther.getParameterType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCompoundIdcompound();
		result = 37 * result + this.getProteinIdprotein();
		result = 37 * result + (getParameterType() == null ? 0 : this.getParameterType().hashCode());
		return result;
	}

}
