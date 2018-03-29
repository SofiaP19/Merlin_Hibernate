package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationMetabolites;



public interface ITransportersAnnotationMetabolitesDAO {
	
	public void addTransportersAnnotationMetabolite(TransportersAnnotationMetabolites TransportersAnnotationMetabolite); 
	
	public void addTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> TransportersAnnotationMetabolites); 
	
	public List<TransportersAnnotationMetabolites> getAllTransportersAnnotationMetabolites(); 
	
	public TransportersAnnotationMetabolites getTransportersAnnotationMetabolite(Integer id); 
	
	public void removeTransportersAnnotationMetabolite(TransportersAnnotationMetabolites TransportersAnnotationMetabolite); 
	
	public void removeTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> TransportersAnnotationMetabolites); 
	
	public void updateTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> TransportersAnnotationMetabolites); 
	
	public void updateTransportersAnnotationMetabolite(TransportersAnnotationMetabolites TransportersAnnotationMetabolite);

}
