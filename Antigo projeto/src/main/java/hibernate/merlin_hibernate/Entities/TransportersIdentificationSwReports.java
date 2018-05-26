package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TransportersIdentificationSwReports generated by hbm2java
 */
@Entity
@Table(name = "transporters_identification_sw_reports", catalog = "merlin_basic2")
public class TransportersIdentificationSwReports implements java.io.Serializable {

	private Integer id;
	private int projectId;
	private String locusTag;
	private Date date;
	private String matrix;
	private int numberTmd;
	private String status;

	public TransportersIdentificationSwReports() {
	}

	public TransportersIdentificationSwReports(int projectId, String locusTag, Date date, int numberTmd) {
		this.projectId = projectId;
		this.locusTag = locusTag;
		this.date = date;
		this.numberTmd = numberTmd;
	}

	public TransportersIdentificationSwReports(int projectId, String locusTag, Date date, String matrix, int numberTmd,
			String status) {
		this.projectId = projectId;
		this.locusTag = locusTag;
		this.date = date;
		this.matrix = matrix;
		this.numberTmd = numberTmd;
		this.status = status;
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

	@Column(name = "project_id", nullable = false)
	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@Column(name = "locus_tag", nullable = false, length = 100)
	public String getLocusTag() {
		return this.locusTag;
	}

	public void setLocusTag(String locusTag) {
		this.locusTag = locusTag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "matrix", length = 45)
	public String getMatrix() {
		return this.matrix;
	}

	public void setMatrix(String matrix) {
		this.matrix = matrix;
	}

	@Column(name = "number_TMD", nullable = false)
	public int getNumberTmd() {
		return this.numberTmd;
	}

	public void setNumberTmd(int numberTmd) {
		this.numberTmd = numberTmd;
	}

	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}