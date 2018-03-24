package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersIdentificationProjects;

public interface ITransportersIdentificationProjectsDAO {
	
	public void addProject(TransportersIdentificationProjects project); //adiciona um projeto
	
	public void addProjects(List<TransportersIdentificationProjects> projects); //adiciona projetos
	
	public List<TransportersIdentificationProjects> getAllProjects(); //retorna os projetos
	
	public TransportersIdentificationProjects getProject(Integer id); //retorna um projeto
	
	public void removeProject(TransportersIdentificationProjects project); //remove um projeto
	
	public void removeProjects(List<TransportersIdentificationProjects> project); //remove projetos
	
	public void updateProjects(List<TransportersIdentificationProjects> projects); //update de um projeto
	
	public void updateProject(TransportersIdentificationProjects project);
}
