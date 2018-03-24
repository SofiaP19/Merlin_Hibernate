package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersIdentificationProjects;
import hibernate.merlin_hibernate.dao.Interface.ITransportersIdentificationProjectsDAO;


public class TransportersIdentificationProjectsDAOImpl extends GenericDaoImpl<TransportersIdentificationProjects> implements ITransportersIdentificationProjectsDAO{

	public TransportersIdentificationProjectsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersIdentificationProjects.class);
		
	}

	public void addProject(TransportersIdentificationProjects project) {
		super.save(project);
		
	}

	public void addProjects(List<TransportersIdentificationProjects> projects) {
		for (TransportersIdentificationProjects project: projects) {
			this.addProject(project);
		}
		
	}

	public List<TransportersIdentificationProjects> getAllProjects() {
		return super.findAll();
	}

	public TransportersIdentificationProjects getProject(Integer id) {
		return super.findById(id);
	}

	public void removeProject(TransportersIdentificationProjects project) {
		super.delete(project);
		
	}

	public void removeProjects(List<TransportersIdentificationProjects> projects) {
		for (TransportersIdentificationProjects project: projects) { //percorre cada projecto a eliminar e elimina-o, chamando o método removeProject
			this.removeProject(project);
		}
	}

	public void updateProjects(List<TransportersIdentificationProjects> projects) {
		for (TransportersIdentificationProjects project: projects) {
			this.updateProject(project);
		}
		
	}

	public void updateProject(TransportersIdentificationProjects project) {
		super.update(project);
		
	}

}
