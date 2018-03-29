package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.CompartmentsAnnotationPsortReports;



public interface ICompartmentsAnnotationPsortReportsDAO {
	
	public void addCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport); 
	
	public void addCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> CompartmentsAnnotationPsortReports); 
	
	public List<CompartmentsAnnotationPsortReports> getAllCompartmentsAnnotationPsortReports(); 
	
	public CompartmentsAnnotationPsortReports getCompartmentsAnnotationPsortReport(Integer id); 
	
	public void removeCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport); 
	
	public void removeCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> CompartmentsAnnotationPsortReports); 
	
	public void updateCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> CompartmentsAnnotationPsortReports); 
	
	public void updateCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport);
}
