package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTransportTypes;


public interface ITransportersAnnotationTransportTypesDAO {

	public void addTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes TransportersAnnotationTransportType); //adiciona um projeto
	
	public void addTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> TransportersAnnotationTransportTypes); //adiciona projetos
	
	public List<TransportersAnnotationTransportTypes> getAllTransportersAnnotationTransportTypes(); //retorna os projetos
	
	public TransportersAnnotationTransportTypes getTransportersAnnotationTransportTypes(Integer id); //retorna um projeto
	
	public void removeTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes TransportersAnnotationTransportType); //remove um projeto
	
	public void removeTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> TransportersAnnotationTransportType); //remove projetos
	
	public void updateTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> TransportersAnnotationTransportTypes); //update de um projeto
	
	public void updateTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes TransportersAnnotationTransportType);
}
