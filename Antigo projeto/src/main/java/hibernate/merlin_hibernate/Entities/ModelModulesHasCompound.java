package hibernate.merlin_hibernate.Entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelModulesHasCompound generated by hbm2java
 */
@Entity
@Table(name = "model_modules_has_compound", catalog = "merlin_basic2")
public class ModelModulesHasCompound implements java.io.Serializable {

	private ModelModulesHasCompoundId id;

	public ModelModulesHasCompound() {
	}

	public ModelModulesHasCompound(ModelModulesHasCompoundId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "modulesId", column = @Column(name = "modules_id", nullable = false)),
			@AttributeOverride(name = "compoundIdcompound", column = @Column(name = "compound_idcompound", nullable = false)) })
	public ModelModulesHasCompoundId getId() {
		return this.id;
	}

	public void setId(ModelModulesHasCompoundId id) {
		this.id = id;
	}

}