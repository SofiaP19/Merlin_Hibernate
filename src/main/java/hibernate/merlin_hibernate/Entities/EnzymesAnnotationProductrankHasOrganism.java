package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EnzymesAnnotationProductrankHasOrganism generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_productrank_has_organism", catalog = "merlin_basic2")
public class EnzymesAnnotationProductrankHasOrganism implements java.io.Serializable {

	private EnzymesAnnotationProductrankHasOrganismId id;

	public EnzymesAnnotationProductrankHasOrganism() {
	}

	public EnzymesAnnotationProductrankHasOrganism(EnzymesAnnotationProductrankHasOrganismId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "productRankSKey", column = @Column(name = "productRank_s_key", nullable = false)),
			@AttributeOverride(name = "organismSKey", column = @Column(name = "organism_s_key", nullable = false)) })
	public EnzymesAnnotationProductrankHasOrganismId getId() {
		return this.id;
	}

	public void setId(EnzymesAnnotationProductrankHasOrganismId id) {
		this.id = id;
	}

}
