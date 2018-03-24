package Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelModule generated by hbm2java
 */
@Entity
@Table(name = "model_module", catalog = "merlin_basic2")
public class ModelModule implements java.io.Serializable {

	private Integer id;
	private String reaction;
	private String entryId;
	private String stoichiometry;
	private String name;
	private String definition;
	private String hieralchicalClass;
	private String type;

	public ModelModule() {
	}

	public ModelModule(String reaction, String entryId, String definition, String type) {
		this.reaction = reaction;
		this.entryId = entryId;
		this.definition = definition;
		this.type = type;
	}

	public ModelModule(String reaction, String entryId, String stoichiometry, String name, String definition,
			String hieralchicalClass, String type) {
		this.reaction = reaction;
		this.entryId = entryId;
		this.stoichiometry = stoichiometry;
		this.name = name;
		this.definition = definition;
		this.hieralchicalClass = hieralchicalClass;
		this.type = type;
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

	@Column(name = "reaction", nullable = false, length = 65535)
	public String getReaction() {
		return this.reaction;
	}

	public void setReaction(String reaction) {
		this.reaction = reaction;
	}

	@Column(name = "entry_id", nullable = false, length = 6)
	public String getEntryId() {
		return this.entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	@Column(name = "stoichiometry", length = 45)
	public String getStoichiometry() {
		return this.stoichiometry;
	}

	public void setStoichiometry(String stoichiometry) {
		this.stoichiometry = stoichiometry;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "definition", nullable = false, length = 65535)
	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	@Column(name = "hieralchical_class", length = 65535)
	public String getHieralchicalClass() {
		return this.hieralchicalClass;
	}

	public void setHieralchicalClass(String hieralchicalClass) {
		this.hieralchicalClass = hieralchicalClass;
	}

	@Column(name = "type", nullable = false, length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
