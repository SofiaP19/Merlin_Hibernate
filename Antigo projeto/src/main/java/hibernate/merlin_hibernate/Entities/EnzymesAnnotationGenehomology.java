package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EnzymesAnnotationGenehomology generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_genehomology", catalog = "merlin_basic2")
public class EnzymesAnnotationGenehomology implements java.io.Serializable {

	private Integer SKey;
	private int homologySetupSKey;
	private String locusTag;
	private String query;
	private String gene;
	private String chromosome;
	private String organelle;
	private Boolean uniprotStar;
	private String status;
	private String uniprotEcnumber;

	public EnzymesAnnotationGenehomology() {
	}

	public EnzymesAnnotationGenehomology(int homologySetupSKey) {
		this.homologySetupSKey = homologySetupSKey;
	}

	public EnzymesAnnotationGenehomology(int homologySetupSKey, String locusTag, String query, String gene,
			String chromosome, String organelle, Boolean uniprotStar, String status, String uniprotEcnumber) {
		this.homologySetupSKey = homologySetupSKey;
		this.locusTag = locusTag;
		this.query = query;
		this.gene = gene;
		this.chromosome = chromosome;
		this.organelle = organelle;
		this.uniprotStar = uniprotStar;
		this.status = status;
		this.uniprotEcnumber = uniprotEcnumber;
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

	@Column(name = "homologySetup_s_key", nullable = false)
	public int getHomologySetupSKey() {
		return this.homologySetupSKey;
	}

	public void setHomologySetupSKey(int homologySetupSKey) {
		this.homologySetupSKey = homologySetupSKey;
	}

	@Column(name = "locusTag", length = 100)
	public String getLocusTag() {
		return this.locusTag;
	}

	public void setLocusTag(String locusTag) {
		this.locusTag = locusTag;
	}

	@Column(name = "query", length = 45)
	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Column(name = "gene", length = 45)
	public String getGene() {
		return this.gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	@Column(name = "chromosome", length = 20)
	public String getChromosome() {
		return this.chromosome;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	@Column(name = "organelle", length = 45)
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

	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "uniprot_ecnumber", length = 150)
	public String getUniprotEcnumber() {
		return this.uniprotEcnumber;
	}

	public void setUniprotEcnumber(String uniprotEcnumber) {
		this.uniprotEcnumber = uniprotEcnumber;
	}

}
