package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TransportersAnnotationTcNumbers generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_tc_numbers", catalog = "merlin_basic2")
public class TransportersAnnotationTcNumbers implements java.io.Serializable {

	private TransportersAnnotationTcNumbersId id;
	private int taxonomyDataId;
	private String tcFamily;
	private String tcLocation;
	private String affinity;
	private int generalEquationId;

	public TransportersAnnotationTcNumbers() {
	}

	public TransportersAnnotationTcNumbers(TransportersAnnotationTcNumbersId id, int taxonomyDataId, String tcFamily,
			int generalEquationId) {
		this.id = id;
		this.taxonomyDataId = taxonomyDataId;
		this.tcFamily = tcFamily;
		this.generalEquationId = generalEquationId;
	}

	public TransportersAnnotationTcNumbers(TransportersAnnotationTcNumbersId id, int taxonomyDataId, String tcFamily,
			String tcLocation, String affinity, int generalEquationId) {
		this.id = id;
		this.taxonomyDataId = taxonomyDataId;
		this.tcFamily = tcFamily;
		this.tcLocation = tcLocation;
		this.affinity = affinity;
		this.generalEquationId = generalEquationId;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tcNumber", column = @Column(name = "tc_number", nullable = false, length = 45)),
			@AttributeOverride(name = "tcVersion", column = @Column(name = "tc_version", nullable = false)) })
	public TransportersAnnotationTcNumbersId getId() {
		return this.id;
	}

	public void setId(TransportersAnnotationTcNumbersId id) {
		this.id = id;
	}

	@Column(name = "taxonomy_data_id", nullable = false)
	public int getTaxonomyDataId() {
		return this.taxonomyDataId;
	}

	public void setTaxonomyDataId(int taxonomyDataId) {
		this.taxonomyDataId = taxonomyDataId;
	}

	@Column(name = "tc_family", nullable = false, length = 45)
	public String getTcFamily() {
		return this.tcFamily;
	}

	public void setTcFamily(String tcFamily) {
		this.tcFamily = tcFamily;
	}

	@Column(name = "tc_location", length = 45)
	public String getTcLocation() {
		return this.tcLocation;
	}

	public void setTcLocation(String tcLocation) {
		this.tcLocation = tcLocation;
	}

	@Column(name = "affinity", length = 45)
	public String getAffinity() {
		return this.affinity;
	}

	public void setAffinity(String affinity) {
		this.affinity = affinity;
	}

	@Column(name = "general_equation_id", nullable = false)
	public int getGeneralEquationId() {
		return this.generalEquationId;
	}

	public void setGeneralEquationId(int generalEquationId) {
		this.generalEquationId = generalEquationId;
	}

}
