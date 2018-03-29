package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationGenesHasTcdbRegistries;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationGenesHasTcdbRegistriesDAO;


public class TransportersAnnotationGenesHasTcdbRegistriesDAOImpl extends GenericDaoImpl<TransportersAnnotationGenesHasTcdbRegistries> implements ITransportersAnnotationGenesHasTcdbRegistriesDAO{

	public TransportersAnnotationGenesHasTcdbRegistriesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationGenesHasTcdbRegistries.class);
	
	}

	public void addTransportersAnnotationGenesHasTcdbRegistry(TransportersAnnotationGenesHasTcdbRegistries TransportersAnnotationGenesHasTcdbRegistry) {
		super.save(TransportersAnnotationGenesHasTcdbRegistry);
		
	}

	public void addTransportersAnnotationGenesHasTcdbRegistries(List<TransportersAnnotationGenesHasTcdbRegistries> TransportersAnnotationGenesHasTcdbRegistries) {
		for (TransportersAnnotationGenesHasTcdbRegistries TransportersAnnotationGenesHasTcdbRegistry: TransportersAnnotationGenesHasTcdbRegistries) {
			this.addTransportersAnnotationGenesHasTcdbRegistry(TransportersAnnotationGenesHasTcdbRegistry);
		}
		
	}

	public List<TransportersAnnotationGenesHasTcdbRegistries> getAllTransportersAnnotationGenesHasTcdbRegistries() {
		return super.findAll();
	}

	public TransportersAnnotationGenesHasTcdbRegistries getTransportersAnnotationGenesHasTcdbRegistry(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationGenesHasTcdbRegistry(TransportersAnnotationGenesHasTcdbRegistries TransportersAnnotationGenesHasTcdbRegistry) {
		super.delete(TransportersAnnotationGenesHasTcdbRegistry);
		
	}

	public void removeTransportersAnnotationGenesHasTcdbRegistries(List<TransportersAnnotationGenesHasTcdbRegistries> TransportersAnnotationGenesHasTcdbRegistries) {
		for (TransportersAnnotationGenesHasTcdbRegistries TransportersAnnotationGenesHasTcdbRegistry: TransportersAnnotationGenesHasTcdbRegistries) {
			this.removeTransportersAnnotationGenesHasTcdbRegistry(TransportersAnnotationGenesHasTcdbRegistry);
		}
		
	}

	public void updateTransportersAnnotationGenesHasTcdbRegistries(List<TransportersAnnotationGenesHasTcdbRegistries> TransportersAnnotationGenesHasTcdbRegistries) {
		for (TransportersAnnotationGenesHasTcdbRegistries TransportersAnnotationGenesHasTcdbRegistry: TransportersAnnotationGenesHasTcdbRegistries) {
			this.update(TransportersAnnotationGenesHasTcdbRegistry);
		}
	}

	public void updateTransportersAnnotationGenesHasTcdbRegistry(TransportersAnnotationGenesHasTcdbRegistries TransportersAnnotationGenesHasTcdbRegistry) {
		super.update(TransportersAnnotationGenesHasTcdbRegistry);
		
	}

}
