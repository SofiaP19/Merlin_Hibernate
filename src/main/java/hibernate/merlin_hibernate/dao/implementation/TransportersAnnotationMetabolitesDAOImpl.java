package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationMetabolites;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationMetabolitesDAO;


public class TransportersAnnotationMetabolitesDAOImpl extends GenericDaoImpl<TransportersAnnotationMetabolites> implements ITransportersAnnotationMetabolitesDAO{

	public TransportersAnnotationMetabolitesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationMetabolites.class);

	}

	public void addTransportersAnnotationMetabolite(TransportersAnnotationMetabolites TransportersAnnotationMetabolite) {
		super.save(TransportersAnnotationMetabolite);
	}

	public void addTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> TransportersAnnotationMetabolites) {
		for (TransportersAnnotationMetabolites TransportersAnnotationMetabolite: TransportersAnnotationMetabolites) {
			this.addTransportersAnnotationMetabolite(TransportersAnnotationMetabolite);
		}
		
	}

	public List<TransportersAnnotationMetabolites> getAllTransportersAnnotationMetabolites() {
		return super.findAll();
		
	}

	public TransportersAnnotationMetabolites getTransportersAnnotationMetabolite(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationMetabolite(TransportersAnnotationMetabolites TransportersAnnotationMetabolite) {
		super.delete(TransportersAnnotationMetabolite);
		
	}

	public void removeTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> TransportersAnnotationMetabolites) {
		for (TransportersAnnotationMetabolites TransportersAnnotationMetabolite: TransportersAnnotationMetabolites) {
			this.removeTransportersAnnotationMetabolite(TransportersAnnotationMetabolite);
		}
		
	}

	public void updateTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> TransportersAnnotationMetabolites) {
		for (TransportersAnnotationMetabolites TransportersAnnotationMetabolite: TransportersAnnotationMetabolites) {
			this.update(TransportersAnnotationMetabolite);
		}
		
	}

	public void updateTransportersAnnotationMetabolite(TransportersAnnotationMetabolites TransportersAnnotationMetabolite) {
		super.update(TransportersAnnotationMetabolite);
		
	}

}
