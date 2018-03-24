package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TransportersAnnotationTcdbRegistries generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_tcdb_registries", catalog = "merlin_basic2")
public class TransportersAnnotationTcdbRegistries implements java.io.Serializable {

	private TransportersAnnotationTcdbRegistriesId id;
	private String tcNumber;
	private int tcVersion;
	private Date loadedAt;
	private boolean latestVersion;
	private String status;

	public TransportersAnnotationTcdbRegistries() {
	}

	public TransportersAnnotationTcdbRegistries(TransportersAnnotationTcdbRegistriesId id, String tcNumber,
			int tcVersion, Date loadedAt, boolean latestVersion, String status) {
		this.id = id;
		this.tcNumber = tcNumber;
		this.tcVersion = tcVersion;
		this.loadedAt = loadedAt;
		this.latestVersion = latestVersion;
		this.status = status;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "uniprotId", column = @Column(name = "uniprot_id", nullable = false, length = 45)),
			@AttributeOverride(name = "version", column = @Column(name = "version", nullable = false)) })
	public TransportersAnnotationTcdbRegistriesId getId() {
		return this.id;
	}

	public void setId(TransportersAnnotationTcdbRegistriesId id) {
		this.id = id;
	}

	@Column(name = "tc_number", nullable = false, length = 45)
	public String getTcNumber() {
		return this.tcNumber;
	}

	public void setTcNumber(String tcNumber) {
		this.tcNumber = tcNumber;
	}

	@Column(name = "tc_version", nullable = false)
	public int getTcVersion() {
		return this.tcVersion;
	}

	public void setTcVersion(int tcVersion) {
		this.tcVersion = tcVersion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "loaded_at", nullable = false, length = 19)
	public Date getLoadedAt() {
		return this.loadedAt;
	}

	public void setLoadedAt(Date loadedAt) {
		this.loadedAt = loadedAt;
	}

	@Column(name = "latest_version", nullable = false)
	public boolean isLatestVersion() {
		return this.latestVersion;
	}

	public void setLatestVersion(boolean latestVersion) {
		this.latestVersion = latestVersion;
	}

	@Column(name = "status", nullable = false, length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
