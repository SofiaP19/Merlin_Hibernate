package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EnzymesAnnotationEcnumber generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_ecnumber", catalog = "merlin_basic2")
public class EnzymesAnnotationEcnumber implements java.io.Serializable {

	private Integer SKey;
	private String ecNumber;

	public EnzymesAnnotationEcnumber() {
	}

	public EnzymesAnnotationEcnumber(String ecNumber) {
		this.ecNumber = ecNumber;
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

	@Column(name = "ecNumber", length = 16777215)
	public String getEcNumber() {
		return this.ecNumber;
	}

	public void setEcNumber(String ecNumber) {
		this.ecNumber = ecNumber;
	}

}
