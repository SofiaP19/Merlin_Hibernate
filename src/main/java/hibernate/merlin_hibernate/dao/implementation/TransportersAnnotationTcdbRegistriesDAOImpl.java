package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTcdbRegistries;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTcdbRegistriesDAO;

public class TransportersAnnotationTcdbRegistriesDAOImpl extends GenericDaoImpl<TransportersAnnotationTcdbRegistries> implements ITransportersAnnotationTcdbRegistriesDAO{

	public TransportersAnnotationTcdbRegistriesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTcdbRegistries.class);

	}

	public void addTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry) {
		super.save(transportersAnnotationTcdbRegistry);
		
	}

	public void addTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> TransportersAnnotationTcdbRegistries) {
		for (TransportersAnnotationTcdbRegistries TransportersAnnotationTcdbRegistry: TransportersAnnotationTcdbRegistries) {
			this.addTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistry);
		}
		
	}

	public List<TransportersAnnotationTcdbRegistries> getAllTransportersAnnotationTcdbRegistries() {
		return super.findAll();
		
	}
	public TransportersAnnotationTcdbRegistries getTransportersAnnotationTcdbRegistry(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries TransportersAnnotationTcdbRegistry) {
		super.delete(TransportersAnnotationTcdbRegistry);

	}

	public void removeTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> TransportersAnnotationTcdbRegistries) {
		for (TransportersAnnotationTcdbRegistries TransportersAnnotationTcdbRegistry: TransportersAnnotationTcdbRegistries) {
			this.removeTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistry);
		}
		
	}

	public void updateTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> TransportersAnnotationTcdbRegistries) {
		for (TransportersAnnotationTcdbRegistries TransportersAnnotationTcdbRegistry: TransportersAnnotationTcdbRegistries) {
			this.update(TransportersAnnotationTcdbRegistry);
		}
	}

	public void updateTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries TransportersAnnotationTcdbRegistry) {
		super.update(TransportersAnnotationTcdbRegistry);
		
		
		
	}


}
