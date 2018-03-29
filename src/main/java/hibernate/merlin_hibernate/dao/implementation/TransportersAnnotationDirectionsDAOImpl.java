package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationDirections;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationDirectionsDAO;


public class TransportersAnnotationDirectionsDAOImpl extends GenericDaoImpl<TransportersAnnotationDirections> implements ITransportersAnnotationDirectionsDAO {

	public TransportersAnnotationDirectionsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationDirections.class);

	}

	public void addTransportersAnnotationDirection(TransportersAnnotationDirections TransportersAnnotationDirection) {
		super.save(TransportersAnnotationDirection);
		
	}

	public void addTransportersAnnotationDirections(List<TransportersAnnotationDirections> TransportersAnnotationDirections) {
		for (TransportersAnnotationDirections TransportersAnnotationDirection: TransportersAnnotationDirections) {
			this.addTransportersAnnotationDirection(TransportersAnnotationDirection);
		}
		
	}

	public List<TransportersAnnotationDirections> getAllTransportersAnnotationDirections() {
		return super.findAll();
	}

	public TransportersAnnotationDirections getTransportersAnnotationDirection(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationDirection(TransportersAnnotationDirections TransportersAnnotationDirection) {
		super.delete(TransportersAnnotationDirection);
		
	}

	public void removeTransportersAnnotationDirections(List<TransportersAnnotationDirections> TransportersAnnotationDirections) {
		for (TransportersAnnotationDirections TransportersAnnotationDirection: TransportersAnnotationDirections) {
			this.removeTransportersAnnotationDirection(TransportersAnnotationDirection);
		}	
		
	}

	public void updateTransportersAnnotationDirections(List<TransportersAnnotationDirections> TransportersAnnotationDirections) {
		for (TransportersAnnotationDirections TransportersAnnotationDirection: TransportersAnnotationDirections) {
			this.update(TransportersAnnotationDirection);
		}
		
	}

	public void updateTransportersAnnotationDirection(TransportersAnnotationDirections TransportersAnnotationDirection) {
		super.update(TransportersAnnotationDirection);
		
	}

}
