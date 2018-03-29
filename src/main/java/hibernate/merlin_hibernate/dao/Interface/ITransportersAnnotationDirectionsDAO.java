package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationDirections;


public interface ITransportersAnnotationDirectionsDAO {
	
	public void addTransportersAnnotationDirection(TransportersAnnotationDirections TransportersAnnotationDirection); 
	
	public void addTransportersAnnotationDirections(List<TransportersAnnotationDirections> TransportersAnnotationDirections); 
	
	public List<TransportersAnnotationDirections> getAllTransportersAnnotationDirections(); 
	
	public TransportersAnnotationDirections getTransportersAnnotationDirection(Integer id); 
	
	public void removeTransportersAnnotationDirection(TransportersAnnotationDirections TransportersAnnotationDirection); 
	
	public void removeTransportersAnnotationDirections(List<TransportersAnnotationDirections> TransportersAnnotationDirections); 
	
	public void updateTransportersAnnotationDirections(List<TransportersAnnotationDirections> TransportersAnnotationDirections); 
	
	public void updateTransportersAnnotationDirection(TransportersAnnotationDirections TransportersAnnotationDirection);
}
