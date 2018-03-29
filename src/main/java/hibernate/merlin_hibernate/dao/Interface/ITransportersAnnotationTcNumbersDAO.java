package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTcNumbers;



public interface ITransportersAnnotationTcNumbersDAO {
	
	public void addTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers TransportersAnnotationTcNumber); 
	
	public void addTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> TransportersAnnotationTcNumbers); 
	
	public List<TransportersAnnotationTcNumbers> getAllTransportersAnnotationTcNumbers(); 
	
	public TransportersAnnotationTcNumbers getTransportersAnnotationTcNumber(Integer id); 
	
	public void removeTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers TransportersAnnotationTcNumber); 
	
	public void removeTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> TransportersAnnotationTcNumber); 
	
	public void updateTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> TransportersAnnotationTcNumber); 
	
	public void updateTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers TransportersAnnotationTcNumber);

}
