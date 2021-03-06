package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelAliases generated by hbm2java
 */
@Entity
@Table(name = "model_aliases", catalog = "merlin_basic2")
public class ModelAliases implements java.io.Serializable {

	private ModelAliasesId id;
	private String alias;

	public ModelAliases() {
	}

	public ModelAliases(ModelAliasesId id, String alias) {
		this.id = id;
		this.alias = alias;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idalias", column = @Column(name = "idalias", nullable = false)),
			@AttributeOverride(name = "class_", column = @Column(name = "class", nullable = false, length = 2)),
			@AttributeOverride(name = "entity", column = @Column(name = "entity", nullable = false)) })
	public ModelAliasesId getId() {
		return this.id;
	}

	public void setId(ModelAliasesId id) {
		this.id = id;
	}

	@Column(name = "alias", nullable = false, length = 1200)
	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
