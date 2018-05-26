package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelPathwayHasCompoundId generated by hbm2java
 */
@Embeddable
public class ModelPathwayHasCompoundId implements java.io.Serializable {

	private int pathwayIdpathway;
	private int compoundIdcompound;

	public ModelPathwayHasCompoundId() {
	}

	public ModelPathwayHasCompoundId(int pathwayIdpathway, int compoundIdcompound) {
		this.pathwayIdpathway = pathwayIdpathway;
		this.compoundIdcompound = compoundIdcompound;
	}

	@Column(name = "pathway_idpathway", nullable = false)
	public int getPathwayIdpathway() {
		return this.pathwayIdpathway;
	}

	public void setPathwayIdpathway(int pathwayIdpathway) {
		this.pathwayIdpathway = pathwayIdpathway;
	}

	@Column(name = "compound_idcompound", nullable = false)
	public int getCompoundIdcompound() {
		return this.compoundIdcompound;
	}

	public void setCompoundIdcompound(int compoundIdcompound) {
		this.compoundIdcompound = compoundIdcompound;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelPathwayHasCompoundId))
			return false;
		ModelPathwayHasCompoundId castOther = (ModelPathwayHasCompoundId) other;

		return (this.getPathwayIdpathway() == castOther.getPathwayIdpathway())
				&& (this.getCompoundIdcompound() == castOther.getCompoundIdcompound());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPathwayIdpathway();
		result = 37 * result + this.getCompoundIdcompound();
		return result;
	}

}