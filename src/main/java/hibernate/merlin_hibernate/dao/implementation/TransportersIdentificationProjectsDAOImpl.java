package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersIdentificationProjects;
import hibernate.merlin_hibernate.dao.Interface.ITransportersIdentificationProjectsDAO;


public class TransportersIdentificationProjectsDAOImpl extends GenericDaoImpl<TransportersIdentificationProjects> implements ITransportersIdentificationProjectsDAO{

	public TransportersIdentificationProjectsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersIdentificationProjects.class);
		
	}

	public void addTransportersIdentificationProject(TransportersIdentificationProjects TransportersIdentificationProject) {
		super.save(TransportersIdentificationProject);
		
	}

	public void addTransportersIdentificationProjects(List<TransportersIdentificationProjects> TransportersIdentificationProjects) {
		for (TransportersIdentificationProjects TransportersIdentificationProject: TransportersIdentificationProjects) {
			this.addTransportersIdentificationProject(TransportersIdentificationProject);
		}
		
	}

	public List<TransportersIdentificationProjects> getAllTransportersIdentificationProjects() {
		return super.findAll();
	}

	public TransportersIdentificationProjects getTransportersIdentificationProject(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersIdentificationProject(TransportersIdentificationProjects TransportersIdentificationProject) {
		super.delete(TransportersIdentificationProject);
		
	}

	public void removeTransportersIdentificationProjects(List<TransportersIdentificationProjects> TransportersIdentificationProjects) {
		for (TransportersIdentificationProjects TransportersIdentificationProject: TransportersIdentificationProjects) {
			this.removeTransportersIdentificationProject(TransportersIdentificationProject);
		}
		
	}

	public void updateTransportersIdentificationProjects(List<TransportersIdentificationProjects> TransportersIdentificationProjects) {
		for (TransportersIdentificationProjects TransportersIdentificationProject: TransportersIdentificationProjects) {
			this.update(TransportersIdentificationProject);
		}
		
	}

	public void updateTransportersIdentificationProject(TransportersIdentificationProjects TransportersIdentificationProject) {
		super.update(TransportersIdentificationProject);
		
	}


}
