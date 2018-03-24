package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelSubunitId generated by hbm2java
 */
@Embeddable
public class ModelSubunitId implements java.io.Serializable {

	private int geneIdgene;
	private int enzymeProteinIdprotein;
	private String enzymeEcnumber;
	private Integer moduleId;
	private Integer proteinComplexIdproteinComplex;
	private String note;
	private String gprStatus;

	public ModelSubunitId() {
	}

	public ModelSubunitId(int geneIdgene, int enzymeProteinIdprotein, String enzymeEcnumber) {
		this.geneIdgene = geneIdgene;
		this.enzymeProteinIdprotein = enzymeProteinIdprotein;
		this.enzymeEcnumber = enzymeEcnumber;
	}

	public ModelSubunitId(int geneIdgene, int enzymeProteinIdprotein, String enzymeEcnumber, Integer moduleId,
			Integer proteinComplexIdproteinComplex, String note, String gprStatus) {
		this.geneIdgene = geneIdgene;
		this.enzymeProteinIdprotein = enzymeProteinIdprotein;
		this.enzymeEcnumber = enzymeEcnumber;
		this.moduleId = moduleId;
		this.proteinComplexIdproteinComplex = proteinComplexIdproteinComplex;
		this.note = note;
		this.gprStatus = gprStatus;
	}

	@Column(name = "gene_idgene", nullable = false)
	public int getGeneIdgene() {
		return this.geneIdgene;
	}

	public void setGeneIdgene(int geneIdgene) {
		this.geneIdgene = geneIdgene;
	}

	@Column(name = "enzyme_protein_idprotein", nullable = false)
	public int getEnzymeProteinIdprotein() {
		return this.enzymeProteinIdprotein;
	}

	public void setEnzymeProteinIdprotein(int enzymeProteinIdprotein) {
		this.enzymeProteinIdprotein = enzymeProteinIdprotein;
	}

	@Column(name = "enzyme_ecnumber", nullable = false, length = 15)
	public String getEnzymeEcnumber() {
		return this.enzymeEcnumber;
	}

	public void setEnzymeEcnumber(String enzymeEcnumber) {
		this.enzymeEcnumber = enzymeEcnumber;
	}

	@Column(name = "module_id")
	public Integer getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "protein_complex_idprotein_complex")
	public Integer getProteinComplexIdproteinComplex() {
		return this.proteinComplexIdproteinComplex;
	}

	public void setProteinComplexIdproteinComplex(Integer proteinComplexIdproteinComplex) {
		this.proteinComplexIdproteinComplex = proteinComplexIdproteinComplex;
	}

	@Column(name = "note", length = 45)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "gpr_status", length = 45)
	public String getGprStatus() {
		return this.gprStatus;
	}

	public void setGprStatus(String gprStatus) {
		this.gprStatus = gprStatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelSubunitId))
			return false;
		ModelSubunitId castOther = (ModelSubunitId) other;

		return (this.getGeneIdgene() == castOther.getGeneIdgene())
				&& (this.getEnzymeProteinIdprotein() == castOther.getEnzymeProteinIdprotein())
				&& ((this.getEnzymeEcnumber() == castOther.getEnzymeEcnumber())
						|| (this.getEnzymeEcnumber() != null && castOther.getEnzymeEcnumber() != null
								&& this.getEnzymeEcnumber().equals(castOther.getEnzymeEcnumber())))
				&& ((this.getModuleId() == castOther.getModuleId()) || (this.getModuleId() != null
						&& castOther.getModuleId() != null && this.getModuleId().equals(castOther.getModuleId())))
				&& ((this.getProteinComplexIdproteinComplex() == castOther.getProteinComplexIdproteinComplex())
						|| (this.getProteinComplexIdproteinComplex() != null
								&& castOther.getProteinComplexIdproteinComplex() != null
								&& this.getProteinComplexIdproteinComplex()
										.equals(castOther.getProteinComplexIdproteinComplex())))
				&& ((this.getNote() == castOther.getNote()) || (this.getNote() != null && castOther.getNote() != null
						&& this.getNote().equals(castOther.getNote())))
				&& ((this.getGprStatus() == castOther.getGprStatus()) || (this.getGprStatus() != null
						&& castOther.getGprStatus() != null && this.getGprStatus().equals(castOther.getGprStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGeneIdgene();
		result = 37 * result + this.getEnzymeProteinIdprotein();
		result = 37 * result + (getEnzymeEcnumber() == null ? 0 : this.getEnzymeEcnumber().hashCode());
		result = 37 * result + (getModuleId() == null ? 0 : this.getModuleId().hashCode());
		result = 37 * result + (getProteinComplexIdproteinComplex() == null ? 0
				: this.getProteinComplexIdproteinComplex().hashCode());
		result = 37 * result + (getNote() == null ? 0 : this.getNote().hashCode());
		result = 37 * result + (getGprStatus() == null ? 0 : this.getGprStatus().hashCode());
		return result;
	}

}
