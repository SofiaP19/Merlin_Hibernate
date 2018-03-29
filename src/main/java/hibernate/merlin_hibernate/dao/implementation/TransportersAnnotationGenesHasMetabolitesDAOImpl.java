package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationGenesHasMetabolites;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationGenesHasMetabolitesDAO;


public class TransportersAnnotationGenesHasMetabolitesDAOImpl extends GenericDaoImpl<TransportersAnnotationGenesHasMetabolites> implements ITransportersAnnotationGenesHasMetabolitesDAO{

	public TransportersAnnotationGenesHasMetabolitesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationGenesHasMetabolites.class);

	}

	public void addTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites TransportersAnnotationGenesHasMetabolite) {
		super.save(TransportersAnnotationGenesHasMetabolite);
		
	}

	public void addTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> TransportersAnnotationGenesHasMetabolites) {
		for (TransportersAnnotationGenesHasMetabolites TransportersAnnotationGenesHasMetabolite: TransportersAnnotationGenesHasMetabolites) {
			this.addTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolite);
		}
		
	}

	public List<TransportersAnnotationGenesHasMetabolites> getAllTransportersAnnotationGenesHasMetabolites() {
		return super.findAll();
	}

	public TransportersAnnotationGenesHasMetabolites getTransportersAnnotationGenesHasMetabolite(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites TransportersAnnotationGenesHasMetabolite) {
		super.delete(TransportersAnnotationGenesHasMetabolite);
		
	}

	public void removeTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> TransportersAnnotationGenesHasMetabolites) {
		for (TransportersAnnotationGenesHasMetabolites TransportersAnnotationGenesHasMetabolite: TransportersAnnotationGenesHasMetabolites) {
			this.removeTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolite);
		}
		
	}

	public void updateTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> TransportersAnnotationGenesHasMetabolites) {
		for (TransportersAnnotationGenesHasMetabolites TransportersAnnotationGenesHasMetabolite: TransportersAnnotationGenesHasMetabolites) {
			this.update(TransportersAnnotationGenesHasMetabolite);
		}
		
	}

	public void updateTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites TransportersAnnotationGenesHasMetabolite) {
		super.update(TransportersAnnotationGenesHasMetabolite);
		
	}

}
