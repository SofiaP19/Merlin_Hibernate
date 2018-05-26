package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * EnzymesAnnotationHomologysetup generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_homologysetup", catalog = "merlin_basic2")
public class EnzymesAnnotationHomologysetup implements java.io.Serializable {

	private Integer SKey;
	private String version;
	private String program;
	private String databaseId;
	private String evalue;
	private String matrix;
	private String wordSize;
	private String gapCosts;
	private Integer maxNumberOfAlignments;

	public EnzymesAnnotationHomologysetup() {
	}

	public EnzymesAnnotationHomologysetup(String program, String databaseId, String evalue, String matrix,
			String wordSize, String gapCosts, Integer maxNumberOfAlignments) {
		this.program = program;
		this.databaseId = databaseId;
		this.evalue = evalue;
		this.matrix = matrix;
		this.wordSize = wordSize;
		this.gapCosts = gapCosts;
		this.maxNumberOfAlignments = maxNumberOfAlignments;
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

	@Version
	@Column(name = "version")
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "program", length = 45)
	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Column(name = "databaseID")
	public String getDatabaseId() {
		return this.databaseId;
	}

	public void setDatabaseId(String databaseId) {
		this.databaseId = databaseId;
	}

	@Column(name = "eValue", length = 45)
	public String getEvalue() {
		return this.evalue;
	}

	public void setEvalue(String evalue) {
		this.evalue = evalue;
	}

	@Column(name = "matrix", length = 45)
	public String getMatrix() {
		return this.matrix;
	}

	public void setMatrix(String matrix) {
		this.matrix = matrix;
	}

	@Column(name = "wordSize", length = 5)
	public String getWordSize() {
		return this.wordSize;
	}

	public void setWordSize(String wordSize) {
		this.wordSize = wordSize;
	}

	@Column(name = "gapCosts", length = 15)
	public String getGapCosts() {
		return this.gapCosts;
	}

	public void setGapCosts(String gapCosts) {
		this.gapCosts = gapCosts;
	}

	@Column(name = "maxNumberOfAlignments")
	public Integer getMaxNumberOfAlignments() {
		return this.maxNumberOfAlignments;
	}

	public void setMaxNumberOfAlignments(Integer maxNumberOfAlignments) {
		this.maxNumberOfAlignments = maxNumberOfAlignments;
	}

}
