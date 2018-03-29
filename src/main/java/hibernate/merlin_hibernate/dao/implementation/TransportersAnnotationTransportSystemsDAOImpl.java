package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTransportSystems;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTransportSystemsDAO;


public class TransportersAnnotationTransportSystemsDAOImpl extends GenericDaoImpl<TransportersAnnotationTransportSystems> implements ITransportersAnnotationTransportSystemsDAO{

	public TransportersAnnotationTransportSystemsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTransportSystems.class);
		
	}
	public void addTransportersAnnotationTransportSystem(TransportersAnnotationTransportSystems TransportersAnnotationTransportSystem) {
		super.save(TransportersAnnotationTransportSystem);
		
	}

	public void addTransportersAnnotationTransportSystems(List<TransportersAnnotationTransportSystems> TransportersAnnotationTransportSystems) {
		for (TransportersAnnotationTransportSystems TransportersAnnotationTransportType: TransportersAnnotationTransportSystems) {
			this.addTransportersAnnotationTransportSystem(TransportersAnnotationTransportType);
		}
		
	}

	public List<TransportersAnnotationTransportSystems> getAllTransportersAnnotationTransportSystems() {
		return super.findAll();
	}

	public TransportersAnnotationTransportSystems getTransportersAnnotationTransportSystems(Integer id) {
		return super.findById(id);
	}
	public void removeTransportersAnnotationTransportSystem(TransportersAnnotationTransportSystems TransportersAnnotationTransportSystem) {
		super.delete(TransportersAnnotationTransportSystem);
	}


	public void removeTransportersAnnotationTransportSystems(List<TransportersAnnotationTransportSystems> TransportersAnnotationTransportSystems) {
		for (TransportersAnnotationTransportSystems TransportersAnnotationTransportSystem: TransportersAnnotationTransportSystems) {
			this.removeTransportersAnnotationTransportSystem(TransportersAnnotationTransportSystem);
		}
		
	}

	public void updateTransportersAnnotationTransportSystems(List<TransportersAnnotationTransportSystems> TransportersAnnotationTransportSystems) {
		for (hibernate.merlin_hibernate.Entities.TransportersAnnotationTransportSystems TransportersAnnotationTransportType: TransportersAnnotationTransportSystems) {
			this.update(TransportersAnnotationTransportType);
		}
		
	}

	public void updateTransportersAnnotationTransportSystem(TransportersAnnotationTransportSystems TransportersAnnotationTransportSystem) {
		super.update(TransportersAnnotationTransportSystem);
		

	}



}
