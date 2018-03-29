package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTcNumbers;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTcNumbersDAO;


public class TransportersAnnotationTcNumbersDAOImpl extends GenericDaoImpl<TransportersAnnotationTcNumbers> implements ITransportersAnnotationTcNumbersDAO {

	public TransportersAnnotationTcNumbersDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTcNumbers.class);
	
	}

	public void addTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers TransportersAnnotationTcNumber) {
		super.save(TransportersAnnotationTcNumber);
		
	}

	public void addTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> TransportersAnnotationTcNumbers) {
		for (TransportersAnnotationTcNumbers TransportersAnnotationTcNumber: TransportersAnnotationTcNumbers) {
			this.addTransportersAnnotationTcNumber(TransportersAnnotationTcNumber);
		}
		
	}

	public List<TransportersAnnotationTcNumbers> getAllTransportersAnnotationTcNumbers() {
		return super.findAll();
	}

	public TransportersAnnotationTcNumbers getTransportersAnnotationTcNumber(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers TransportersAnnotationTcNumber) {
		super.delete(TransportersAnnotationTcNumber);
		
	}

	public void removeTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> TransportersAnnotationTcNumbers) {
		for (TransportersAnnotationTcNumbers TransportersAnnotationTcNumber: TransportersAnnotationTcNumbers) {
			this.removeTransportersAnnotationTcNumber(TransportersAnnotationTcNumber);
		}
		
	}

	public void updateTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> TransportersAnnotationTcNumbers) {
		for (TransportersAnnotationTcNumbers TransportersAnnotationTcNumber: TransportersAnnotationTcNumbers) {
			this.update(TransportersAnnotationTcNumber);
		}
		
	}

	public void updateTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers TransportersAnnotationTcNumber) {
		super.update(TransportersAnnotationTcNumber);
		
	}

}
