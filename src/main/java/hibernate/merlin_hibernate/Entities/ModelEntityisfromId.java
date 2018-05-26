package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelEntityisfromId generated by hbm2java
 */
@Embeddable
public class ModelEntityisfromId implements java.io.Serializable {

	private int strainIdstrain;
	private Integer wid;

	public ModelEntityisfromId() {
	}

	public ModelEntityisfromId(int strainIdstrain) {
		this.strainIdstrain = strainIdstrain;
	}

	public ModelEntityisfromId(int strainIdstrain, Integer wid) {
		this.strainIdstrain = strainIdstrain;
		this.wid = wid;
	}

	@Column(name = "strain_idstrain", nullable = false)
	public int getStrainIdstrain() {
		return this.strainIdstrain;
	}

	public void setStrainIdstrain(int strainIdstrain) {
		this.strainIdstrain = strainIdstrain;
	}

	@Column(name = "wid")
	public Integer getWid() {
		return this.wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelEntityisfromId))
			return false;
		ModelEntityisfromId castOther = (ModelEntityisfromId) other;

		return (this.getStrainIdstrain() == castOther.getStrainIdstrain()) && ((this.getWid() == castOther.getWid())
				|| (this.getWid() != null && castOther.getWid() != null && this.getWid().equals(castOther.getWid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getStrainIdstrain();
		result = 37 * result + (getWid() == null ? 0 : this.getWid().hashCode());
		return result;
	}

}
