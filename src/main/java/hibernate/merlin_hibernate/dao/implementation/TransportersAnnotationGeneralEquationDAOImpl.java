package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationGeneralEquation;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationGeneralEquationDAO;


public class TransportersAnnotationGeneralEquationDAOImpl extends GenericDaoImpl<TransportersAnnotationGeneralEquation> implements ITransportersAnnotationGeneralEquationDAO{

	public TransportersAnnotationGeneralEquationDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationGeneralEquation.class);

	}

	public void addTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation TransportersAnnotationGeneralEquation) {
		super.save(TransportersAnnotationGeneralEquation);
		
	}

	public void addTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> TransportersAnnotationGeneralEquations) {
		for (TransportersAnnotationGeneralEquation TransportersAnnotationGeneralEquation: TransportersAnnotationGeneralEquations) {
			this.addTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation);
		}
		
	}

	public List<TransportersAnnotationGeneralEquation> getAllTransportersAnnotationGeneralEquations() {
		return super.findAll();
	}

	public TransportersAnnotationGeneralEquation getTransportersAnnotationGeneralEquation(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation TransportersAnnotationGeneralEquation) {
		super.delete(TransportersAnnotationGeneralEquation);
		
	}

	public void removeTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> TransportersAnnotationGeneralEquations) {
		for (TransportersAnnotationGeneralEquation TransportersAnnotationGeneralEquation: TransportersAnnotationGeneralEquations) {
			this.removeTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation);
		}
		
	}

	public void updateTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> TransportersAnnotationGeneralEquations) {
		for (TransportersAnnotationGeneralEquation TransportersAnnotationGeneralEquation: TransportersAnnotationGeneralEquations) {
			this.update(TransportersAnnotationGeneralEquation);
		}
		
	}

	public void updateTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation TransportersAnnotationGeneralEquation) {
		super.update(TransportersAnnotationGeneralEquation);
		
	}

}
