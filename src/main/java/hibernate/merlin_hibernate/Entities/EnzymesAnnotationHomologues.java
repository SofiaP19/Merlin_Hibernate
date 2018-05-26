package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EnzymesAnnotationHomologues generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_homologues", catalog = "merlin_basic2")
public class EnzymesAnnotationHomologues implements java.io.Serializable {

	private Integer SKey;
	private int organismSKey;
	private String locusId;
	private String definition;
	private Float calculatedMw;
	private String product;
	private String organelle;
	private Boolean uniprotStar;

	public EnzymesAnnotationHomologues() {
	}

	public EnzymesAnnotationHomologues(int organismSKey) {
		this.organismSKey = organismSKey;
	}

	public EnzymesAnnotationHomologues(int organismSKey, String locusId, String definition, Float calculatedMw,
			String product, String organelle, Boolean uniprotStar) {
		this.organismSKey = organismSKey;
		this.locusId = locusId;
		this.definition = definition;
		this.calculatedMw = calculatedMw;
		this.product = product;
		this.organelle = organelle;
		this.uniprotStar = uniprotStar;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "s_key", unique = true, nullable = false)
	public Integer getSKey() {
		return this.SKey;
	}

	public void setSKey(Integer SKey) {
		this.SKey = SKey;
	}

	@Column(name = "organism_s_key", nullable = false)
	public int getOrganismSKey() {
		return this.organismSKey;
	}

	public void setOrganismSKey(int organismSKey) {
		this.organismSKey = organismSKey;
	}

	@Column(name = "locusID", length = 100)
	public String getLocusId() {
		return this.locusId;
	}

	public void setLocusId(String locusId) {
		this.locusId = locusId;
	}

	@Column(name = "definition", length = 65535)
	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	@Column(name = "calculated_mw", precision = 12, scale = 0)
	public Float getCalculatedMw() {
		return this.calculatedMw;
	}

	public void setCalculatedMw(Float calculatedMw) {
		this.calculatedMw = calculatedMw;
	}

	@Column(name = "product", length = 65535)
	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Column(name = "organelle", length = 100)
	public String getOrganelle() {
		return this.organelle;
	}

	public void setOrganelle(String organelle) {
		this.organelle = organelle;
	}

	@Column(name = "uniprot_star")
	public Boolean getUniprotStar() {
		return this.uniprotStar;
	}

	public void setUniprotStar(Boolean uniprotStar) {
		this.uniprotStar = uniprotStar;
	}

}
