package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.CompartmentsAnnotationPsortReportsHasCompartments;
import hibernate.merlin_hibernate.dao.Interface.ICompartmentsAnnotationPsortReportsHasCompartmentsDAO;


public class CompartmentsAnnotationPsortReportsHasCompartmentsDAOImpl extends GenericDaoImpl<CompartmentsAnnotationPsortReportsHasCompartments> implements ICompartmentsAnnotationPsortReportsHasCompartmentsDAO{

	public CompartmentsAnnotationPsortReportsHasCompartmentsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, CompartmentsAnnotationPsortReportsHasCompartments.class);
		
	}

	public void addCompartmentsAnnotationPsortReportsHasCompartment(CompartmentsAnnotationPsortReportsHasCompartments compartmentsAnnotationPsortReportsHasCompartments) {
		super.save(compartmentsAnnotationPsortReportsHasCompartments);
		
	}

	public void addCompartmentsAnnotationPsortReportsHasCompartments(List<CompartmentsAnnotationPsortReportsHasCompartments> CompartmentsAnnotationPsortReportsHasCompartments) {
		for (CompartmentsAnnotationPsortReportsHasCompartments CompartmentsAnnotationPsortReportsHasCompartment: CompartmentsAnnotationPsortReportsHasCompartments) {
			this.addCompartmentsAnnotationPsortReportsHasCompartment(CompartmentsAnnotationPsortReportsHasCompartment);
		}
		
	}

	public List<CompartmentsAnnotationPsortReportsHasCompartments> getAllCompartmentsAnnotationPsortReportsHasCompartments() {
		return super.findAll();
	}

	public CompartmentsAnnotationPsortReportsHasCompartments getCompartmentsAnnotationPsortReportsHasCompartment(Integer id) {
		return super.findById(id);
	}

	public void removeCompartmentsAnnotationPsortReportsHasCompartment(CompartmentsAnnotationPsortReportsHasCompartments CompartmentsAnnotationPsortReportsHasCompartment) {
		super.delete(CompartmentsAnnotationPsortReportsHasCompartment);
		
		
	}

	public void removeCompartmentsAnnotationPsortReportsHasCompartments(List<CompartmentsAnnotationPsortReportsHasCompartments> CompartmentsAnnotationPsortReportsHasCompartments) {
		for (CompartmentsAnnotationPsortReportsHasCompartments CompartmentsAnnotationPsortReportsHasCompartment: CompartmentsAnnotationPsortReportsHasCompartments) {
			this.removeCompartmentsAnnotationPsortReportsHasCompartment(CompartmentsAnnotationPsortReportsHasCompartment);
		}
		
	}

	public void updateCompartmentsAnnotationPsortReportsHasCompartments(List<CompartmentsAnnotationPsortReportsHasCompartments> CompartmentsAnnotationPsortReportsHasCompartments) {
		for (CompartmentsAnnotationPsortReportsHasCompartments CompartmentsAnnotationPsortReportsHasCompartment: CompartmentsAnnotationPsortReportsHasCompartments) {
			this.update(CompartmentsAnnotationPsortReportsHasCompartment);
		}
		
	}

	public void updateCompartmentsAnnotationPsortReportsHasCompartment(CompartmentsAnnotationPsortReportsHasCompartments CompartmentsAnnotationPsortReportsHasCompartment) {
		super.update(CompartmentsAnnotationPsortReportsHasCompartment);
		
	}


}
