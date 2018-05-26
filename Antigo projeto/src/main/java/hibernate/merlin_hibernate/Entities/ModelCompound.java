package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelCompound generated by hbm2java
 */
@Entity
@Table(name = "model_compound", catalog = "merlin_basic2")
public class ModelCompound implements java.io.Serializable {

	private Integer idcompound;
	private String name;
	private String inchi;
	private String keggId;
	private String entryType;
	private String formula;
	private String molecularWeight;
	private String neutralFormula;
	private Short charge;
	private String smiles;
	private Boolean hasBiologicalRoles;

	public ModelCompound() {
	}

	public ModelCompound(String name, String inchi, String keggId, String entryType, String formula,
			String molecularWeight, String neutralFormula, Short charge, String smiles, Boolean hasBiologicalRoles) {
		this.name = name;
		this.inchi = inchi;
		this.keggId = keggId;
		this.entryType = entryType;
		this.formula = formula;
		this.molecularWeight = molecularWeight;
		this.neutralFormula = neutralFormula;
		this.charge = charge;
		this.smiles = smiles;
		this.hasBiologicalRoles = hasBiologicalRoles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idcompound", unique = true, nullable = false)
	public Integer getIdcompound() {
		return this.idcompound;
	}

	public void setIdcompound(Integer idcompound) {
		this.idcompound = idcompound;
	}

	@Column(name = "name", length = 400)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "inchi", length = 1500)
	public String getInchi() {
		return this.inchi;
	}

	public void setInchi(String inchi) {
		this.inchi = inchi;
	}

	@Column(name = "kegg_id", length = 15)
	public String getKeggId() {
		return this.keggId;
	}

	public void setKeggId(String keggId) {
		this.keggId = keggId;
	}

	@Column(name = "entry_type", length = 9)
	public String getEntryType() {
		return this.entryType;
	}

	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}

	@Column(name = "formula", length = 65535)
	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	@Column(name = "molecular_weight", length = 100)
	public String getMolecularWeight() {
		return this.molecularWeight;
	}

	public void setMolecularWeight(String molecularWeight) {
		this.molecularWeight = molecularWeight;
	}

	@Column(name = "neutral_formula", length = 120)
	public String getNeutralFormula() {
		return this.neutralFormula;
	}

	public void setNeutralFormula(String neutralFormula) {
		this.neutralFormula = neutralFormula;
	}

	@Column(name = "charge")
	public Short getCharge() {
		return this.charge;
	}

	public void setCharge(Short charge) {
		this.charge = charge;
	}

	@Column(name = "smiles", length = 1200)
	public String getSmiles() {
		return this.smiles;
	}

	public void setSmiles(String smiles) {
		this.smiles = smiles;
	}

	@Column(name = "hasBiologicalRoles")
	public Boolean getHasBiologicalRoles() {
		return this.hasBiologicalRoles;
	}

	public void setHasBiologicalRoles(Boolean hasBiologicalRoles) {
		this.hasBiologicalRoles = hasBiologicalRoles;
	}

}