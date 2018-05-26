package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * InterproInterproResults generated by hbm2java
 */
@Entity
@Table(name = "interpro_interpro_results", catalog = "merlin_basic2")
public class InterproInterproResults implements java.io.Serializable {

	private Integer id;
	private String query;
	private String querySequence;
	private String mostLikelyEc;
	private String mostLikelyLocalization;
	private String mostLikelyName;
	private String status;
	private Set<InterproInterproResult> interproInterproResults = new HashSet<InterproInterproResult>(0);

	public InterproInterproResults() {
	}

	public InterproInterproResults(String query, String querySequence) {
		this.query = query;
		this.querySequence = querySequence;
	}

	public InterproInterproResults(String query, String querySequence, String mostLikelyEc,
			String mostLikelyLocalization, String mostLikelyName, String status,
			Set<InterproInterproResult> interproInterproResults) {
		this.query = query;
		this.querySequence = querySequence;
		this.mostLikelyEc = mostLikelyEc;
		this.mostLikelyLocalization = mostLikelyLocalization;
		this.mostLikelyName = mostLikelyName;
		this.status = status;
		this.interproInterproResults = interproInterproResults;
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

	@Column(name = "query", nullable = false, length = 45)
	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Column(name = "querySequence", nullable = false)
	public String getQuerySequence() {
		return this.querySequence;
	}

	public void setQuerySequence(String querySequence) {
		this.querySequence = querySequence;
	}

	@Column(name = "mostLikelyEc", length = 45)
	public String getMostLikelyEc() {
		return this.mostLikelyEc;
	}

	public void setMostLikelyEc(String mostLikelyEc) {
		this.mostLikelyEc = mostLikelyEc;
	}

	@Column(name = "mostLikelyLocalization", length = 45)
	public String getMostLikelyLocalization() {
		return this.mostLikelyLocalization;
	}

	public void setMostLikelyLocalization(String mostLikelyLocalization) {
		this.mostLikelyLocalization = mostLikelyLocalization;
	}

	@Column(name = "mostLikelyName", length = 250)
	public String getMostLikelyName() {
		return this.mostLikelyName;
	}

	public void setMostLikelyName(String mostLikelyName) {
		this.mostLikelyName = mostLikelyName;
	}

	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interproInterproResults")
	public Set<InterproInterproResult> getInterproInterproResults() {
		return this.interproInterproResults;
	}

	public void setInterproInterproResults(Set<InterproInterproResult> interproInterproResults) {
		this.interproInterproResults = interproInterproResults;
	}

}
