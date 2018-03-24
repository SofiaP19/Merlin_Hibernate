package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CompartmentsAnnotationPsortReportsHasCompartmentsId generated by hbm2java
 */
@Embeddable
public class CompartmentsAnnotationPsortReportsHasCompartmentsId implements java.io.Serializable {

	private int psortReportId;
	private int compartmentId;

	public CompartmentsAnnotationPsortReportsHasCompartmentsId() {
	}

	public CompartmentsAnnotationPsortReportsHasCompartmentsId(int psortReportId, int compartmentId) {
		this.psortReportId = psortReportId;
		this.compartmentId = compartmentId;
	}

	@Column(name = "psort_report_id", nullable = false)
	public int getPsortReportId() {
		return this.psortReportId;
	}

	public void setPsortReportId(int psortReportId) {
		this.psortReportId = psortReportId;
	}

	@Column(name = "compartment_id", nullable = false)
	public int getCompartmentId() {
		return this.compartmentId;
	}

	public void setCompartmentId(int compartmentId) {
		this.compartmentId = compartmentId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CompartmentsAnnotationPsortReportsHasCompartmentsId))
			return false;
		CompartmentsAnnotationPsortReportsHasCompartmentsId castOther = (CompartmentsAnnotationPsortReportsHasCompartmentsId) other;

		return (this.getPsortReportId() == castOther.getPsortReportId())
				&& (this.getCompartmentId() == castOther.getCompartmentId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPsortReportId();
		result = 37 * result + this.getCompartmentId();
		return result;
	}

}