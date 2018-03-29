package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationSynonyms;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationSynonymsDAO;


public class TransportersAnnotationSynonymsDAOImpl extends GenericDaoImpl<TransportersAnnotationSynonyms> implements ITransportersAnnotationSynonymsDAO {

	public TransportersAnnotationSynonymsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationSynonyms.class);
		
	}

	public void addTransportersAnnotationSynonym(TransportersAnnotationSynonyms TransportersAnnotationSynonym) {
		super.save(TransportersAnnotationSynonym);
		
	}

	public void addTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> TransportersAnnotationSynonyms) {
		for (TransportersAnnotationSynonyms TransportersAnnotationSynonym: TransportersAnnotationSynonyms) {
			this.addTransportersAnnotationSynonym(TransportersAnnotationSynonym);
		}
		
	}

	public List<TransportersAnnotationSynonyms> getAllTransportersAnnotationSynonyms() {
		return super.findAll();
	}

	public TransportersAnnotationSynonyms getTransportersAnnotationSynonym(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationSynonym(TransportersAnnotationSynonyms TransportersAnnotationSynonym) {
		super.delete(TransportersAnnotationSynonym);
		
	}

	public void removeTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> TransportersAnnotationSynonyms) {
		for (TransportersAnnotationSynonyms TransportersAnnotationSynonym: TransportersAnnotationSynonyms) {
			this.removeTransportersAnnotationSynonym(TransportersAnnotationSynonym);
		}
		
	}

	public void updateTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> TransportersAnnotationSynonyms) {
		for (TransportersAnnotationSynonyms TransportersAnnotationSynonym: TransportersAnnotationSynonyms) {
			this.update(TransportersAnnotationSynonym);
		}
		
	}

	public void updateTransportersAnnotationSynonym(TransportersAnnotationSynonyms TransportersAnnotationSynonym) {
		super.update(TransportersAnnotationSynonym);
		
	}

}
