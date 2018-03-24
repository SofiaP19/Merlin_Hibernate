package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TransportersIdentificationSwHits generated by hbm2java
 */
@Entity
@Table(name = "transporters_identification_sw_hits", catalog = "merlin_basic2")
public class TransportersIdentificationSwHits implements java.io.Serializable {

	private Integer id;
	private String acc;
	private String tcdbId;

	public TransportersIdentificationSwHits() {
	}

	public TransportersIdentificationSwHits(String acc, String tcdbId) {
		this.acc = acc;
		this.tcdbId = tcdbId;
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

	@Column(name = "acc", nullable = false, length = 45)
	public String getAcc() {
		return this.acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	@Column(name = "tcdb_id", nullable = false, length = 45)
	public String getTcdbId() {
		return this.tcdbId;
	}

	public void setTcdbId(String tcdbId) {
		this.tcdbId = tcdbId;
	}

}
