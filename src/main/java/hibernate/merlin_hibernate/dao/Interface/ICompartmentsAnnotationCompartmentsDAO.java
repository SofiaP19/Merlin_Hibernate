package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.CompartmentsAnnotationCompartments;


public interface ICompartmentsAnnotationCompartmentsDAO {
	
	public void addCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment); 
	
	public void addCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> CompartmentsAnnotationCompartments); 
	
	public List<CompartmentsAnnotationCompartments> getAllCompartmentsAnnotationCompartments(); 
	
	public CompartmentsAnnotationCompartments getCompartmentsAnnotationCompartment(Integer id); 
	
	public void removeCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment); 
	
	public void removeCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> CompartmentsAnnotationCompartments); 
	
	public void updateCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> CompartmentsAnnotationCompartments); 
	
	public void updateCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment);
}
