package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TransportersAnnotationMetabolites generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_metabolites", catalog = "merlin_basic2")
public class TransportersAnnotationMetabolites implements java.io.Serializable {

	private Integer id;
	private String name;
	private String keggMiriam;
	private String keggName;
	private String chebiMiriam;
	private String chebiName;
	private String datatype;
	private String keggFormula;
	private String chebiFormula;

	public TransportersAnnotationMetabolites() {
	}

	public TransportersAnnotationMetabolites(String name, String datatype) {
		this.name = name;
		this.datatype = datatype;
	}

	public TransportersAnnotationMetabolites(String name, String keggMiriam, String keggName, String chebiMiriam,
			String chebiName, String datatype, String keggFormula, String chebiFormula) {
		this.name = name;
		this.keggMiriam = keggMiriam;
		this.keggName = keggName;
		this.chebiMiriam = chebiMiriam;
		this.chebiName = chebiName;
		this.datatype = datatype;
		this.keggFormula = keggFormula;
		this.chebiFormula = chebiFormula;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 500)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "kegg_miriam", length = 100)
	public String getKeggMiriam() {
		return this.keggMiriam;
	}

	public void setKeggMiriam(String keggMiriam) {
		this.keggMiriam = keggMiriam;
	}

	@Column(name = "kegg_name", length = 500)
	public String getKeggName() {
		return this.keggName;
	}

	public void setKeggName(String keggName) {
		this.keggName = keggName;
	}

	@Column(name = "chebi_miriam", length = 100)
	public String getChebiMiriam() {
		return this.chebiMiriam;
	}

	public void setChebiMiriam(String chebiMiriam) {
		this.chebiMiriam = chebiMiriam;
	}

	@Column(name = "chebi_name", length = 500)
	public String getChebiName() {
		return this.chebiName;
	}

	public void setChebiName(String chebiName) {
		this.chebiName = chebiName;
	}

	@Column(name = "datatype", nullable = false, length = 45)
	public String getDatatype() {
		return this.datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	@Column(name = "kegg_formula", length = 45)
	public String getKeggFormula() {
		return this.keggFormula;
	}

	public void setKeggFormula(String keggFormula) {
		this.keggFormula = keggFormula;
	}

	@Column(name = "chebi_formula", length = 45)
	public String getChebiFormula() {
		return this.chebiFormula;
	}

	public void setChebiFormula(String chebiFormula) {
		this.chebiFormula = chebiFormula;
	}

}
