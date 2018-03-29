package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationMetabolitesOntology;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationMetabolitesOntologyDAO;


public class TransportersAnnotationMetabolitesOntologyDAOImpl extends GenericDaoImpl<TransportersAnnotationMetabolitesOntology> implements ITransportersAnnotationMetabolitesOntologyDAO{

	public TransportersAnnotationMetabolitesOntologyDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationMetabolitesOntology.class);
		
	}

	public void addTransportersAnnotationMetabolitesOntology(TransportersAnnotationMetabolitesOntology TransportersAnnotationMetabolitesOntology) {
		super.save(TransportersAnnotationMetabolitesOntology);
		
	}

	public void addTTransportersAnnotationMetabolitesOntologyList(List<TransportersAnnotationMetabolitesOntology> TransportersAnnotationMetabolitesOntologyList) {
		for (TransportersAnnotationMetabolitesOntology TransportersAnnotationMetabolitesOntology: TransportersAnnotationMetabolitesOntologyList) {
			this.addTransportersAnnotationMetabolitesOntology(TransportersAnnotationMetabolitesOntology);
		}
		
	}

	public List<TransportersAnnotationMetabolitesOntology> getAllTransportersAnnotationMetabolitesOntology() {
		return super.findAll();
	}

	public TransportersAnnotationMetabolitesOntology getTransportersAnnotationMetabolitesOntology(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationMetabolitesOntology(TransportersAnnotationMetabolitesOntology TransportersAnnotationMetabolitesOntology) {
		super.delete(TransportersAnnotationMetabolitesOntology);
		
	}

	public void removeTransportersAnnotationMetabolitesOntologyList(List<TransportersAnnotationMetabolitesOntology> TransportersAnnotationMetabolitesOntologyList) {
		for (TransportersAnnotationMetabolitesOntology TransportersAnnotationMetabolitesOntology: TransportersAnnotationMetabolitesOntologyList) {
			this.removeTransportersAnnotationMetabolitesOntology(TransportersAnnotationMetabolitesOntology);
		}
		
	}

	public void updateTransportersAnnotationMetabolitesOntologyList(List<TransportersAnnotationMetabolitesOntology> TransportersAnnotationMetabolitesOntologyList) {
		for (TransportersAnnotationMetabolitesOntology TransportersAnnotationMetabolitesOntology: TransportersAnnotationMetabolitesOntologyList) {
			this.update(TransportersAnnotationMetabolitesOntology);
		}
		
	}

	public void updateTransportersAnnotationMetabolitesOntology(TransportersAnnotationMetabolitesOntology TransportersAnnotationMetabolitesOntology) {
		super.update(TransportersAnnotationMetabolitesOntology);
		
	}


}
