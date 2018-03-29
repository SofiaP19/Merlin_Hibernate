package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTransportTypes;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTransportTypesDAO;


public class TransportersAnnotationTransportTypesDAOImpl extends GenericDaoImpl<TransportersAnnotationTransportTypes> implements ITransportersAnnotationTransportTypesDAO {

	public TransportersAnnotationTransportTypesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTransportTypes.class);
		
	}

	public void addTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes TransportersAnnotationTransportType) {
			super.save(TransportersAnnotationTransportType);
		
	}

	public void addTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> TransportersAnnotationTransportTypes) {
		for (TransportersAnnotationTransportTypes TransportersAnnotationTransportType: TransportersAnnotationTransportTypes) {
			this.addTransportersAnnotationTransportTypes(TransportersAnnotationTransportType);
		}
		
	}

	public List<TransportersAnnotationTransportTypes> getAllTransportersAnnotationTransportTypes() {
		return super.findAll();
	}

	public TransportersAnnotationTransportTypes getTransportersAnnotationTransportTypes(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes TransportersAnnotationTransportType) {
		super.delete(TransportersAnnotationTransportType);
		
	}

	public void removeTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> TransportersAnnotationTransportTypes) {
		for (TransportersAnnotationTransportTypes TransportersAnnotationTransportType: TransportersAnnotationTransportTypes) {
			this.removeTransportersAnnotationTransportTypes(TransportersAnnotationTransportType);
		}
		
	}

	public void updateTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> TransportersAnnotationTransportTypes) {
		for (TransportersAnnotationTransportTypes TransportersAnnotationTransportType: TransportersAnnotationTransportTypes) {
			this.update(TransportersAnnotationTransportType);
		}
		
	}

	public void updateTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes TransportersAnnotationTransportType) {
		super.update(TransportersAnnotationTransportType);
		
	}

}
