package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.CompartmentsAnnotationCompartments;
import hibernate.merlin_hibernate.dao.Interface.ICompartmentsAnnotationCompartmentsDAO;


public class CompartmentsAnnotationCompartmentsDAOImpl extends GenericDaoImpl<CompartmentsAnnotationCompartments> implements ICompartmentsAnnotationCompartmentsDAO{

	public CompartmentsAnnotationCompartmentsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, CompartmentsAnnotationCompartments.class);
		
	}

	public void addCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment) {
		super.save(CompartmentsAnnotationCompartment);
		
	}

	public void addCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> CompartmentsAnnotationCompartments) {
		for (CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment: CompartmentsAnnotationCompartments) {
			this.addCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartment);
		}
		
	}

	public List<CompartmentsAnnotationCompartments> getAllCompartmentsAnnotationCompartments() {
		return super.findAll();
	}

	public CompartmentsAnnotationCompartments getCompartmentsAnnotationCompartment(Integer id) {
		return super.findById(id);
	}

	public void removeCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment) {
		super.delete(CompartmentsAnnotationCompartment);
		
	}

	public void removeCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> CompartmentsAnnotationCompartments) {
		for (CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment: CompartmentsAnnotationCompartments) {
			this.removeCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartment);
		}
		
	}

	public void updateCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> CompartmentsAnnotationCompartments) {
		for (CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment: CompartmentsAnnotationCompartments) {
			this.update(CompartmentsAnnotationCompartment);
		}
		
	}

	public void updateCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment) {
		super.update(CompartmentsAnnotationCompartment);
		
	}

}
