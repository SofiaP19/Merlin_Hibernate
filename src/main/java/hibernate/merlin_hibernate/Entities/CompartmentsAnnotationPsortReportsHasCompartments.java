package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CompartmentsAnnotationPsortReportsHasCompartments generated by hbm2java
 */
@Entity
@Table(name = "compartments_annotation_psort_reports_has_compartments", catalog = "merlin_basic2")
public class CompartmentsAnnotationPsortReportsHasCompartments implements java.io.Serializable {

	private CompartmentsAnnotationPsortReportsHasCompartmentsId id;
	private Float score;

	public CompartmentsAnnotationPsortReportsHasCompartments() {
	}

	public CompartmentsAnnotationPsortReportsHasCompartments(CompartmentsAnnotationPsortReportsHasCompartmentsId id) {
		this.id = id;
	}

	public CompartmentsAnnotationPsortReportsHasCompartments(CompartmentsAnnotationPsortReportsHasCompartmentsId id,
			Float score) {
		this.id = id;
		this.score = score;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "psortReportId", column = @Column(name = "psort_report_id", nullable = false)),
			@AttributeOverride(name = "compartmentId", column = @Column(name = "compartment_id", nullable = false)) })
	public CompartmentsAnnotationPsortReportsHasCompartmentsId getId() {
		return this.id;
	}

	public void setId(CompartmentsAnnotationPsortReportsHasCompartmentsId id) {
		this.id = id;
	}

	@Column(name = "score", precision = 12, scale = 0)
	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

}