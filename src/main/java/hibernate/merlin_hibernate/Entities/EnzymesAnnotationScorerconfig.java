package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EnzymesAnnotationScorerconfig generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_scorerconfig", catalog = "merlin_basic2")
public class EnzymesAnnotationScorerconfig implements java.io.Serializable {

	private EnzymesAnnotationScorerconfigId id;

	public EnzymesAnnotationScorerconfig() {
	}

	public EnzymesAnnotationScorerconfig(EnzymesAnnotationScorerconfigId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "threshold", column = @Column(name = "threshold", nullable = false, precision = 12, scale = 0)),
			@AttributeOverride(name = "balanceBh", column = @Column(name = "balanceBH", nullable = false, precision = 12, scale = 0)),
			@AttributeOverride(name = "alpha", column = @Column(name = "alpha", nullable = false, precision = 12, scale = 0)),
			@AttributeOverride(name = "beta", column = @Column(name = "beta", nullable = false, precision = 12, scale = 0)),
			@AttributeOverride(name = "minHomologies", column = @Column(name = "minHomologies", nullable = false)),
			@AttributeOverride(name = "blastDb", column = @Column(name = "blastDB", nullable = false, length = 45)),
			@AttributeOverride(name = "latest", column = @Column(name = "latest", nullable = false)),
			@AttributeOverride(name = "bestAlpha", column = @Column(name = "bestAlpha", nullable = false)) })
	public EnzymesAnnotationScorerconfigId getId() {
		return this.id;
	}

	public void setId(EnzymesAnnotationScorerconfigId id) {
		this.id = id;
	}

}
